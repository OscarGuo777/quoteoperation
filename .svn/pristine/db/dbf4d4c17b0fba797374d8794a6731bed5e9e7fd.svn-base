package com.jz.quoteoperation.suggestion.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SuggestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuggestionExample() {
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

        public Criteria andSgtnUsrIdIsNull() {
            addCriterion("SGTN_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdIsNotNull() {
            addCriterion("SGTN_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdEqualTo(Integer value) {
            addCriterion("SGTN_USR_ID =", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdNotEqualTo(Integer value) {
            addCriterion("SGTN_USR_ID <>", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdGreaterThan(Integer value) {
            addCriterion("SGTN_USR_ID >", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SGTN_USR_ID >=", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdLessThan(Integer value) {
            addCriterion("SGTN_USR_ID <", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("SGTN_USR_ID <=", value, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdIn(List<Integer> values) {
            addCriterion("SGTN_USR_ID in", values, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdNotIn(List<Integer> values) {
            addCriterion("SGTN_USR_ID not in", values, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("SGTN_USR_ID between", value1, value2, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SGTN_USR_ID not between", value1, value2, "sgtnUsrId");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdIsNull() {
            addCriterion("SGTN_TPCD is null");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdIsNotNull() {
            addCriterion("SGTN_TPCD is not null");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdEqualTo(String value) {
            addCriterion("SGTN_TPCD =", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdNotEqualTo(String value) {
            addCriterion("SGTN_TPCD <>", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdGreaterThan(String value) {
            addCriterion("SGTN_TPCD >", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdGreaterThanOrEqualTo(String value) {
            addCriterion("SGTN_TPCD >=", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdLessThan(String value) {
            addCriterion("SGTN_TPCD <", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdLessThanOrEqualTo(String value) {
            addCriterion("SGTN_TPCD <=", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdLike(String value) {
            addCriterion("SGTN_TPCD like", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdNotLike(String value) {
            addCriterion("SGTN_TPCD not like", value, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdIn(List<String> values) {
            addCriterion("SGTN_TPCD in", values, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdNotIn(List<String> values) {
            addCriterion("SGTN_TPCD not in", values, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdBetween(String value1, String value2) {
            addCriterion("SGTN_TPCD between", value1, value2, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnTpcdNotBetween(String value1, String value2) {
            addCriterion("SGTN_TPCD not between", value1, value2, "sgtnTpcd");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntIsNull() {
            addCriterion("SGTN_CNTNT is null");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntIsNotNull() {
            addCriterion("SGTN_CNTNT is not null");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntEqualTo(String value) {
            addCriterion("SGTN_CNTNT =", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntNotEqualTo(String value) {
            addCriterion("SGTN_CNTNT <>", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntGreaterThan(String value) {
            addCriterion("SGTN_CNTNT >", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntGreaterThanOrEqualTo(String value) {
            addCriterion("SGTN_CNTNT >=", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntLessThan(String value) {
            addCriterion("SGTN_CNTNT <", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntLessThanOrEqualTo(String value) {
            addCriterion("SGTN_CNTNT <=", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntLike(String value) {
            addCriterion("SGTN_CNTNT like", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntNotLike(String value) {
            addCriterion("SGTN_CNTNT not like", value, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntIn(List<String> values) {
            addCriterion("SGTN_CNTNT in", values, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntNotIn(List<String> values) {
            addCriterion("SGTN_CNTNT not in", values, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntBetween(String value1, String value2) {
            addCriterion("SGTN_CNTNT between", value1, value2, "sgtnCntnt");
            return (Criteria) this;
        }

        public Criteria andSgtnCntntNotBetween(String value1, String value2) {
            addCriterion("SGTN_CNTNT not between", value1, value2, "sgtnCntnt");
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

        public Criteria andRplyUsrIdIsNull() {
            addCriterion("RPLY_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdIsNotNull() {
            addCriterion("RPLY_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdEqualTo(Integer value) {
            addCriterion("RPLY_USR_ID =", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdNotEqualTo(Integer value) {
            addCriterion("RPLY_USR_ID <>", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdGreaterThan(Integer value) {
            addCriterion("RPLY_USR_ID >", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RPLY_USR_ID >=", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdLessThan(Integer value) {
            addCriterion("RPLY_USR_ID <", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("RPLY_USR_ID <=", value, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdIn(List<Integer> values) {
            addCriterion("RPLY_USR_ID in", values, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdNotIn(List<Integer> values) {
            addCriterion("RPLY_USR_ID not in", values, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("RPLY_USR_ID between", value1, value2, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RPLY_USR_ID not between", value1, value2, "rplyUsrId");
            return (Criteria) this;
        }

        public Criteria andRplyCntntIsNull() {
            addCriterion("RPLY_CNTNT is null");
            return (Criteria) this;
        }

        public Criteria andRplyCntntIsNotNull() {
            addCriterion("RPLY_CNTNT is not null");
            return (Criteria) this;
        }

        public Criteria andRplyCntntEqualTo(String value) {
            addCriterion("RPLY_CNTNT =", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntNotEqualTo(String value) {
            addCriterion("RPLY_CNTNT <>", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntGreaterThan(String value) {
            addCriterion("RPLY_CNTNT >", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntGreaterThanOrEqualTo(String value) {
            addCriterion("RPLY_CNTNT >=", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntLessThan(String value) {
            addCriterion("RPLY_CNTNT <", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntLessThanOrEqualTo(String value) {
            addCriterion("RPLY_CNTNT <=", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntLike(String value) {
            addCriterion("RPLY_CNTNT like", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntNotLike(String value) {
            addCriterion("RPLY_CNTNT not like", value, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntIn(List<String> values) {
            addCriterion("RPLY_CNTNT in", values, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntNotIn(List<String> values) {
            addCriterion("RPLY_CNTNT not in", values, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntBetween(String value1, String value2) {
            addCriterion("RPLY_CNTNT between", value1, value2, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyCntntNotBetween(String value1, String value2) {
            addCriterion("RPLY_CNTNT not between", value1, value2, "rplyCntnt");
            return (Criteria) this;
        }

        public Criteria andRplyDtIsNull() {
            addCriterion("RPLY_DT is null");
            return (Criteria) this;
        }

        public Criteria andRplyDtIsNotNull() {
            addCriterion("RPLY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRplyDtEqualTo(Date value) {
            addCriterionForJDBCDate("RPLY_DT =", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("RPLY_DT <>", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtGreaterThan(Date value) {
            addCriterionForJDBCDate("RPLY_DT >", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPLY_DT >=", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtLessThan(Date value) {
            addCriterionForJDBCDate("RPLY_DT <", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPLY_DT <=", value, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtIn(List<Date> values) {
            addCriterionForJDBCDate("RPLY_DT in", values, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("RPLY_DT not in", values, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPLY_DT between", value1, value2, "rplyDt");
            return (Criteria) this;
        }

        public Criteria andRplyDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPLY_DT not between", value1, value2, "rplyDt");
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