package com.jz.quoteoperation.wechat.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WechatGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatGroupExample() {
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

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
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

        public Criteria andCrtUsrIdEqualTo(String value) {
            addCriterion("CRT_USR_ID =", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotEqualTo(String value) {
            addCriterion("CRT_USR_ID <>", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThan(String value) {
            addCriterion("CRT_USR_ID >", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USR_ID >=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThan(String value) {
            addCriterion("CRT_USR_ID <", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThanOrEqualTo(String value) {
            addCriterion("CRT_USR_ID <=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLike(String value) {
            addCriterion("CRT_USR_ID like", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotLike(String value) {
            addCriterion("CRT_USR_ID not like", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIn(List<String> values) {
            addCriterion("CRT_USR_ID in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotIn(List<String> values) {
            addCriterion("CRT_USR_ID not in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdBetween(String value1, String value2) {
            addCriterion("CRT_USR_ID between", value1, value2, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotBetween(String value1, String value2) {
            addCriterion("CRT_USR_ID not between", value1, value2, "crtUsrId");
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

        public Criteria andUptUsrIdIsNull() {
            addCriterion("UPT_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdIsNotNull() {
            addCriterion("UPT_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdEqualTo(String value) {
            addCriterion("UPT_USR_ID =", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdNotEqualTo(String value) {
            addCriterion("UPT_USR_ID <>", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdGreaterThan(String value) {
            addCriterion("UPT_USR_ID >", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPT_USR_ID >=", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdLessThan(String value) {
            addCriterion("UPT_USR_ID <", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdLessThanOrEqualTo(String value) {
            addCriterion("UPT_USR_ID <=", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdLike(String value) {
            addCriterion("UPT_USR_ID like", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdNotLike(String value) {
            addCriterion("UPT_USR_ID not like", value, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdIn(List<String> values) {
            addCriterion("UPT_USR_ID in", values, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdNotIn(List<String> values) {
            addCriterion("UPT_USR_ID not in", values, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdBetween(String value1, String value2) {
            addCriterion("UPT_USR_ID between", value1, value2, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptUsrIdNotBetween(String value1, String value2) {
            addCriterion("UPT_USR_ID not between", value1, value2, "uptUsrId");
            return (Criteria) this;
        }

        public Criteria andUptDtIsNull() {
            addCriterion("UPT_DT is null");
            return (Criteria) this;
        }

        public Criteria andUptDtIsNotNull() {
            addCriterion("UPT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUptDtEqualTo(Date value) {
            addCriterionForJDBCDate("UPT_DT =", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPT_DT <>", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtGreaterThan(Date value) {
            addCriterionForJDBCDate("UPT_DT >", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPT_DT >=", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtLessThan(Date value) {
            addCriterionForJDBCDate("UPT_DT <", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPT_DT <=", value, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtIn(List<Date> values) {
            addCriterionForJDBCDate("UPT_DT in", values, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPT_DT not in", values, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPT_DT between", value1, value2, "uptDt");
            return (Criteria) this;
        }

        public Criteria andUptDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPT_DT not between", value1, value2, "uptDt");
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