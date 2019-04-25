package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public ReplyExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
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

        public Criteria andReplyIdIsNull() {
            addCriterion("REPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("REPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(String value) {
            addCriterion("REPLY_ID =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(String value) {
            addCriterion("REPLY_ID <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(String value) {
            addCriterion("REPLY_ID >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_ID >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(String value) {
            addCriterion("REPLY_ID <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(String value) {
            addCriterion("REPLY_ID <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLike(String value) {
            addCriterion("REPLY_ID like", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotLike(String value) {
            addCriterion("REPLY_ID not like", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<String> values) {
            addCriterion("REPLY_ID in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<String> values) {
            addCriterion("REPLY_ID not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(String value1, String value2) {
            addCriterion("REPLY_ID between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(String value1, String value2) {
            addCriterion("REPLY_ID not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidIsNull() {
            addCriterion("RELATIVE_ARTICLEID is null");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidIsNotNull() {
            addCriterion("RELATIVE_ARTICLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidEqualTo(String value) {
            addCriterion("RELATIVE_ARTICLEID =", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidNotEqualTo(String value) {
            addCriterion("RELATIVE_ARTICLEID <>", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidGreaterThan(String value) {
            addCriterion("RELATIVE_ARTICLEID >", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIVE_ARTICLEID >=", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidLessThan(String value) {
            addCriterion("RELATIVE_ARTICLEID <", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidLessThanOrEqualTo(String value) {
            addCriterion("RELATIVE_ARTICLEID <=", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidLike(String value) {
            addCriterion("RELATIVE_ARTICLEID like", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidNotLike(String value) {
            addCriterion("RELATIVE_ARTICLEID not like", value, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidIn(List<String> values) {
            addCriterion("RELATIVE_ARTICLEID in", values, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidNotIn(List<String> values) {
            addCriterion("RELATIVE_ARTICLEID not in", values, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidBetween(String value1, String value2) {
            addCriterion("RELATIVE_ARTICLEID between", value1, value2, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andRelativeArticleidNotBetween(String value1, String value2) {
            addCriterion("RELATIVE_ARTICLEID not between", value1, value2, "relativeArticleid");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNull() {
            addCriterion("REPLY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNotNull() {
            addCriterion("REPLY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNameEqualTo(String value) {
            addCriterion("REPLY_NAME =", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotEqualTo(String value) {
            addCriterion("REPLY_NAME <>", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThan(String value) {
            addCriterion("REPLY_NAME >", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_NAME >=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThan(String value) {
            addCriterion("REPLY_NAME <", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThanOrEqualTo(String value) {
            addCriterion("REPLY_NAME <=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLike(String value) {
            addCriterion("REPLY_NAME like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotLike(String value) {
            addCriterion("REPLY_NAME not like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameIn(List<String> values) {
            addCriterion("REPLY_NAME in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotIn(List<String> values) {
            addCriterion("REPLY_NAME not in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameBetween(String value1, String value2) {
            addCriterion("REPLY_NAME between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotBetween(String value1, String value2) {
            addCriterion("REPLY_NAME not between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("REPLY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("REPLY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("REPLY_CONTENT =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("REPLY_CONTENT <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("REPLY_CONTENT >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("REPLY_CONTENT <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("REPLY_CONTENT like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("REPLY_CONTENT not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("REPLY_CONTENT in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("REPLY_CONTENT not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("REPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("REPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("REPLY_TIME =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("REPLY_TIME <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("REPLY_TIME >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLY_TIME >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("REPLY_TIME <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("REPLY_TIME <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("REPLY_TIME in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("REPLY_TIME not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("REPLY_TIME between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("REPLY_TIME not between", value1, value2, "replyTime");
            return (Criteria) this;
        }
    }

    /**
     */
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