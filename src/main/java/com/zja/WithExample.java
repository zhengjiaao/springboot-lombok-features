/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:37
 * @Since:
 */
package com.zja;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.With;

/**
 * 注解 @With
 *
 * 不可变的“setter” - 创建一个克隆但具有一个更改字段的方法。
 */
public class WithExample {
    @With(AccessLevel.PROTECTED)
    @NonNull
    private final String name;
    @With
    private final int age;

    public WithExample(String name, int age) {
        if (name == null) throw new NullPointerException();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        WithExample lisi = new WithExample("lisi", 22);
        System.out.println(lisi.age);

        //克隆一个对象
        WithExample withExample = lisi.withAge(25);
        System.out.println(withExample.age); //25
        System.out.println(withExample.name); //list

        //22
        System.out.println(lisi.age);
    }
}
