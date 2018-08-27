package com.jz.quoteoperation.replyself.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WechatReplySelfExample  {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatReplySelfExample() {
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

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("Replycontent is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("Replycontent is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("Replycontent =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("Replycontent <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("Replycontent >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("Replycontent >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("Replycontent <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("Replycontent <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("Replycontent like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("Replycontent not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("Replycontent in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("Replycontent not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("Replycontent between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("Replycontent not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplytypeIsNull() {
            addCriterion("Replytype is null");
            return (Criteria) this;
        }

        public Criteria andReplytypeIsNotNull() {
            addCriterion("Replytype is not null");
            return (Criteria) this;
        }

        public Criteria andReplytypeEqualTo(String value) {
            addCriterion("Replytype =", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeNotEqualTo(String value) {
            addCriterion("Replytype <>", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeGreaterThan(String value) {
            addCriterion("Replytype >", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("Replytype >=", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeLessThan(String value) {
            addCriterion("Replytype <", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeLessThanOrEqualTo(String value) {
            addCriterion("Replytype <=", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeLike(String value) {
            addCriterion("Replytype like", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeNotLike(String value) {
            addCriterion("Replytype not like", value, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeIn(List<String> values) {
            addCriterion("Replytype in", values, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeNotIn(List<String> values) {
            addCriterion("Replytype not in", values, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeBetween(String value1, String value2) {
            addCriterion("Replytype between", value1, value2, "replytype");
            return (Criteria) this;
        }

        public Criteria andReplytypeNotBetween(String value1, String value2) {
            addCriterion("Replytype not between", value1, value2, "replytype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNull() {
            addCriterion("Mediaid is null");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNotNull() {
            addCriterion("Mediaid is not null");
            return (Criteria) this;
        }

        public Criteria andMediaidEqualTo(String value) {
            addCriterion("Mediaid =", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotEqualTo(String value) {
            addCriterion("Mediaid <>", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThan(String value) {
            addCriterion("Mediaid >", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThanOrEqualTo(String value) {
            addCriterion("Mediaid >=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThan(String value) {
            addCriterion("Mediaid <", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThanOrEqualTo(String value) {
            addCriterion("Mediaid <=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLike(String value) {
            addCriterion("Mediaid like", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotLike(String value) {
            addCriterion("Mediaid not like", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidIn(List<String> values) {
            addCriterion("Mediaid in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotIn(List<String> values) {
            addCriterion("Mediaid not in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidBetween(String value1, String value2) {
            addCriterion("Mediaid between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotBetween(String value1, String value2) {
            addCriterion("Mediaid not between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMusicurlIsNull() {
            addCriterion("MusicURL is null");
            return (Criteria) this;
        }

        public Criteria andMusicurlIsNotNull() {
            addCriterion("MusicURL is not null");
            return (Criteria) this;
        }

        public Criteria andMusicurlEqualTo(String value) {
            addCriterion("MusicURL =", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotEqualTo(String value) {
            addCriterion("MusicURL <>", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlGreaterThan(String value) {
            addCriterion("MusicURL >", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlGreaterThanOrEqualTo(String value) {
            addCriterion("MusicURL >=", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLessThan(String value) {
            addCriterion("MusicURL <", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLessThanOrEqualTo(String value) {
            addCriterion("MusicURL <=", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlLike(String value) {
            addCriterion("MusicURL like", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotLike(String value) {
            addCriterion("MusicURL not like", value, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlIn(List<String> values) {
            addCriterion("MusicURL in", values, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotIn(List<String> values) {
            addCriterion("MusicURL not in", values, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlBetween(String value1, String value2) {
            addCriterion("MusicURL between", value1, value2, "musicurl");
            return (Criteria) this;
        }

        public Criteria andMusicurlNotBetween(String value1, String value2) {
            addCriterion("MusicURL not between", value1, value2, "musicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlIsNull() {
            addCriterion("HQMusicUrl is null");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlIsNotNull() {
            addCriterion("HQMusicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlEqualTo(String value) {
            addCriterion("HQMusicUrl =", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlNotEqualTo(String value) {
            addCriterion("HQMusicUrl <>", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlGreaterThan(String value) {
            addCriterion("HQMusicUrl >", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlGreaterThanOrEqualTo(String value) {
            addCriterion("HQMusicUrl >=", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlLessThan(String value) {
            addCriterion("HQMusicUrl <", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlLessThanOrEqualTo(String value) {
            addCriterion("HQMusicUrl <=", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlLike(String value) {
            addCriterion("HQMusicUrl like", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlNotLike(String value) {
            addCriterion("HQMusicUrl not like", value, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlIn(List<String> values) {
            addCriterion("HQMusicUrl in", values, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlNotIn(List<String> values) {
            addCriterion("HQMusicUrl not in", values, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlBetween(String value1, String value2) {
            addCriterion("HQMusicUrl between", value1, value2, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andHqmusicurlNotBetween(String value1, String value2) {
            addCriterion("HQMusicUrl not between", value1, value2, "hqmusicurl");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidIsNull() {
            addCriterion("ThumbMediaId is null");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidIsNotNull() {
            addCriterion("ThumbMediaId is not null");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidEqualTo(String value) {
            addCriterion("ThumbMediaId =", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidNotEqualTo(String value) {
            addCriterion("ThumbMediaId <>", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidGreaterThan(String value) {
            addCriterion("ThumbMediaId >", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidGreaterThanOrEqualTo(String value) {
            addCriterion("ThumbMediaId >=", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidLessThan(String value) {
            addCriterion("ThumbMediaId <", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidLessThanOrEqualTo(String value) {
            addCriterion("ThumbMediaId <=", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidLike(String value) {
            addCriterion("ThumbMediaId like", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidNotLike(String value) {
            addCriterion("ThumbMediaId not like", value, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidIn(List<String> values) {
            addCriterion("ThumbMediaId in", values, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidNotIn(List<String> values) {
            addCriterion("ThumbMediaId not in", values, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidBetween(String value1, String value2) {
            addCriterion("ThumbMediaId between", value1, value2, "thumbmediaid");
            return (Criteria) this;
        }

        public Criteria andThumbmediaidNotBetween(String value1, String value2) {
            addCriterion("ThumbMediaId not between", value1, value2, "thumbmediaid");
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