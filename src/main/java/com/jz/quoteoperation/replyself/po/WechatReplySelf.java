package com.jz.quoteoperation.replyself.po;

import java.io.Serializable;

public class WechatReplySelf implements Serializable {
    private Integer lgcSn;

    private String keyword;

    private String replycontent;

    private String replytype;

    private String status;

    private String mediaid;

    private String title;

    private String description;

    private String musicurl;

    private String hqmusicurl;

    private String thumbmediaid;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public String getReplytype() {
        return replytype;
    }

    public void setReplytype(String replytype) {
        this.replytype = replytype == null ? null : replytype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMediaid() {
        return mediaid;
    }

    public void setMediaid(String mediaid) {
        this.mediaid = mediaid == null ? null : mediaid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl == null ? null : musicurl.trim();
    }

    public String getHqmusicurl() {
        return hqmusicurl;
    }

    public void setHqmusicurl(String hqmusicurl) {
        this.hqmusicurl = hqmusicurl == null ? null : hqmusicurl.trim();
    }

    public String getThumbmediaid() {
        return thumbmediaid;
    }

    public void setThumbmediaid(String thumbmediaid) {
        this.thumbmediaid = thumbmediaid == null ? null : thumbmediaid.trim();
    }
}