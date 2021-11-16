/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:27
 * @Since:
 */
package com.zja.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * java 示例
 */
public class BuilderExample {
    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    BuilderExample(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    public BuilderExample(long l, String name, int age, Set<String> occupations) {

    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static BuilderExampleBuilder builder() {
        return new BuilderExampleBuilder();
    }

    public static class BuilderExampleBuilder {
        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        BuilderExampleBuilder() {
        }

        public BuilderExampleBuilder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public BuilderExampleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExampleBuilder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExampleBuilder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExampleBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExampleBuilder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        public BuilderExample build() {
            // complicated switch statement to produce a compact properly sized immutable set omitted.
//            Set<String> occupations = ...;
//            Set<String> occupations = new HashSet<>();
//            return new BuilderExample(created$set ? created : BuilderExample.$default$created(), name, age, occupations);

            Set<String> occupations = new HashSet<>();
            return new BuilderExample(name, age, occupations);
        }

        @java.lang.Override
        public String toString() {
            return "BuilderExample.BuilderExampleBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
        }
    }
}
