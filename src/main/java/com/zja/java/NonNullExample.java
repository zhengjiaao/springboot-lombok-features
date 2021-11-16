/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 15:02
 * @Since:
 */
package com.zja.java;

import com.zja.base.Person;
import com.zja.base.Something;

/**
 *
 */
public class NonNullExample extends Something {
    private String name;

    public NonNullExample(Person person) {
        super("Hello");
        if (person == null) {
            throw new NullPointerException("person is marked @NonNull but is null");
        }
        this.name = person.getName();
    }
}
