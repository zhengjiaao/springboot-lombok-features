/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:27
 * @Since:
 */
package com.zja;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * 注解 @Builder
 *
 * 用于创建对象的无障碍花哨 API！
 *
 * 对比java示例：{@link com.zja.java.BuilderExample}
 */
@Builder
public class BuilderExample {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;

    public static void main(String[] args) {
        System.out.println(BuilderExample.$default$created());

        BuilderExample builderExample = BuilderExample.builder().name("lisi").age(22).occupation("666").build();
        System.out.println(builderExample.age);
        System.out.println(builderExample.name);
        System.out.println(builderExample.occupations);
    }
}
