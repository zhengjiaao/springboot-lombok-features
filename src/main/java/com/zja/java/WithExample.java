/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:37
 * @Since:
 */
package com.zja.java;

/**
 *
 */
public class WithExample {
    private final String name;
    private final int age;

    public WithExample(String name, int age) {
        if (name == null) throw new NullPointerException();
        this.name = name;
        this.age = age;
    }

    protected WithExample withName(String name) {
        if (name == null) throw new java.lang.NullPointerException("name");
        return this.name == name ? this : new WithExample(name, age);
    }

    public WithExample withAge(int age) {
        return this.age == age ? this : new WithExample(name, age);
    }
}
