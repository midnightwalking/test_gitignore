package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public ArticleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`TYPE` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`TYPE` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`TYPE` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`TYPE` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`TYPE` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`TYPE` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`TYPE` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`TYPE` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`TYPE` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`TYPE` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`TYPE` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`TYPE` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionIsNull() {
            addCriterion("SIMPLE_INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionIsNotNull() {
            addCriterion("SIMPLE_INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionEqualTo(String value) {
            addCriterion("SIMPLE_INTRODUCTION =", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionNotEqualTo(String value) {
            addCriterion("SIMPLE_INTRODUCTION <>", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionGreaterThan(String value) {
            addCriterion("SIMPLE_INTRODUCTION >", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("SIMPLE_INTRODUCTION >=", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionLessThan(String value) {
            addCriterion("SIMPLE_INTRODUCTION <", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionLessThanOrEqualTo(String value) {
            addCriterion("SIMPLE_INTRODUCTION <=", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionLike(String value) {
            addCriterion("SIMPLE_INTRODUCTION like", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionNotLike(String value) {
            addCriterion("SIMPLE_INTRODUCTION not like", value, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionIn(List<String> values) {
            addCriterion("SIMPLE_INTRODUCTION in", values, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionNotIn(List<String> values) {
            addCriterion("SIMPLE_INTRODUCTION not in", values, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionBetween(String value1, String value2) {
            addCriterion("SIMPLE_INTRODUCTION between", value1, value2, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andSimpleIntroductionNotBetween(String value1, String value2) {
            addCriterion("SIMPLE_INTRODUCTION not between", value1, value2, "simpleIntroduction");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNull() {
            addCriterion("VISIT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNotNull() {
            addCriterion("VISIT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountEqualTo(Integer value) {
            addCriterion("VISIT_COUNT =", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotEqualTo(Integer value) {
            addCriterion("VISIT_COUNT <>", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThan(Integer value) {
            addCriterion("VISIT_COUNT >", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISIT_COUNT >=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThan(Integer value) {
            addCriterion("VISIT_COUNT <", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThanOrEqualTo(Integer value) {
            addCriterion("VISIT_COUNT <=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountIn(List<Integer> values) {
            addCriterion("VISIT_COUNT in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotIn(List<Integer> values) {
            addCriterion("VISIT_COUNT not in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_COUNT between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_COUNT not between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlIsNull() {
            addCriterion("SHRINK_IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlIsNotNull() {
            addCriterion("SHRINK_IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlEqualTo(String value) {
            addCriterion("SHRINK_IMG_URL =", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlNotEqualTo(String value) {
            addCriterion("SHRINK_IMG_URL <>", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlGreaterThan(String value) {
            addCriterion("SHRINK_IMG_URL >", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SHRINK_IMG_URL >=", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlLessThan(String value) {
            addCriterion("SHRINK_IMG_URL <", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlLessThanOrEqualTo(String value) {
            addCriterion("SHRINK_IMG_URL <=", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlLike(String value) {
            addCriterion("SHRINK_IMG_URL like", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlNotLike(String value) {
            addCriterion("SHRINK_IMG_URL not like", value, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlIn(List<String> values) {
            addCriterion("SHRINK_IMG_URL in", values, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlNotIn(List<String> values) {
            addCriterion("SHRINK_IMG_URL not in", values, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlBetween(String value1, String value2) {
            addCriterion("SHRINK_IMG_URL between", value1, value2, "shrinkImgUrl");
            return (Criteria) this;
        }

        public Criteria andShrinkImgUrlNotBetween(String value1, String value2) {
            addCriterion("SHRINK_IMG_URL not between", value1, value2, "shrinkImgUrl");
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