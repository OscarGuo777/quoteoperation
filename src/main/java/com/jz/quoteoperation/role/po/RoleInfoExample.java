package com.jz.quoteoperation.role.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleInfoExample() {
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

        public Criteria andPlatCdIsNull() {
            addCriterion("PLAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andPlatCdIsNotNull() {
            addCriterion("PLAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPlatCdEqualTo(String value) {
            addCriterion("PLAT_CD =", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdNotEqualTo(String value) {
            addCriterion("PLAT_CD <>", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdGreaterThan(String value) {
            addCriterion("PLAT_CD >", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdGreaterThanOrEqualTo(String value) {
            addCriterion("PLAT_CD >=", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdLessThan(String value) {
            addCriterion("PLAT_CD <", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdLessThanOrEqualTo(String value) {
            addCriterion("PLAT_CD <=", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdLike(String value) {
            addCriterion("PLAT_CD like", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdNotLike(String value) {
            addCriterion("PLAT_CD not like", value, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdIn(List<String> values) {
            addCriterion("PLAT_CD in", values, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdNotIn(List<String> values) {
            addCriterion("PLAT_CD not in", values, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdBetween(String value1, String value2) {
            addCriterion("PLAT_CD between", value1, value2, "platCd");
            return (Criteria) this;
        }

        public Criteria andPlatCdNotBetween(String value1, String value2) {
            addCriterion("PLAT_CD not between", value1, value2, "platCd");
            return (Criteria) this;
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

        public Criteria andRoleNmIsNull() {
            addCriterion("ROLE_NM is null");
            return (Criteria) this;
        }

        public Criteria andRoleNmIsNotNull() {
            addCriterion("ROLE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNmEqualTo(String value) {
            addCriterion("ROLE_NM =", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmNotEqualTo(String value) {
            addCriterion("ROLE_NM <>", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmGreaterThan(String value) {
            addCriterion("ROLE_NM >", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NM >=", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmLessThan(String value) {
            addCriterion("ROLE_NM <", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NM <=", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmLike(String value) {
            addCriterion("ROLE_NM like", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmNotLike(String value) {
            addCriterion("ROLE_NM not like", value, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmIn(List<String> values) {
            addCriterion("ROLE_NM in", values, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmNotIn(List<String> values) {
            addCriterion("ROLE_NM not in", values, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmBetween(String value1, String value2) {
            addCriterion("ROLE_NM between", value1, value2, "roleNm");
            return (Criteria) this;
        }

        public Criteria andRoleNmNotBetween(String value1, String value2) {
            addCriterion("ROLE_NM not between", value1, value2, "roleNm");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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