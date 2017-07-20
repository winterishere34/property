package com.madeofwu.property.bean;

import java.util.ArrayList;
import java.util.List;

public class ServesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServesExample() {
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

        public Criteria andServeIdIsNull() {
            addCriterion("serve_id is null");
            return (Criteria) this;
        }

        public Criteria andServeIdIsNotNull() {
            addCriterion("serve_id is not null");
            return (Criteria) this;
        }

        public Criteria andServeIdEqualTo(Integer value) {
            addCriterion("serve_id =", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdNotEqualTo(Integer value) {
            addCriterion("serve_id <>", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdGreaterThan(Integer value) {
            addCriterion("serve_id >", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("serve_id >=", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdLessThan(Integer value) {
            addCriterion("serve_id <", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdLessThanOrEqualTo(Integer value) {
            addCriterion("serve_id <=", value, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdIn(List<Integer> values) {
            addCriterion("serve_id in", values, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdNotIn(List<Integer> values) {
            addCriterion("serve_id not in", values, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdBetween(Integer value1, Integer value2) {
            addCriterion("serve_id between", value1, value2, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("serve_id not between", value1, value2, "serveId");
            return (Criteria) this;
        }

        public Criteria andServeNameIsNull() {
            addCriterion("serve_name is null");
            return (Criteria) this;
        }

        public Criteria andServeNameIsNotNull() {
            addCriterion("serve_name is not null");
            return (Criteria) this;
        }

        public Criteria andServeNameEqualTo(String value) {
            addCriterion("serve_name =", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotEqualTo(String value) {
            addCriterion("serve_name <>", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameGreaterThan(String value) {
            addCriterion("serve_name >", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameGreaterThanOrEqualTo(String value) {
            addCriterion("serve_name >=", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLessThan(String value) {
            addCriterion("serve_name <", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLessThanOrEqualTo(String value) {
            addCriterion("serve_name <=", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLike(String value) {
            addCriterion("serve_name like", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotLike(String value) {
            addCriterion("serve_name not like", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameIn(List<String> values) {
            addCriterion("serve_name in", values, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotIn(List<String> values) {
            addCriterion("serve_name not in", values, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameBetween(String value1, String value2) {
            addCriterion("serve_name between", value1, value2, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotBetween(String value1, String value2) {
            addCriterion("serve_name not between", value1, value2, "serveName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andServeTimeIsNull() {
            addCriterion("serve_time is null");
            return (Criteria) this;
        }

        public Criteria andServeTimeIsNotNull() {
            addCriterion("serve_time is not null");
            return (Criteria) this;
        }

        public Criteria andServeTimeEqualTo(String value) {
            addCriterion("serve_time =", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotEqualTo(String value) {
            addCriterion("serve_time <>", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeGreaterThan(String value) {
            addCriterion("serve_time >", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("serve_time >=", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeLessThan(String value) {
            addCriterion("serve_time <", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeLessThanOrEqualTo(String value) {
            addCriterion("serve_time <=", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeLike(String value) {
            addCriterion("serve_time like", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotLike(String value) {
            addCriterion("serve_time not like", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeIn(List<String> values) {
            addCriterion("serve_time in", values, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotIn(List<String> values) {
            addCriterion("serve_time not in", values, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeBetween(String value1, String value2) {
            addCriterion("serve_time between", value1, value2, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotBetween(String value1, String value2) {
            addCriterion("serve_time not between", value1, value2, "serveTime");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
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