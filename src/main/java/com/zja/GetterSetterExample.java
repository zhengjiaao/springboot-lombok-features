/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 13:57
 * @Since:
 */
package com.zja;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
public class GetterSetterExample {
    @Getter
    @Setter
    private int age = 10;
    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }


    public static void main(String[] args) {
        GetterSetterExample getterSetterExample = new GetterSetterExample();
        System.out.println(getterSetterExample.age);
        System.out.println(getterSetterExample.name);
        System.out.println(getterSetterExample.toString());

        getterSetterExample.setAge(2);
        getterSetterExample.setName("lisi");
        System.out.println(getterSetterExample.getAge());
        System.out.println(getterSetterExample.toString());

    }


    //java 示例

 /*   public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    protected void setName(String name) {
        this.name = name;
    }*/
}
