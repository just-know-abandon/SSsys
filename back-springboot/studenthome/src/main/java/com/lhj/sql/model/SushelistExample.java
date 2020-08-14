package com.lhj.sql.model;

import java.util.ArrayList;
import java.util.List;

public class SushelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SushelistExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSushehaoIsNull() {
            addCriterion("sushehao is null");
            return (Criteria) this;
        }

        public Criteria andSushehaoIsNotNull() {
            addCriterion("sushehao is not null");
            return (Criteria) this;
        }

        public Criteria andSushehaoEqualTo(String value) {
            addCriterion("sushehao =", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotEqualTo(String value) {
            addCriterion("sushehao <>", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoGreaterThan(String value) {
            addCriterion("sushehao >", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoGreaterThanOrEqualTo(String value) {
            addCriterion("sushehao >=", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLessThan(String value) {
            addCriterion("sushehao <", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLessThanOrEqualTo(String value) {
            addCriterion("sushehao <=", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLike(String value) {
            addCriterion("sushehao like", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotLike(String value) {
            addCriterion("sushehao not like", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoIn(List<String> values) {
            addCriterion("sushehao in", values, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotIn(List<String> values) {
            addCriterion("sushehao not in", values, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoBetween(String value1, String value2) {
            addCriterion("sushehao between", value1, value2, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotBetween(String value1, String value2) {
            addCriterion("sushehao not between", value1, value2, "sushehao");
            return (Criteria) this;
        }

        public Criteria andRenshuIsNull() {
            addCriterion("renshu is null");
            return (Criteria) this;
        }

        public Criteria andRenshuIsNotNull() {
            addCriterion("renshu is not null");
            return (Criteria) this;
        }

        public Criteria andRenshuEqualTo(String value) {
            addCriterion("renshu =", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotEqualTo(String value) {
            addCriterion("renshu <>", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuGreaterThan(String value) {
            addCriterion("renshu >", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuGreaterThanOrEqualTo(String value) {
            addCriterion("renshu >=", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuLessThan(String value) {
            addCriterion("renshu <", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuLessThanOrEqualTo(String value) {
            addCriterion("renshu <=", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuLike(String value) {
            addCriterion("renshu like", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotLike(String value) {
            addCriterion("renshu not like", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuIn(List<String> values) {
            addCriterion("renshu in", values, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotIn(List<String> values) {
            addCriterion("renshu not in", values, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuBetween(String value1, String value2) {
            addCriterion("renshu between", value1, value2, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotBetween(String value1, String value2) {
            addCriterion("renshu not between", value1, value2, "renshu");
            return (Criteria) this;
        }

        public Criteria andShezhangIsNull() {
            addCriterion("shezhang is null");
            return (Criteria) this;
        }

        public Criteria andShezhangIsNotNull() {
            addCriterion("shezhang is not null");
            return (Criteria) this;
        }

        public Criteria andShezhangEqualTo(String value) {
            addCriterion("shezhang =", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangNotEqualTo(String value) {
            addCriterion("shezhang <>", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangGreaterThan(String value) {
            addCriterion("shezhang >", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangGreaterThanOrEqualTo(String value) {
            addCriterion("shezhang >=", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangLessThan(String value) {
            addCriterion("shezhang <", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangLessThanOrEqualTo(String value) {
            addCriterion("shezhang <=", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangLike(String value) {
            addCriterion("shezhang like", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangNotLike(String value) {
            addCriterion("shezhang not like", value, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangIn(List<String> values) {
            addCriterion("shezhang in", values, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangNotIn(List<String> values) {
            addCriterion("shezhang not in", values, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangBetween(String value1, String value2) {
            addCriterion("shezhang between", value1, value2, "shezhang");
            return (Criteria) this;
        }

        public Criteria andShezhangNotBetween(String value1, String value2) {
            addCriterion("shezhang not between", value1, value2, "shezhang");
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