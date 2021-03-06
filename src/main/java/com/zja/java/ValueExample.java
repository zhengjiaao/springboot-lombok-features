/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:24
 * @Since:
 */
package com.zja.java;

import java.util.Arrays;

/**
 * java 示例
 */
public final class ValueExample {
    private final String name;
    private int age;
    private final double score;
    protected final String[] tags;

    @java.beans.ConstructorProperties({"name", "age", "score", "tags"})
    public ValueExample(String name, int age, double score, String[] tags) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.tags = tags;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getScore() {
        return this.score;
    }

    public String[] getTags() {
        return this.tags;
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ValueExample)) return false;
        final ValueExample other = (ValueExample)o;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
        if (!Arrays.deepEquals(this.getTags(), other.getTags())) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        final long $score = Double.doubleToLongBits(this.getScore());
        result = result * PRIME + (int)($score >>> 32 ^ $score);
        result = result * PRIME + Arrays.deepHashCode(this.getTags());
        return result;
    }

    @java.lang.Override
    public String toString() {
        return "ValueExample(name=" + getName() + ", age=" + getAge() + ", score=" + getScore() + ", tags=" + Arrays.deepToString(getTags()) + ")";
    }

    ValueExample withAge(int age) {
        return this.age == age ? this : new ValueExample(name, age, score, tags);
    }

    public static final class Exercise<T> {
        private final String name;
        private final T value;

        private Exercise(String name, T value) {
            this.name = name;
            this.value = value;
        }

        public static <T> Exercise<T> of(String name, T value) {
            return new Exercise<T>(name, value);
        }

        public String getName() {
            return this.name;
        }

        public T getValue() {
            return this.value;
        }

        @java.lang.Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof ValueExample.Exercise)) return false;
            final Exercise<?> other = (Exercise<?>)o;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$value = this.getValue();
            final Object other$value = other.getValue();
            if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $value = this.getValue();
            result = result * PRIME + ($value == null ? 43 : $value.hashCode());
            return result;
        }

        @java.lang.Override
        public String toString() {
            return "ValueExample.Exercise(name=" + getName() + ", value=" + getValue() + ")";
        }
    }
}
