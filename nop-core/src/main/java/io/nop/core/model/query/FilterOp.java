/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.core.model.query;

import io.nop.api.core.annotations.core.EnumValuesMethod;
import io.nop.api.core.annotations.core.StaticFactoryMethod;
import io.nop.api.core.util.Guard;
import io.nop.commons.collections.IntHashMap;
import io.nop.commons.collections.MapOfInt;
import io.nop.commons.lang.impl.EnumLike;
import io.nop.core.lang.json.IJsonHandler;
import io.nop.core.lang.json.IJsonSerializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_ALWAYS_FALSE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_ALWAYS_TRUE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_AND;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_BETWEEN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_CONTAINS;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_DATETIME_BETWEEN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_DATE_BETWEEN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_ENDS_WITH;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_EQ;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_GE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_GT;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_ICONTAINS;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_BLANK;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_EMPTY;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_FALSE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_NULL;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_NUMBER;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_IS_TRUE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_LE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_LENGTH;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_LENGTH_BETWEEN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_LIKE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_LT;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_BLANK;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_EMPTY;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_FALSE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_IN;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_NULL;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_NUMBER;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_NOT_TRUE;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_OR;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_REGEX;
import static io.nop.api.core.beans.FilterBeanConstants.FILTER_OP_STARTS_WITH;
import static io.nop.commons.util.CollectionHelper.buildImmutableList;

public class FilterOp extends EnumLike<FilterOp> implements IJsonSerializable {
    private final FilterOpType type;
    private final BiPredicate<Object, Object> biPredicate;
    private final Predicate<Object> predicate;
    private final IBetweenOperator betweenOperator;

    protected FilterOp(String name, int ordinal, FilterOpType type, BiPredicate<Object, Object> biPredicate,
                       Predicate<Object> predicate, IBetweenOperator betweenOperator) {
        super(name, ordinal);
        this.type = type;
        this.biPredicate = biPredicate;
        this.predicate = predicate;
        this.betweenOperator = betweenOperator;

        Guard.checkArgument(!nameMap.containsKey(name), "duplicate filterOp with the same name", name);
        Guard.checkArgument(!indexMap.containsKey(ordinal), "duplicate filterOp ordinal", ordinal);

        nameMap.put(name, this);
        indexMap.put(ordinal, this);
    }

    public static FilterOp groupOp(String name, int ordinal) {
        return new FilterOp(name, ordinal, FilterOpType.GROUP_OP, null, null, null);
    }

    public static FilterOp assertOp(String name, int ordinal, Predicate<Object> predicate) {
        return new FilterOp(name, ordinal, FilterOpType.ASSERT_OP, null, predicate, null);
    }

    public static FilterOp compareOp(String name, int ordinal, BiPredicate<Object, Object> biPredicate) {
        return new FilterOp(name, ordinal, FilterOpType.COMPARE_OP, biPredicate, null, null);
    }

    public static FilterOp betweenOp(String name, int ordinal, IBetweenOperator operator) {
        return new FilterOp(name, ordinal, FilterOpType.BETWEEN_OP, null, null, operator);
    }

    public static FilterOp fixedValue(String name, int ordinal) {
        return new FilterOp(name, ordinal, FilterOpType.FIXED_VALUE, null, null, null);
    }

    static class Serialization implements Serializable {
        private static final long serialVersionUID = 8078935193402089396L;
        private final int ordinal;

        public Serialization(int ordinal) {
            this.ordinal = ordinal;
        }

        protected Object readResolved() {
            return FilterOp.fromOrdinal(ordinal);
        }
    }

    protected Serialization writeReplaced() {
        return new Serialization(ordinal());
    }

    static Map<String, FilterOp> nameMap = new HashMap<>();
    static MapOfInt<FilterOp> indexMap = new IntHashMap<>();

    @EnumValuesMethod
    public static List<FilterOp> all() {
        List<FilterOp> list = new ArrayList<>(nameMap.values());
        Collections.sort(list, Comparator.comparingInt(FilterOp::ordinal));
        return list;
    }

