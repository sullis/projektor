/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.CodeQualityReport;
import projektor.database.generated.tables.records.CodeQualityReportRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeQualityReportDao extends DAOImpl<CodeQualityReportRecord, projektor.database.generated.tables.pojos.CodeQualityReport, Long> {

    /**
     * Create a new CodeQualityReportDao without any configuration
     */
    public CodeQualityReportDao() {
        super(CodeQualityReport.CODE_QUALITY_REPORT, projektor.database.generated.tables.pojos.CodeQualityReport.class);
    }

    /**
     * Create a new CodeQualityReportDao with an attached configuration
     */
    public CodeQualityReportDao(Configuration configuration) {
        super(CodeQualityReport.CODE_QUALITY_REPORT, projektor.database.generated.tables.pojos.CodeQualityReport.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.CodeQualityReport object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchById(Long... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.CodeQualityReport fetchOneById(Long value) {
        return fetchOne(CodeQualityReport.CODE_QUALITY_REPORT.ID, value);
    }

    /**
     * Fetch records that have <code>test_run_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfTestRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.TEST_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchByTestRunId(Long... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.TEST_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>contents BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfContents(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.CONTENTS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>contents IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchByContents(String... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.CONTENTS, values);
    }

    /**
     * Fetch records that have <code>file_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfFileName(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.FILE_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>file_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchByFileName(String... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.FILE_NAME, values);
    }

    /**
     * Fetch records that have <code>group_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfGroupName(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.GROUP_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchByGroupName(String... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.GROUP_NAME, values);
    }

    /**
     * Fetch records that have <code>idx BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchRangeOfIdx(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CodeQualityReport.CODE_QUALITY_REPORT.IDX, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>idx IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeQualityReport> fetchByIdx(Integer... values) {
        return fetch(CodeQualityReport.CODE_QUALITY_REPORT.IDX, values);
    }
}
