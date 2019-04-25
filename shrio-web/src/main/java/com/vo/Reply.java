package com.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * reply
 * @author 
 */
public class Reply implements Serializable {
    /**
     * 回复ID
     */
    private String replyId;

    /**
     * 关联文章ID
     */
    private String relativeArticleid;

    /**
     * 回复人姓名
     */
    private String replyName;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private Date replyTime;

    private static final long serialVersionUID = 1L;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getRelativeArticleid() {
        return relativeArticleid;
    }

    public void setRelativeArticleid(String relativeArticleid) {
        this.relativeArticleid = relativeArticleid;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//set
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//get
    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Reply other = (Reply) that;
        return (this.getReplyId() == null ? other.getReplyId() == null : this.getReplyId().equals(other.getReplyId()))
            && (this.getRelativeArticleid() == null ? other.getRelativeArticleid() == null : this.getRelativeArticleid().equals(other.getRelativeArticleid()))
            && (this.getReplyName() == null ? other.getReplyName() == null : this.getReplyName().equals(other.getReplyName()))
            && (this.getReplyContent() == null ? other.getReplyContent() == null : this.getReplyContent().equals(other.getReplyContent()))
            && (this.getReplyTime() == null ? other.getReplyTime() == null : this.getReplyTime().equals(other.getReplyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReplyId() == null) ? 0 : getReplyId().hashCode());
        result = prime * result + ((getRelativeArticleid() == null) ? 0 : getRelativeArticleid().hashCode());
        result = prime * result + ((getReplyName() == null) ? 0 : getReplyName().hashCode());
        result = prime * result + ((getReplyContent() == null) ? 0 : getReplyContent().hashCode());
        result = prime * result + ((getReplyTime() == null) ? 0 : getReplyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", replyId=").append(replyId);
        sb.append(", relativeArticleid=").append(relativeArticleid);
        sb.append(", replyName=").append(replyName);
        sb.append(", replyContent=").append(replyContent);
        sb.append(", replyTime=").append(replyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}