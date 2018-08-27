package com.jz.quoteoperation.wechat.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WechatConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatConfigExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andAppKeyIsNull() {
            addCriterion("APP_KEY is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("APP_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("APP_KEY =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("APP_KEY <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("APP_KEY >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("APP_KEY >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("APP_KEY <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("APP_KEY <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("APP_KEY like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("APP_KEY not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("APP_KEY in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("APP_KEY not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("APP_KEY between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("APP_KEY not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppSercetIsNull() {
            addCriterion("APP_SERCET is null");
            return (Criteria) this;
        }

        public Criteria andAppSercetIsNotNull() {
            addCriterion("APP_SERCET is not null");
            return (Criteria) this;
        }

        public Criteria andAppSercetEqualTo(String value) {
            addCriterion("APP_SERCET =", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetNotEqualTo(String value) {
            addCriterion("APP_SERCET <>", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetGreaterThan(String value) {
            addCriterion("APP_SERCET >", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetGreaterThanOrEqualTo(String value) {
            addCriterion("APP_SERCET >=", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetLessThan(String value) {
            addCriterion("APP_SERCET <", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetLessThanOrEqualTo(String value) {
            addCriterion("APP_SERCET <=", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetLike(String value) {
            addCriterion("APP_SERCET like", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetNotLike(String value) {
            addCriterion("APP_SERCET not like", value, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetIn(List<String> values) {
            addCriterion("APP_SERCET in", values, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetNotIn(List<String> values) {
            addCriterion("APP_SERCET not in", values, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetBetween(String value1, String value2) {
            addCriterion("APP_SERCET between", value1, value2, "appSercet");
            return (Criteria) this;
        }

        public Criteria andAppSercetNotBetween(String value1, String value2) {
            addCriterion("APP_SERCET not between", value1, value2, "appSercet");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingIsNull() {
            addCriterion("FOLLOW_WELCOMING is null");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingIsNotNull() {
            addCriterion("FOLLOW_WELCOMING is not null");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingEqualTo(String value) {
            addCriterion("FOLLOW_WELCOMING =", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingNotEqualTo(String value) {
            addCriterion("FOLLOW_WELCOMING <>", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingGreaterThan(String value) {
            addCriterion("FOLLOW_WELCOMING >", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_WELCOMING >=", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingLessThan(String value) {
            addCriterion("FOLLOW_WELCOMING <", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_WELCOMING <=", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingLike(String value) {
            addCriterion("FOLLOW_WELCOMING like", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingNotLike(String value) {
            addCriterion("FOLLOW_WELCOMING not like", value, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingIn(List<String> values) {
            addCriterion("FOLLOW_WELCOMING in", values, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingNotIn(List<String> values) {
            addCriterion("FOLLOW_WELCOMING not in", values, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingBetween(String value1, String value2) {
            addCriterion("FOLLOW_WELCOMING between", value1, value2, "followWelcoming");
            return (Criteria) this;
        }

        public Criteria andFollowWelcomingNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_WELCOMING not between", value1, value2, "followWelcoming");
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