    @StaticFactoryMethod
    public static FilterOp fromName(String name) {
        return nameMap.get(name);
    }

    public static FilterOp fromOrdinal(int ordinal) {
        return indexMap.get(ordinal);
    }

    @Override
    public void serializeToJson(IJsonHandler out) {
        out.value(null, name());
    }

    public FilterOp negate(boolean includeMathCompare) {
        if (this == ALWAYS_TRUE)
            return ALWAYS_FALSE;
        if (this == ALWAYS_FALSE)
            return ALWAYS_TRUE;
        if (this == IS_NULL)
            return NOT_NULL;
        if (this == NOT_NULL)
            return IS_NULL;
        if (this == IS_EMPTY)
            return NOT_EMPTY;
        if (this == NOT_EMPTY)
            return IS_EMPTY;
        if (this == IS_BLANK)
            return NOT_BLANK;
        if (this == NOT_BLANK)
            return IS_BLANK;

        if (this == EQ)
            return NE;

        if (this == NE)
            return EQ;

        if (this == IN)
            return NOT_IN;

        if (this == NOT_IN)
            return IN;

        if (this == IS_TRUE)
            return IS_FALSE;
        if (this == IS_FALSE)
            return IS_TRUE;

        if (includeMathCompare) {
            if (this == GT)
                return LE;
            if (this == GE)
                return LT;
            if (this == LE)
                return GT;
            if (this == LT)
                return GE;
        }
        return null;
    }

    public FilterOp flipLR() {
        if (this == EQ || this == NE)
            return this;

        if (this == LT)
            return GT;
        if (this == LE)
            return GE;
        if (this == GE)
            return LE;
        if (this == GT)
            return LT;

        return null;
    }

    public String label() {
        return name();
    }

    public FilterOpType getType() {
        return type;
    }

    public BiPredicate<Object, Object> getBiPredicate() {
        return biPredicate;
    }

    public Predicate<Object> getPredicate() {
        return predicate;
    }

    public IBetweenOperator getBetweenOperator() {
        return betweenOperator;
    }

    public String getMathSymbol() {
        if (this == EQ) {
            return "=";
        } else if (this == LT) {
            return "<";
        } else if (this == LE) {
            return "<=";
        } else if (this == GT) {
            return ">";
        } else if (this == GE) {
            return ">=";
        }
        return null;
    }

    public static final FilterOp AND = groupOp(FILTER_OP_AND, 0);
    public static final FilterOp OR = groupOp(FILTER_OP_OR, 1);
    public static final FilterOp NOT = groupOp(FILTER_OP_NOT, 2);
    public static final FilterOp ALWAYS_TRUE = fixedValue(FILTER_OP_ALWAYS_TRUE, 4);
    public static final FilterOp ALWAYS_FALSE = fixedValue(FILTER_OP_ALWAYS_FALSE, 5);

    public static final FilterOp IS_BLANK = assertOp(FILTER_OP_IS_BLANK, 10, FilterOpHelper::isBlank);
    public static final FilterOp NOT_BLANK = assertOp(FILTER_OP_NOT_BLANK, 11, FilterOpHelper::notBlank);
    public static final FilterOp IS_NULL = assertOp(FILTER_OP_IS_NULL, 12, FilterOpHelper::isNull);
    public static final FilterOp NOT_NULL = assertOp(FILTER_OP_NOT_NULL, 13, FilterOpHelper::notNull);
    public static final FilterOp IS_EMPTY = assertOp(FILTER_OP_IS_EMPTY, 14, FilterOpHelper::isEmpty);
    public static final FilterOp NOT_EMPTY = assertOp(FILTER_OP_NOT_EMPTY, 15, FilterOpHelper::notEmpty);
    public static final FilterOp IS_NUMBER = assertOp(FILTER_OP_IS_NUMBER, 16, FilterOpHelper::isNumber);
    public static final FilterOp NOT_NUMBER = assertOp(FILTER_OP_NOT_NUMBER, 17, FilterOpHelper::notNumber);
    public static final FilterOp IS_TRUE = assertOp(FILTER_OP_IS_TRUE, 18, FilterOpHelper::isTrue);
    public static final FilterOp IS_FALSE = assertOp(FILTER_OP_IS_FALSE, 19, FilterOpHelper::isFalse);
    public static final FilterOp NOT_TRUE = assertOp(FILTER_OP_NOT_TRUE, 20, FilterOpHelper::notTrue);
    public static final FilterOp NOT_FALSE = assertOp(FILTER_OP_NOT_FALSE, 21, FilterOpHelper::notFalse);

