package com.jz.quoteoperation.roleauth.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoleAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleAuthExample() {
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

        public Criteria andAuthSnIsNull() {
            addCriterion("AUTH_SN is null");
            return (Criteria) this;
        }

        public Criteria andAuthSnIsNotNull() {
            addCriterion("AUTH_SN is not null");
            return (Criteria) this;
        }

        public Criteria andAuthSnEqualTo(Integer value) {
            addCriterion("AUTH_SN =", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotEqualTo(Integer value) {
            addCriterion("AUTH_SN <>", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnGreaterThan(Integer value) {
            addCriterion("AUTH_SN >", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_SN >=", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnLessThan(Integer value) {
            addCriterion("AUTH_SN <", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_SN <=", value, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnIn(List<Integer> values) {
            addCriterion("AUTH_SN in", values, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotIn(List<Integer> values) {
            addCriterion("AUTH_SN not in", values, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_SN between", value1, value2, "authSn");
            return (Criteria) this;
        }

        public Criteria andAuthSnNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_SN not between", value1, value2, "authSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnIsNull() {
            addCriterion("ROLE_SN is null");
            return (Criteria) this;
        }

        public Criteria andRoleSnIsNotNull() {
            addCriterion("ROLE_SN is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSnEqualTo(Integer value) {
            addCriterion("ROLE_SN =", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnNotEqualTo(Integer value) {
            addCriterion("ROLE_SN <>", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnGreaterThan(Integer value) {
            addCriterion("ROLE_SN >", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_SN >=", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnLessThan(Integer value) {
            addCriterion("ROLE_SN <", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_SN <=", value, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnIn(List<Integer> values) {
            addCriterion("ROLE_SN in", values, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnNotIn(List<Integer> values) {
            addCriterion("ROLE_SN not in", values, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_SN between", value1, value2, "roleSn");
            return (Criteria) this;
        }

        public Criteria andRoleSnNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_SN not between", value1, value2, "roleSn");
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

        public Criteria andUpdDtIsNull() {
            addCriterion("UPD_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpdDtIsNotNull() {
            addCriterion("UPD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDtEqualTo(Date value) {
            addCriterionForJDBCDate("UPD_DT =", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPD_DT <>", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("UPD_DT >", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPD_DT >=", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtLessThan(Date value) {
            addCriterionForJDBCDate("UPD_DT <", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPD_DT <=", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtIn(List<Date> values) {
            addCriterionForJDBCDate("UPD_DT in", values, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPD_DT not in", values, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPD_DT between", value1, value2, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPD_DT not between", value1, value2, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIsNull() {
            addCriterion("UPD_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIsNotNull() {
            addCriterion("UPD_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdEqualTo(Integer value) {
            addCriterion("UPD_USR_ID =", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotEqualTo(Integer value) {
            addCriterion("UPD_USR_ID <>", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdGreaterThan(Integer value) {
            addCriterion("UPD_USR_ID >", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPD_USR_ID >=", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdLessThan(Integer value) {
            addCriterion("UPD_USR_ID <", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPD_USR_ID <=", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIn(List<Integer> values) {
            addCriterion("UPD_USR_ID in", values, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotIn(List<Integer> values) {
            addCriterion("UPD_USR_ID not in", values, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("UPD_USR_ID between", value1, value2, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPD_USR_ID not between", value1, value2, "updUsrId");
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