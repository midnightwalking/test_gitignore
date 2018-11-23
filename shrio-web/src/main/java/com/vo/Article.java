package com.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * article
 * @author 
 */
public class Article implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章类型
     */
    private String type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章简介
     */
    private String simpleIntroduction;

    /**
     * 浏览人数
     */
    private Integer visitCount;

    /**
     * 本地存放的URL地址
     */
    private String shrinkImgUrl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//set
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//get
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSimpleIntroduction() {
        return simpleIntroduction;
    }

    public void setSimpleIntroduction(String simpleIntroduction) {
        this.simpleIntroduction = simpleIntroduction;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public String getShrinkImgUrl() {
        return shrinkImgUrl;
    }

    public void setShrinkImgUrl(String shrinkImgUrl) {
        this.shrinkImgUrl = shrinkImgUrl;
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
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSimpleIntroduction() == null ? other.getSimpleIntroduction() == null : this.getSimpleIntroduction().equals(other.getSimpleIntroduction()))
            && (this.getVisitCount() == null ? other.getVisitCount() == null : this.getVisitCount().equals(other.getVisitCount()))
            && (this.getShrinkImgUrl() == null ? other.getShrinkImgUrl() == null : this.getShrinkImgUrl().equals(other.getShrinkImgUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSimpleIntroduction() == null) ? 0 : getSimpleIntroduction().hashCode());
        result = prime * result + ((getVisitCount() == null) ? 0 : getVisitCount().hashCode());
        result = prime * result + ((getShrinkImgUrl() == null) ? 0 : getShrinkImgUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", content=").append(content);
        sb.append(", simpleIntroduction=").append(simpleIntroduction);
        sb.append(", visitCount=").append(visitCount);
        sb.append(", shrinkImgUrl=").append(shrinkImgUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}