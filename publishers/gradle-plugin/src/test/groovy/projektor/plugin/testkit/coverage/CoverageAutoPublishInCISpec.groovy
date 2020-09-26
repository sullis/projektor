package projektor.plugin.testkit.coverage

import projektor.plugin.testkit.SingleProjectSpec

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS
import static projektor.plugin.CodeUnderTestWriter.writePartialCoverageSpecFile
import static projektor.plugin.CodeUnderTestWriter.writeSourceCodeFile
import static projektor.plugin.ProjectDirectoryWriter.createSourceDirectory
import static projektor.plugin.ProjectDirectoryWriter.createTestDirectory

class CoverageAutoPublishInCISpec extends SingleProjectSpec {
    @Override
    boolean includeJacocoPlugin() {
        return true
    }

    def "should publish results and coverage when publish in CI enabled and coverage exists"() {
        given:
        buildFile << """
            projektor {
                serverUrl = '${serverUrl}'
                autoPublishOnFailureOnly = true
                autoPublishWhenCoverageInCI = true
            }
        """.stripIndent()

        String publicId = "AUTOCOV123"
        resultsStubber.stubResultsPostSuccess(publicId)

        coverageStubber.stubCoveragePostSuccess(publicId)

        File sourceDir = createSourceDirectory(projectRootDir)
        File testDir = createTestDirectory(projectRootDir)

        writeSourceCodeFile(sourceDir)
        writePartialCoverageSpecFile(testDir, "PartialSpec")

        when:
        def result = runSuccessfulBuildWithEnvironment(["CI": "true"], 'test', 'jacocoTestReport')

        then:
        result.task(":test").outcome == SUCCESS
        result.task(":jacocoTestReport").outcome == SUCCESS

        and:
        resultsStubber.findResultsRequests().size() == 1
        coverageStubber.findCoverageRequests(publicId).size() == 1
    }

    def "should not publish results and coverage when publish in CI enabled but no coverage exists"() {
        given:
        buildFile << """
            projektor {
                serverUrl = '${serverUrl}'
                autoPublishOnFailureOnly = true
                autoPublishWhenCoverageInCI = true
            }
        """.stripIndent()

        String publicId = "AUTOCOV123"
        resultsStubber.stubResultsPostSuccess(publicId)

        coverageStubber.stubCoveragePostSuccess(publicId)

        File sourceDir = createSourceDirectory(projectRootDir)
        File testDir = createTestDirectory(projectRootDir)

        writeSourceCodeFile(sourceDir)
        writePartialCoverageSpecFile(testDir, "PartialSpec")

        when:
        def result = runSuccessfulBuildWithEnvironment(["CI": "true"], 'test')

        then:
        result.task(":test").outcome == SUCCESS
        !result.task(":jacocoTestReport")

        and:
        resultsStubber.findResultsRequests().size() == 0
        coverageStubber.findCoverageRequests(publicId).size() == 0
    }

    def "should not publish results and coverage when auto publish on failure only set to false and running non-test task"() {
        given:
        buildFile << """
            projektor {
                serverUrl = '${serverUrl}'
                autoPublishOnFailureOnly = false
            }
        """.stripIndent()

        String publicId = "AUTOCOV123"
        resultsStubber.stubResultsPostSuccess(publicId)

        coverageStubber.stubCoveragePostSuccess(publicId)

        File sourceDir = createSourceDirectory(projectRootDir)
        File testDir = createTestDirectory(projectRootDir)

        writeSourceCodeFile(sourceDir)
        writePartialCoverageSpecFile(testDir, "PartialSpec")

        when:
        def result = runSuccessfulBuild('tasks')

        then:
        result.task(":tasks").outcome == SUCCESS
        !result.task(":jacocoTestReport")
        !result.task(":test")

        and:
        resultsStubber.findResultsRequests().size() == 0
        coverageStubber.findCoverageRequests(publicId).size() == 0
    }
}
