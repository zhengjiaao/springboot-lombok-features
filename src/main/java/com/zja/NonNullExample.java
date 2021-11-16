/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 13:47
 * @Since:
 */
package com.zja;

import com.zja.base.Person;
import com.zja.base.Something;
import lombok.NonNull;

/**
 * 注解 @NonNull
 *
 * 学会停止担心并喜欢 NullPointerException。
 */
public class NonNullExample extends Something {
    private String name;

    public NonNullExample(@NonNull Person person) {
        super("Hello");
        this.name = person.getName();
    }

    public static void main(String[] args) {
        Person person = null;
//        Person person = new Person();
        new NonNullExample(person);
    }
}
