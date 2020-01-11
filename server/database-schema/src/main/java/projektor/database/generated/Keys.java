/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import projektor.database.generated.tables.ResultsProcessing;
import projektor.database.generated.tables.TestCase;
import projektor.database.generated.tables.TestFailure;
import projektor.database.generated.tables.TestRun;
import projektor.database.generated.tables.TestSuite;
import projektor.database.generated.tables.TestSuiteGroup;
import projektor.database.generated.tables.records.ResultsProcessingRecord;
import projektor.database.generated.tables.records.TestCaseRecord;
import projektor.database.generated.tables.records.TestFailureRecord;
import projektor.database.generated.tables.records.TestRunRecord;
import projektor.database.generated.tables.records.TestSuiteGroupRecord;
import projektor.database.generated.tables.records.TestSuiteRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TestCaseRecord, Long> IDENTITY_TEST_CASE = Identities0.IDENTITY_TEST_CASE;
    public static final Identity<TestFailureRecord, Long> IDENTITY_TEST_FAILURE = Identities0.IDENTITY_TEST_FAILURE;
    public static final Identity<TestRunRecord, Long> IDENTITY_TEST_RUN = Identities0.IDENTITY_TEST_RUN;
    public static final Identity<TestSuiteRecord, Long> IDENTITY_TEST_SUITE = Identities0.IDENTITY_TEST_SUITE;
    public static final Identity<TestSuiteGroupRecord, Long> IDENTITY_TEST_SUITE_GROUP = Identities0.IDENTITY_TEST_SUITE_GROUP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ResultsProcessingRecord> RESULTS_PROCESSING_PKEY = UniqueKeys0.RESULTS_PROCESSING_PKEY;
    public static final UniqueKey<TestCaseRecord> TEST_CASE_PKEY = UniqueKeys0.TEST_CASE_PKEY;
    public static final UniqueKey<TestFailureRecord> TEST_FAILURE_PKEY = UniqueKeys0.TEST_FAILURE_PKEY;
    public static final UniqueKey<TestRunRecord> TEST_RUN_PKEY = UniqueKeys0.TEST_RUN_PKEY;
    public static final UniqueKey<TestRunRecord> TEST_RUN_PUBLIC_ID_KEY = UniqueKeys0.TEST_RUN_PUBLIC_ID_KEY;
    public static final UniqueKey<TestSuiteRecord> TEST_SUITE_PKEY = UniqueKeys0.TEST_SUITE_PKEY;
    public static final UniqueKey<TestSuiteGroupRecord> TEST_SUITE_GROUP_PKEY = UniqueKeys0.TEST_SUITE_GROUP_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TestCaseRecord, TestSuiteRecord> TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY = ForeignKeys0.TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY;
    public static final ForeignKey<TestFailureRecord, TestCaseRecord> TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY = ForeignKeys0.TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY;
    public static final ForeignKey<TestSuiteRecord, TestRunRecord> TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY = ForeignKeys0.TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY;
    public static final ForeignKey<TestSuiteRecord, TestSuiteGroupRecord> TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY = ForeignKeys0.TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY;
    public static final ForeignKey<TestSuiteGroupRecord, TestRunRecord> TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY = ForeignKeys0.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TestCaseRecord, Long> IDENTITY_TEST_CASE = Internal.createIdentity(TestCase.TEST_CASE, TestCase.TEST_CASE.ID);
        public static Identity<TestFailureRecord, Long> IDENTITY_TEST_FAILURE = Internal.createIdentity(TestFailure.TEST_FAILURE, TestFailure.TEST_FAILURE.ID);
        public static Identity<TestRunRecord, Long> IDENTITY_TEST_RUN = Internal.createIdentity(TestRun.TEST_RUN, TestRun.TEST_RUN.ID);
        public static Identity<TestSuiteRecord, Long> IDENTITY_TEST_SUITE = Internal.createIdentity(TestSuite.TEST_SUITE, TestSuite.TEST_SUITE.ID);
        public static Identity<TestSuiteGroupRecord, Long> IDENTITY_TEST_SUITE_GROUP = Internal.createIdentity(TestSuiteGroup.TEST_SUITE_GROUP, TestSuiteGroup.TEST_SUITE_GROUP.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ResultsProcessingRecord> RESULTS_PROCESSING_PKEY = Internal.createUniqueKey(ResultsProcessing.RESULTS_PROCESSING, "results_processing_pkey", ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID);
        public static final UniqueKey<TestCaseRecord> TEST_CASE_PKEY = Internal.createUniqueKey(TestCase.TEST_CASE, "test_case_pkey", TestCase.TEST_CASE.ID);
        public static final UniqueKey<TestFailureRecord> TEST_FAILURE_PKEY = Internal.createUniqueKey(TestFailure.TEST_FAILURE, "test_failure_pkey", TestFailure.TEST_FAILURE.ID);
        public static final UniqueKey<TestRunRecord> TEST_RUN_PKEY = Internal.createUniqueKey(TestRun.TEST_RUN, "test_run_pkey", TestRun.TEST_RUN.ID);
        public static final UniqueKey<TestRunRecord> TEST_RUN_PUBLIC_ID_KEY = Internal.createUniqueKey(TestRun.TEST_RUN, "test_run_public_id_key", TestRun.TEST_RUN.PUBLIC_ID);
        public static final UniqueKey<TestSuiteRecord> TEST_SUITE_PKEY = Internal.createUniqueKey(TestSuite.TEST_SUITE, "test_suite_pkey", TestSuite.TEST_SUITE.ID);
        public static final UniqueKey<TestSuiteGroupRecord> TEST_SUITE_GROUP_PKEY = Internal.createUniqueKey(TestSuiteGroup.TEST_SUITE_GROUP, "test_suite_group_pkey", TestSuiteGroup.TEST_SUITE_GROUP.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<TestCaseRecord, TestSuiteRecord> TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY = Internal.createForeignKey(projektor.database.generated.Keys.TEST_SUITE_PKEY, TestCase.TEST_CASE, "test_case__test_case_test_suite_id_fkey", TestCase.TEST_CASE.TEST_SUITE_ID);
        public static final ForeignKey<TestFailureRecord, TestCaseRecord> TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY = Internal.createForeignKey(projektor.database.generated.Keys.TEST_CASE_PKEY, TestFailure.TEST_FAILURE, "test_failure__test_failure_test_case_id_fkey", TestFailure.TEST_FAILURE.TEST_CASE_ID);
        public static final ForeignKey<TestSuiteRecord, TestRunRecord> TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY = Internal.createForeignKey(projektor.database.generated.Keys.TEST_RUN_PKEY, TestSuite.TEST_SUITE, "test_suite__test_suite_test_run_id_fkey", TestSuite.TEST_SUITE.TEST_RUN_ID);
        public static final ForeignKey<TestSuiteRecord, TestSuiteGroupRecord> TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY = Internal.createForeignKey(projektor.database.generated.Keys.TEST_SUITE_GROUP_PKEY, TestSuite.TEST_SUITE, "test_suite__test_suite_test_suite_group_id_fkey", TestSuite.TEST_SUITE.TEST_SUITE_GROUP_ID);
        public static final ForeignKey<TestSuiteGroupRecord, TestRunRecord> TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY = Internal.createForeignKey(projektor.database.generated.Keys.TEST_RUN_PKEY, TestSuiteGroup.TEST_SUITE_GROUP, "test_suite_group__test_suite_group_test_run_id_fkey", TestSuiteGroup.TEST_SUITE_GROUP.TEST_RUN_ID);
    }
}
