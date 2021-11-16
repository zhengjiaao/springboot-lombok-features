/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:10
 * @Since:
 */
package com.zja;

import lombok.*;

/**
 * 注解 @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor
 *
 * 定做构造函数：生成不带参数的构造函数，每个最终/非空字段一个参数，或每个字段一个参数。
 *
 * 对比java示例：{@link com.zja.java.ConstructorExample}
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConstructorExample<T> {
    private int x, y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull
        private String field;
    }

}
