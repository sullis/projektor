/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.CodeCoverageStatsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageStats extends TableImpl<CodeCoverageStatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.code_coverage_stats</code>
     */
    public static final CodeCoverageStats CODE_COVERAGE_STATS = new CodeCoverageStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeCoverageStatsRecord> getRecordType() {
        return CodeCoverageStatsRecord.class;
    }

    /**
     * The column <code>public.code_coverage_stats.id</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.code_coverage_stats.code_coverage_run_id</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Long> CODE_COVERAGE_RUN_ID = createField(DSL.name("code_coverage_run_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.code_coverage_stats.scope</code>.
     */
    public final TableField<CodeCoverageStatsRecord, String> SCOPE = createField(DSL.name("scope"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.statement_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> STATEMENT_COVERED = createField(DSL.name("statement_covered"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.statement_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> STATEMENT_MISSED = createField(DSL.name("statement_missed"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.line_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> LINE_COVERED = createField(DSL.name("line_covered"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.line_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> LINE_MISSED = createField(DSL.name("line_missed"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.branch_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> BRANCH_COVERED = createField(DSL.name("branch_covered"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.branch_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> BRANCH_MISSED = createField(DSL.name("branch_missed"), SQLDataType.INTEGER.nullable(false), this, "");

    private CodeCoverageStats(Name alias, Table<CodeCoverageStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CodeCoverageStats(Name alias, Table<CodeCoverageStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats(String alias) {
        this(DSL.name(alias), CODE_COVERAGE_STATS);
    }

    /**
     * Create an aliased <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats(Name alias) {
        this(alias, CODE_COVERAGE_STATS);
    }

    /**
     * Create a <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats() {
        this(DSL.name("code_coverage_stats"), null);
    }

    public <O extends Record> CodeCoverageStats(Table<O> child, ForeignKey<O, CodeCoverageStatsRecord> key) {
        super(child, key, CODE_COVERAGE_STATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_IDX);
    }

    @Override
    public Identity<CodeCoverageStatsRecord, Long> getIdentity() {
        return (Identity<CodeCoverageStatsRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CodeCoverageStatsRecord> getPrimaryKey() {
        return Keys.CODE_COVERAGE_STATS_PKEY;
    }

    @Override
    public List<ForeignKey<CodeCoverageStatsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY);
    }

    private transient CodeCoverageRun _codeCoverageRun;

    public CodeCoverageRun codeCoverageRun() {
        if (_codeCoverageRun == null)
            _codeCoverageRun = new CodeCoverageRun(this, Keys.CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY);

        return _codeCoverageRun;
    }

    @Override
    public CodeCoverageStats as(String alias) {
        return new CodeCoverageStats(DSL.name(alias), this);
    }

    @Override
    public CodeCoverageStats as(Name alias) {
        return new CodeCoverageStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageStats rename(String name) {
        return new CodeCoverageStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageStats rename(Name name) {
        return new CodeCoverageStats(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
