/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import projektor.database.generated.tables.ResultsProcessing;
import projektor.database.generated.tables.TestCase;
import projektor.database.generated.tables.TestFailure;
import projektor.database.generated.tables.TestRun;
import projektor.database.generated.tables.TestSuite;
import projektor.database.generated.tables.TestSuiteGroup;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index IDX_RESULTS_PROCESSING_STATUS = Indexes0.IDX_RESULTS_PROCESSING_STATUS;
    public static final Index RESULTS_PROCESSING_PKEY = Indexes0.RESULTS_PROCESSING_PKEY;
    public static final Index IDX_TEST_CASE_DURATION = Indexes0.IDX_TEST_CASE_DURATION;
    public static final Index IDX_TEST_CASE_IDX = Indexes0.IDX_TEST_CASE_IDX;
    public static final Index IDX_TEST_CASE_PASSED = Indexes0.IDX_TEST_CASE_PASSED;
    public static final Index TEST_CASE_PKEY = Indexes0.TEST_CASE_PKEY;
    public static final Index TEST_FAILURE_PKEY = Indexes0.TEST_FAILURE_PKEY;
    public static final Index IDX_TEST_RUN_PUBLIC_ID = Indexes0.IDX_TEST_RUN_PUBLIC_ID;
    public static final Index TEST_RUN_PKEY = Indexes0.TEST_RUN_PKEY;
    public static final Index TEST_RUN_PUBLIC_ID_KEY = Indexes0.TEST_RUN_PUBLIC_ID_KEY;
    public static final Index IDX_TEST_SUITE_IDX = Indexes0.IDX_TEST_SUITE_IDX;
    public static final Index TEST_SUITE_PKEY = Indexes0.TEST_SUITE_PKEY;
    public static final Index TEST_SUITE_GROUP_PKEY = Indexes0.TEST_SUITE_GROUP_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index IDX_RESULTS_PROCESSING_STATUS = Internal.createIndex("idx_results_processing_status", ResultsProcessing.RESULTS_PROCESSING, new OrderField[] { ResultsProcessing.RESULTS_PROCESSING.STATUS }, false);
        public static Index RESULTS_PROCESSING_PKEY = Internal.createIndex("results_processing_pkey", ResultsProcessing.RESULTS_PROCESSING, new OrderField[] { ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID }, true);
        public static Index IDX_TEST_CASE_DURATION = Internal.createIndex("idx_test_case_duration", TestCase.TEST_CASE, new OrderField[] { TestCase.TEST_CASE.DURATION }, false);
        public static Index IDX_TEST_CASE_IDX = Internal.createIndex("idx_test_case_idx", TestCase.TEST_CASE, new OrderField[] { TestCase.TEST_CASE.IDX }, false);
        public static Index IDX_TEST_CASE_PASSED = Internal.createIndex("idx_test_case_passed", TestCase.TEST_CASE, new OrderField[] { TestCase.TEST_CASE.PASSED }, false);
        public static Index TEST_CASE_PKEY = Internal.createIndex("test_case_pkey", TestCase.TEST_CASE, new OrderField[] { TestCase.TEST_CASE.ID }, true);
        public static Index TEST_FAILURE_PKEY = Internal.createIndex("test_failure_pkey", TestFailure.TEST_FAILURE, new OrderField[] { TestFailure.TEST_FAILURE.ID }, true);
        public static Index IDX_TEST_RUN_PUBLIC_ID = Internal.createIndex("idx_test_run_public_id", TestRun.TEST_RUN, new OrderField[] { TestRun.TEST_RUN.PUBLIC_ID }, false);
        public static Index TEST_RUN_PKEY = Internal.createIndex("test_run_pkey", TestRun.TEST_RUN, new OrderField[] { TestRun.TEST_RUN.ID }, true);
        public static Index TEST_RUN_PUBLIC_ID_KEY = Internal.createIndex("test_run_public_id_key", TestRun.TEST_RUN, new OrderField[] { TestRun.TEST_RUN.PUBLIC_ID }, true);
        public static Index IDX_TEST_SUITE_IDX = Internal.createIndex("idx_test_suite_idx", TestSuite.TEST_SUITE, new OrderField[] { TestSuite.TEST_SUITE.IDX }, false);
        public static Index TEST_SUITE_PKEY = Internal.createIndex("test_suite_pkey", TestSuite.TEST_SUITE, new OrderField[] { TestSuite.TEST_SUITE.ID }, true);
        public static Index TEST_SUITE_GROUP_PKEY = Internal.createIndex("test_suite_group_pkey", TestSuiteGroup.TEST_SUITE_GROUP, new OrderField[] { TestSuiteGroup.TEST_SUITE_GROUP.ID }, true);
    }
}
