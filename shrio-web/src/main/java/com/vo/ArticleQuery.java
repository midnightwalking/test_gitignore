package com.vo;

import java.util.Date;

/**
 * @author qiuzhi
 * @date 2018/11/23
 * @description
 */
public class ArticleQuery {
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

    /**
     * 文章内容
     */
    private String content;

    /**
     * 页面信息
     */
    private int limit;

    private int offset;



    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }



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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleQuery{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                ", simpleIntroduction='" + simpleIntroduction + '\'' +
                ", visitCount=" + visitCount +
                ", shrinkImgUrl='" + shrinkImgUrl + '\'' +
                ", content='" + content + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
