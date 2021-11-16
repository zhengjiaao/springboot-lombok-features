/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 15:02
 * @Since:
 */
package com.zja.java;

/**
 *
 */
public class GetterSetterExample {
    private int age = 10;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }

}
