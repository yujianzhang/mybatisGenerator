package com.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PbEmpLeaveBatchItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbEmpLeaveBatchItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIsNull() {
            addCriterion("EMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIsNotNull() {
            addCriterion("EMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeEqualTo(String value) {
            addCriterion("EMP_CODE =", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotEqualTo(String value) {
            addCriterion("EMP_CODE <>", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThan(String value) {
            addCriterion("EMP_CODE >", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_CODE >=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThan(String value) {
            addCriterion("EMP_CODE <", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThanOrEqualTo(String value) {
            addCriterion("EMP_CODE <=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLike(String value) {
            addCriterion("EMP_CODE like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotLike(String value) {
            addCriterion("EMP_CODE not like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIn(List<String> values) {
            addCriterion("EMP_CODE in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotIn(List<String> values) {
            addCriterion("EMP_CODE not in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeBetween(String value1, String value2) {
            addCriterion("EMP_CODE between", value1, value2, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotBetween(String value1, String value2) {
            addCriterion("EMP_CODE not between", value1, value2, "empCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("COMPANY_CODE =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("COMPANY_CODE <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("COMPANY_CODE >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("COMPANY_CODE <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("COMPANY_CODE like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("COMPANY_CODE not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("COMPANY_CODE in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("COMPANY_CODE not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateIsNull() {
            addCriterion("APPLY_OFF_POST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateIsNotNull() {
            addCriterion("APPLY_OFF_POST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE =", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE <>", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateGreaterThan(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE >", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE >=", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateLessThan(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE <", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE <=", value, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateIn(List<Date> values) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE in", values, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE not in", values, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE between", value1, value2, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andApplyOffPostDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLY_OFF_POST_DATE not between", value1, value2, "applyOffPostDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountIsNull() {
            addCriterion("ACCUM_FUND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountIsNotNull() {
            addCriterion("ACCUM_FUND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountEqualTo(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT =", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountNotEqualTo(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT <>", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountGreaterThan(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT >", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT >=", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountLessThan(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT <", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT <=", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountLike(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT like", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountNotLike(String value) {
            addCriterion("ACCUM_FUND_ACCOUNT not like", value, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountIn(List<String> values) {
            addCriterion("ACCUM_FUND_ACCOUNT in", values, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountNotIn(List<String> values) {
            addCriterion("ACCUM_FUND_ACCOUNT not in", values, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountBetween(String value1, String value2) {
            addCriterion("ACCUM_FUND_ACCOUNT between", value1, value2, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andAccumFundAccountNotBetween(String value1, String value2) {
            addCriterion("ACCUM_FUND_ACCOUNT not between", value1, value2, "accumFundAccount");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonIsNull() {
            addCriterion("OFF_POST_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonIsNotNull() {
            addCriterion("OFF_POST_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonEqualTo(String value) {
            addCriterion("OFF_POST_REASON =", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonNotEqualTo(String value) {
            addCriterion("OFF_POST_REASON <>", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonGreaterThan(String value) {
            addCriterion("OFF_POST_REASON >", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_POST_REASON >=", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonLessThan(String value) {
            addCriterion("OFF_POST_REASON <", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonLessThanOrEqualTo(String value) {
            addCriterion("OFF_POST_REASON <=", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonLike(String value) {
            addCriterion("OFF_POST_REASON like", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonNotLike(String value) {
            addCriterion("OFF_POST_REASON not like", value, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonIn(List<String> values) {
            addCriterion("OFF_POST_REASON in", values, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonNotIn(List<String> values) {
            addCriterion("OFF_POST_REASON not in", values, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonBetween(String value1, String value2) {
            addCriterion("OFF_POST_REASON between", value1, value2, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostReasonNotBetween(String value1, String value2) {
            addCriterion("OFF_POST_REASON not between", value1, value2, "offPostReason");
            return (Criteria) this;
        }

        public Criteria andOffPostDescIsNull() {
            addCriterion("OFF_POST_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOffPostDescIsNotNull() {
            addCriterion("OFF_POST_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOffPostDescEqualTo(String value) {
            addCriterion("OFF_POST_DESC =", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescNotEqualTo(String value) {
            addCriterion("OFF_POST_DESC <>", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescGreaterThan(String value) {
            addCriterion("OFF_POST_DESC >", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_POST_DESC >=", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescLessThan(String value) {
            addCriterion("OFF_POST_DESC <", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescLessThanOrEqualTo(String value) {
            addCriterion("OFF_POST_DESC <=", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescLike(String value) {
            addCriterion("OFF_POST_DESC like", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescNotLike(String value) {
            addCriterion("OFF_POST_DESC not like", value, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescIn(List<String> values) {
            addCriterion("OFF_POST_DESC in", values, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescNotIn(List<String> values) {
            addCriterion("OFF_POST_DESC not in", values, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescBetween(String value1, String value2) {
            addCriterion("OFF_POST_DESC between", value1, value2, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andOffPostDescNotBetween(String value1, String value2) {
            addCriterion("OFF_POST_DESC not between", value1, value2, "offPostDesc");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIsNull() {
            addCriterion("TRANSFER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIsNotNull() {
            addCriterion("TRANSFER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTypeEqualTo(String value) {
            addCriterion("TRANSFER_TYPE =", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotEqualTo(String value) {
            addCriterion("TRANSFER_TYPE <>", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeGreaterThan(String value) {
            addCriterion("TRANSFER_TYPE >", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TYPE >=", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLessThan(String value) {
            addCriterion("TRANSFER_TYPE <", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TYPE <=", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeLike(String value) {
            addCriterion("TRANSFER_TYPE like", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotLike(String value) {
            addCriterion("TRANSFER_TYPE not like", value, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeIn(List<String> values) {
            addCriterion("TRANSFER_TYPE in", values, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotIn(List<String> values) {
            addCriterion("TRANSFER_TYPE not in", values, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeBetween(String value1, String value2) {
            addCriterion("TRANSFER_TYPE between", value1, value2, "transferType");
            return (Criteria) this;
        }

        public Criteria andTransferTypeNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_TYPE not between", value1, value2, "transferType");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("is_valid like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("is_valid not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("CREATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("CREATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("CREATE_USER_NAME =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("CREATE_USER_NAME >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("CREATE_USER_NAME <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("CREATE_USER_NAME like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("CREATE_USER_NAME not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("CREATE_USER_NAME in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("CREATE_USER_NAME not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIsNull() {
            addCriterion("LAST_UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIsNotNull() {
            addCriterion("LAST_UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_ID =", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_ID <>", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThan(String value) {
            addCriterion("LAST_UPDATE_USER_ID >", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_ID >=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThan(String value) {
            addCriterion("LAST_UPDATE_USER_ID <", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_ID <=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLike(String value) {
            addCriterion("LAST_UPDATE_USER_ID like", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotLike(String value) {
            addCriterion("LAST_UPDATE_USER_ID not like", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER_ID in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER_ID not in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER_ID between", value1, value2, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER_ID not between", value1, value2, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameIsNull() {
            addCriterion("LAST_UPDATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameIsNotNull() {
            addCriterion("LAST_UPDATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_NAME =", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_NAME <>", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameGreaterThan(String value) {
            addCriterion("LAST_UPDATE_USER_NAME >", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_NAME >=", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameLessThan(String value) {
            addCriterion("LAST_UPDATE_USER_NAME <", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER_NAME <=", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameLike(String value) {
            addCriterion("LAST_UPDATE_USER_NAME like", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameNotLike(String value) {
            addCriterion("LAST_UPDATE_USER_NAME not like", value, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER_NAME in", values, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER_NAME not in", values, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER_NAME between", value1, value2, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER_NAME not between", value1, value2, "lastUpdateUserName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}