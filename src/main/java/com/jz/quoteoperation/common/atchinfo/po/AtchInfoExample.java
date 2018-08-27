package com.jz.quoteoperation.common.atchinfo.po;

import java.util.ArrayList;
import java.util.List;


public class AtchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AtchInfoExample() {
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

        public Criteria andAtchNmIsNull() {
            addCriterion("ATCH_NM is null");
            return (Criteria) this;
        }

        public Criteria andAtchNmIsNotNull() {
            addCriterion("ATCH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andAtchNmEqualTo(String value) {
            addCriterion("ATCH_NM =", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmNotEqualTo(String value) {
            addCriterion("ATCH_NM <>", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmGreaterThan(String value) {
            addCriterion("ATCH_NM >", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmGreaterThanOrEqualTo(String value) {
            addCriterion("ATCH_NM >=", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmLessThan(String value) {
            addCriterion("ATCH_NM <", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmLessThanOrEqualTo(String value) {
            addCriterion("ATCH_NM <=", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmLike(String value) {
            addCriterion("ATCH_NM like", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmNotLike(String value) {
            addCriterion("ATCH_NM not like", value, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmIn(List<String> values) {
            addCriterion("ATCH_NM in", values, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmNotIn(List<String> values) {
            addCriterion("ATCH_NM not in", values, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmBetween(String value1, String value2) {
            addCriterion("ATCH_NM between", value1, value2, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchNmNotBetween(String value1, String value2) {
            addCriterion("ATCH_NM not between", value1, value2, "atchNm");
            return (Criteria) this;
        }

        public Criteria andAtchPathIsNull() {
            addCriterion("ATCH_PATH is null");
            return (Criteria) this;
        }

        public Criteria andAtchPathIsNotNull() {
            addCriterion("ATCH_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andAtchPathEqualTo(String value) {
            addCriterion("ATCH_PATH =", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathNotEqualTo(String value) {
            addCriterion("ATCH_PATH <>", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathGreaterThan(String value) {
            addCriterion("ATCH_PATH >", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathGreaterThanOrEqualTo(String value) {
            addCriterion("ATCH_PATH >=", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathLessThan(String value) {
            addCriterion("ATCH_PATH <", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathLessThanOrEqualTo(String value) {
            addCriterion("ATCH_PATH <=", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathLike(String value) {
            addCriterion("ATCH_PATH like", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathNotLike(String value) {
            addCriterion("ATCH_PATH not like", value, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathIn(List<String> values) {
            addCriterion("ATCH_PATH in", values, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathNotIn(List<String> values) {
            addCriterion("ATCH_PATH not in", values, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathBetween(String value1, String value2) {
            addCriterion("ATCH_PATH between", value1, value2, "atchPath");
            return (Criteria) this;
        }

        public Criteria andAtchPathNotBetween(String value1, String value2) {
            addCriterion("ATCH_PATH not between", value1, value2, "atchPath");
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