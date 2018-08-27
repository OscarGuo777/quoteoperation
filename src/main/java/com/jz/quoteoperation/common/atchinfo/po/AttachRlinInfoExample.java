package com.jz.quoteoperation.common.atchinfo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class AttachRlinInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachRlinInfoExample() {
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

        public Criteria andLgcSnIsNull() {
            addCriterion("LGC_SN is null");
            return (Criteria) this;
        }

        public Criteria andLgcSnIsNotNull() {
            addCriterion("LGC_SN is not null");
            return (Criteria) this;
        }

        public Criteria andLgcSnEqualTo(Integer value) {
            addCriterion("LGC_SN =", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnNotEqualTo(Integer value) {
            addCriterion("LGC_SN <>", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnGreaterThan(Integer value) {
            addCriterion("LGC_SN >", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("LGC_SN >=", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnLessThan(Integer value) {
            addCriterion("LGC_SN <", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnLessThanOrEqualTo(Integer value) {
            addCriterion("LGC_SN <=", value, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnIn(List<Integer> values) {
            addCriterion("LGC_SN in", values, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnNotIn(List<Integer> values) {
            addCriterion("LGC_SN not in", values, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnBetween(Integer value1, Integer value2) {
            addCriterion("LGC_SN between", value1, value2, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andLgcSnNotBetween(Integer value1, Integer value2) {
            addCriterion("LGC_SN not between", value1, value2, "lgcSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnIsNull() {
            addCriterion("ATCH_SN is null");
            return (Criteria) this;
        }

        public Criteria andAtchSnIsNotNull() {
            addCriterion("ATCH_SN is not null");
            return (Criteria) this;
        }

        public Criteria andAtchSnEqualTo(Integer value) {
            addCriterion("ATCH_SN =", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnNotEqualTo(Integer value) {
            addCriterion("ATCH_SN <>", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnGreaterThan(Integer value) {
            addCriterion("ATCH_SN >", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATCH_SN >=", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnLessThan(Integer value) {
            addCriterion("ATCH_SN <", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnLessThanOrEqualTo(Integer value) {
            addCriterion("ATCH_SN <=", value, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnIn(List<Integer> values) {
            addCriterion("ATCH_SN in", values, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnNotIn(List<Integer> values) {
            addCriterion("ATCH_SN not in", values, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnBetween(Integer value1, Integer value2) {
            addCriterion("ATCH_SN between", value1, value2, "atchSn");
            return (Criteria) this;
        }

        public Criteria andAtchSnNotBetween(Integer value1, Integer value2) {
            addCriterion("ATCH_SN not between", value1, value2, "atchSn");
            return (Criteria) this;
        }

        public Criteria andBsSnIsNull() {
            addCriterion("BS_SN is null");
            return (Criteria) this;
        }

        public Criteria andBsSnIsNotNull() {
            addCriterion("BS_SN is not null");
            return (Criteria) this;
        }

        public Criteria andBsSnEqualTo(Integer value) {
            addCriterion("BS_SN =", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnNotEqualTo(Integer value) {
            addCriterion("BS_SN <>", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnGreaterThan(Integer value) {
            addCriterion("BS_SN >", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("BS_SN >=", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnLessThan(Integer value) {
            addCriterion("BS_SN <", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnLessThanOrEqualTo(Integer value) {
            addCriterion("BS_SN <=", value, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnIn(List<Integer> values) {
            addCriterion("BS_SN in", values, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnNotIn(List<Integer> values) {
            addCriterion("BS_SN not in", values, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnBetween(Integer value1, Integer value2) {
            addCriterion("BS_SN between", value1, value2, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsSnNotBetween(Integer value1, Integer value2) {
            addCriterion("BS_SN not between", value1, value2, "bsSn");
            return (Criteria) this;
        }

        public Criteria andBsTpcdIsNull() {
            addCriterion("BS_TPCD is null");
            return (Criteria) this;
        }

        public Criteria andBsTpcdIsNotNull() {
            addCriterion("BS_TPCD is not null");
            return (Criteria) this;
        }

        public Criteria andBsTpcdEqualTo(String value) {
            addCriterion("BS_TPCD =", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdNotEqualTo(String value) {
            addCriterion("BS_TPCD <>", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdGreaterThan(String value) {
            addCriterion("BS_TPCD >", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdGreaterThanOrEqualTo(String value) {
            addCriterion("BS_TPCD >=", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdLessThan(String value) {
            addCriterion("BS_TPCD <", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdLessThanOrEqualTo(String value) {
            addCriterion("BS_TPCD <=", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdLike(String value) {
            addCriterion("BS_TPCD like", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdNotLike(String value) {
            addCriterion("BS_TPCD not like", value, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdIn(List<String> values) {
            addCriterion("BS_TPCD in", values, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdNotIn(List<String> values) {
            addCriterion("BS_TPCD not in", values, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdBetween(String value1, String value2) {
            addCriterion("BS_TPCD between", value1, value2, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andBsTpcdNotBetween(String value1, String value2) {
            addCriterion("BS_TPCD not between", value1, value2, "bsTpcd");
            return (Criteria) this;
        }

        public Criteria andCrtDtIsNull() {
            addCriterion("CRT_DT is null");
            return (Criteria) this;
        }

        public Criteria andCrtDtIsNotNull() {
            addCriterion("CRT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDtEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DT =", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DT <>", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtGreaterThan(Date value) {
            addCriterionForJDBCDate("CRT_DT >", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DT >=", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtLessThan(Date value) {
            addCriterionForJDBCDate("CRT_DT <", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRT_DT <=", value, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_DT in", values, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRT_DT not in", values, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_DT between", value1, value2, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRT_DT not between", value1, value2, "crtDt");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIsNull() {
            addCriterion("CRT_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIsNotNull() {
            addCriterion("CRT_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdEqualTo(Integer value) {
            addCriterion("CRT_USR_ID =", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotEqualTo(Integer value) {
            addCriterion("CRT_USR_ID <>", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThan(Integer value) {
            addCriterion("CRT_USR_ID >", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRT_USR_ID >=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThan(Integer value) {
            addCriterion("CRT_USR_ID <", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("CRT_USR_ID <=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIn(List<Integer> values) {
            addCriterion("CRT_USR_ID in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotIn(List<Integer> values) {
            addCriterion("CRT_USR_ID not in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("CRT_USR_ID between", value1, value2, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CRT_USR_ID not between", value1, value2, "crtUsrId");
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