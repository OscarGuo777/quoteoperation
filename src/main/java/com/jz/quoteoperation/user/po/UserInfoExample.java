package com.jz.quoteoperation.user.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUsrAcntIsNull() {
            addCriterion("USR_ACNT is null");
            return (Criteria) this;
        }

        public Criteria andUsrAcntIsNotNull() {
            addCriterion("USR_ACNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAcntEqualTo(String value) {
            addCriterion("USR_ACNT =", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntNotEqualTo(String value) {
            addCriterion("USR_ACNT <>", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntGreaterThan(String value) {
            addCriterion("USR_ACNT >", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ACNT >=", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntLessThan(String value) {
            addCriterion("USR_ACNT <", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntLessThanOrEqualTo(String value) {
            addCriterion("USR_ACNT <=", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntLike(String value) {
            addCriterion("USR_ACNT like", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntNotLike(String value) {
            addCriterion("USR_ACNT not like", value, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntIn(List<String> values) {
            addCriterion("USR_ACNT in", values, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntNotIn(List<String> values) {
            addCriterion("USR_ACNT not in", values, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntBetween(String value1, String value2) {
            addCriterion("USR_ACNT between", value1, value2, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrAcntNotBetween(String value1, String value2) {
            addCriterion("USR_ACNT not between", value1, value2, "usrAcnt");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIsNull() {
            addCriterion("USR_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIsNotNull() {
            addCriterion("USR_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPwdEqualTo(String value) {
            addCriterion("USR_PWD =", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotEqualTo(String value) {
            addCriterion("USR_PWD <>", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdGreaterThan(String value) {
            addCriterion("USR_PWD >", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PWD >=", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLessThan(String value) {
            addCriterion("USR_PWD <", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLessThanOrEqualTo(String value) {
            addCriterion("USR_PWD <=", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdLike(String value) {
            addCriterion("USR_PWD like", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotLike(String value) {
            addCriterion("USR_PWD not like", value, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdIn(List<String> values) {
            addCriterion("USR_PWD in", values, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotIn(List<String> values) {
            addCriterion("USR_PWD not in", values, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdBetween(String value1, String value2) {
            addCriterion("USR_PWD between", value1, value2, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrPwdNotBetween(String value1, String value2) {
            addCriterion("USR_PWD not between", value1, value2, "usrPwd");
            return (Criteria) this;
        }

        public Criteria andUsrNmIsNull() {
            addCriterion("USR_NM is null");
            return (Criteria) this;
        }

        public Criteria andUsrNmIsNotNull() {
            addCriterion("USR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNmEqualTo(String value) {
            addCriterion("USR_NM =", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmNotEqualTo(String value) {
            addCriterion("USR_NM <>", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmGreaterThan(String value) {
            addCriterion("USR_NM >", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NM >=", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmLessThan(String value) {
            addCriterion("USR_NM <", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmLessThanOrEqualTo(String value) {
            addCriterion("USR_NM <=", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmLike(String value) {
            addCriterion("USR_NM like", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmNotLike(String value) {
            addCriterion("USR_NM not like", value, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmIn(List<String> values) {
            addCriterion("USR_NM in", values, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmNotIn(List<String> values) {
            addCriterion("USR_NM not in", values, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmBetween(String value1, String value2) {
            addCriterion("USR_NM between", value1, value2, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrNmNotBetween(String value1, String value2) {
            addCriterion("USR_NM not between", value1, value2, "usrNm");
            return (Criteria) this;
        }

        public Criteria andUsrMobiIsNull() {
            addCriterion("USR_MOBI is null");
            return (Criteria) this;
        }

        public Criteria andUsrMobiIsNotNull() {
            addCriterion("USR_MOBI is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMobiEqualTo(String value) {
            addCriterion("USR_MOBI =", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiNotEqualTo(String value) {
            addCriterion("USR_MOBI <>", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiGreaterThan(String value) {
            addCriterion("USR_MOBI >", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiGreaterThanOrEqualTo(String value) {
            addCriterion("USR_MOBI >=", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiLessThan(String value) {
            addCriterion("USR_MOBI <", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiLessThanOrEqualTo(String value) {
            addCriterion("USR_MOBI <=", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiLike(String value) {
            addCriterion("USR_MOBI like", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiNotLike(String value) {
            addCriterion("USR_MOBI not like", value, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiIn(List<String> values) {
            addCriterion("USR_MOBI in", values, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiNotIn(List<String> values) {
            addCriterion("USR_MOBI not in", values, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiBetween(String value1, String value2) {
            addCriterion("USR_MOBI between", value1, value2, "usrMobi");
            return (Criteria) this;
        }

        public Criteria andUsrMobiNotBetween(String value1, String value2) {
            addCriterion("USR_MOBI not between", value1, value2, "usrMobi");
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