/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:17
 * @Since:
 */
package com.zja.java;

import java.util.Arrays;

/**
 * java 示例
 */
public class DataExample {
    private final String name;
    private int age;
    private double score;
    private String[] tags;

    public DataExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public String[] getTags() {
        return this.tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "DataExampleJava(" + this.getName() + ", " + this.getAge() + ", " + this.getScore() + ", " + Arrays.deepToString(this.getTags()) + ")";
    }

    protected boolean canEqual(Object other) {
        return other instanceof DataExample;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DataExample)) return false;
        DataExample other = (DataExample) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
        if (!Arrays.deepEquals(this.getTags(), other.getTags())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long temp1 = Double.doubleToLongBits(this.getScore());
        result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
        result = (result * PRIME) + this.getAge();
        result = (result * PRIME) + (int) (temp1 ^ (temp1 >>> 32));
        result = (result * PRIME) + Arrays.deepHashCode(this.getTags());
        return result;
    }

    public static class Exercise<T> {
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

        @Override
        public String toString() {
            return "Exercise(name=" + this.getName() + ", value=" + this.getValue() + ")";
        }

        protected boolean canEqual(Object other) {
            return other instanceof Exercise;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Exercise)) return false;
            Exercise<?> other = (Exercise<?>) o;
            if (!other.canEqual((Object) this)) return false;
            if (this.getName() == null ? other.getValue() != null : !this.getName().equals(other.getName()))
                return false;
            if (this.getValue() == null ? other.getValue() != null : !this.getValue().equals(other.getValue()))
                return false;
            return true;
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
            result = (result * PRIME) + (this.getValue() == null ? 43 : this.getValue().hashCode());
            return result;
        }
    }
}