    public static final List<FilterOp> DEFAULT_ASSERT_OPS = buildImmutableList(IS_BLANK, NOT_BLANK, IS_NULL, NOT_NULL,
            IS_EMPTY, NOT_EMPTY, IS_NUMBER, NOT_NUMBER, IS_TRUE, IS_FALSE, NOT_TRUE, NOT_FALSE);

    public static final FilterOp EQ = compareOp(FILTER_OP_EQ, 30, FilterOpHelper::eq);
    public static final FilterOp NE = compareOp(FILTER_OP_NE, 31, FilterOpHelper::ne);
    public static final FilterOp GT = compareOp(FILTER_OP_GT, 32, FilterOpHelper::gt);
    public static final FilterOp GE = compareOp(FILTER_OP_GE, 33, FilterOpHelper::ge);
    public static final FilterOp LT = compareOp(FILTER_OP_LT, 34, FilterOpHelper::lt);
    public static final FilterOp LE = compareOp(FILTER_OP_LE, 35, FilterOpHelper::le);
    public static final FilterOp IN = compareOp(FILTER_OP_IN, 36, FilterOpHelper::in);
    public static final FilterOp NOT_IN = compareOp(FILTER_OP_NOT_IN, 37, FilterOpHelper::in);
    public static final FilterOp STARTS_WITH = compareOp(FILTER_OP_STARTS_WITH, 38, FilterOpHelper::startsWith);
    public static final FilterOp ENDS_WITH = compareOp(FILTER_OP_ENDS_WITH, 39, FilterOpHelper::endsWith);
    public static final FilterOp CONTAINS = compareOp(FILTER_OP_CONTAINS, 40, FilterOpHelper::contains);
    public static final FilterOp LENGTH = compareOp(FILTER_OP_LENGTH, 41, FilterOpHelper::length);
    public static final FilterOp REGEX = compareOp(FILTER_OP_REGEX, 42, FilterOpHelper::regex);
    public static final FilterOp ICONTAINS = compareOp(FILTER_OP_ICONTAINS, 43, FilterOpHelper::icontains);
    public static final FilterOp LIKE = compareOp(FILTER_OP_LIKE, 44, FilterOpHelper::like);

    public static final List<FilterOp> DEFAULT_COMPARE_OPS = buildImmutableList(EQ, NE, GT, GE, LT, LE, IN, NOT_IN,
            STARTS_WITH, ENDS_WITH, CONTAINS, LENGTH, REGEX, ICONTAINS, LIKE);

    public static final FilterOp BETWEEN = betweenOp(FILTER_OP_BETWEEN, 50, FilterOpHelper::between);
    public static final FilterOp DATE_BETWEEN = betweenOp(FILTER_OP_DATE_BETWEEN, 51, FilterOpHelper::dateBetween);
    public static final FilterOp DATETIME_BETWEEN = betweenOp(FILTER_OP_DATETIME_BETWEEN, 52,
            FilterOpHelper::dateTimeBetween);
    public static final FilterOp LENGTH_BETWEEN = betweenOp(FILTER_OP_LENGTH_BETWEEN, 53,
            FilterOpHelper::lengthBetween);
}