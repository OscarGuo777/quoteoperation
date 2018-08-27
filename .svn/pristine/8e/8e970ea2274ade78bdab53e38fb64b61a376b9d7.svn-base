package com.jz.quoteoperation.version.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VersionInfoExample  {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VersionInfoExample() {
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

        public Criteria andVrsnSnIsNull() {
            addCriterion("VRSN_SN is null");
            return (Criteria) this;
        }

        public Criteria andVrsnSnIsNotNull() {
            addCriterion("VRSN_SN is not null");
            return (Criteria) this;
        }

        public Criteria andVrsnSnEqualTo(String value) {
            addCriterion("VRSN_SN =", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnNotEqualTo(String value) {
            addCriterion("VRSN_SN <>", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnGreaterThan(String value) {
            addCriterion("VRSN_SN >", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnGreaterThanOrEqualTo(String value) {
            addCriterion("VRSN_SN >=", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnLessThan(String value) {
            addCriterion("VRSN_SN <", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnLessThanOrEqualTo(String value) {
            addCriterion("VRSN_SN <=", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnLike(String value) {
            addCriterion("VRSN_SN like", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnNotLike(String value) {
            addCriterion("VRSN_SN not like", value, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnIn(List<String> values) {
            addCriterion("VRSN_SN in", values, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnNotIn(List<String> values) {
            addCriterion("VRSN_SN not in", values, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnBetween(String value1, String value2) {
            addCriterion("VRSN_SN between", value1, value2, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnSnNotBetween(String value1, String value2) {
            addCriterion("VRSN_SN not between", value1, value2, "vrsnSn");
            return (Criteria) this;
        }

        public Criteria andVrsnDescIsNull() {
            addCriterion("VRSN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVrsnDescIsNotNull() {
            addCriterion("VRSN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVrsnDescEqualTo(String value) {
            addCriterion("VRSN_DESC =", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescNotEqualTo(String value) {
            addCriterion("VRSN_DESC <>", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescGreaterThan(String value) {
            addCriterion("VRSN_DESC >", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescGreaterThanOrEqualTo(String value) {
            addCriterion("VRSN_DESC >=", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescLessThan(String value) {
            addCriterion("VRSN_DESC <", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescLessThanOrEqualTo(String value) {
            addCriterion("VRSN_DESC <=", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescLike(String value) {
            addCriterion("VRSN_DESC like", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescNotLike(String value) {
            addCriterion("VRSN_DESC not like", value, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescIn(List<String> values) {
            addCriterion("VRSN_DESC in", values, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescNotIn(List<String> values) {
            addCriterion("VRSN_DESC not in", values, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescBetween(String value1, String value2) {
            addCriterion("VRSN_DESC between", value1, value2, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andVrsnDescNotBetween(String value1, String value2) {
            addCriterion("VRSN_DESC not between", value1, value2, "vrsnDesc");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdIsNull() {
            addCriterion("PUB_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdIsNotNull() {
            addCriterion("PUB_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdEqualTo(Integer value) {
            addCriterion("PUB_USR_ID =", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdNotEqualTo(Integer value) {
            addCriterion("PUB_USR_ID <>", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdGreaterThan(Integer value) {
            addCriterion("PUB_USR_ID >", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUB_USR_ID >=", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdLessThan(Integer value) {
            addCriterion("PUB_USR_ID <", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("PUB_USR_ID <=", value, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdIn(List<Integer> values) {
            addCriterion("PUB_USR_ID in", values, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdNotIn(List<Integer> values) {
            addCriterion("PUB_USR_ID not in", values, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("PUB_USR_ID between", value1, value2, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andPubUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PUB_USR_ID not between", value1, value2, "pubUsrId");
            return (Criteria) this;
        }

        public Criteria andUpldLnkIsNull() {
            addCriterion("UPLD_LNK is null");
            return (Criteria) this;
        }

        public Criteria andUpldLnkIsNotNull() {
            addCriterion("UPLD_LNK is not null");
            return (Criteria) this;
        }

        public Criteria andUpldLnkEqualTo(String value) {
            addCriterion("UPLD_LNK =", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkNotEqualTo(String value) {
            addCriterion("UPLD_LNK <>", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkGreaterThan(String value) {
            addCriterion("UPLD_LNK >", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkGreaterThanOrEqualTo(String value) {
            addCriterion("UPLD_LNK >=", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkLessThan(String value) {
            addCriterion("UPLD_LNK <", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkLessThanOrEqualTo(String value) {
            addCriterion("UPLD_LNK <=", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkLike(String value) {
            addCriterion("UPLD_LNK like", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkNotLike(String value) {
            addCriterion("UPLD_LNK not like", value, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkIn(List<String> values) {
            addCriterion("UPLD_LNK in", values, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkNotIn(List<String> values) {
            addCriterion("UPLD_LNK not in", values, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkBetween(String value1, String value2) {
            addCriterion("UPLD_LNK between", value1, value2, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldLnkNotBetween(String value1, String value2) {
            addCriterion("UPLD_LNK not between", value1, value2, "upldLnk");
            return (Criteria) this;
        }

        public Criteria andUpldPwdIsNull() {
            addCriterion("UPLD_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUpldPwdIsNotNull() {
            addCriterion("UPLD_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUpldPwdEqualTo(String value) {
            addCriterion("UPLD_PWD =", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdNotEqualTo(String value) {
            addCriterion("UPLD_PWD <>", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdGreaterThan(String value) {
            addCriterion("UPLD_PWD >", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdGreaterThanOrEqualTo(String value) {
            addCriterion("UPLD_PWD >=", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdLessThan(String value) {
            addCriterion("UPLD_PWD <", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdLessThanOrEqualTo(String value) {
            addCriterion("UPLD_PWD <=", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdLike(String value) {
            addCriterion("UPLD_PWD like", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdNotLike(String value) {
            addCriterion("UPLD_PWD not like", value, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdIn(List<String> values) {
            addCriterion("UPLD_PWD in", values, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdNotIn(List<String> values) {
            addCriterion("UPLD_PWD not in", values, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdBetween(String value1, String value2) {
            addCriterion("UPLD_PWD between", value1, value2, "upldPwd");
            return (Criteria) this;
        }

        public Criteria andUpldPwdNotBetween(String value1, String value2) {
            addCriterion("UPLD_PWD not between", value1, value2, "upldPwd");
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