/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 15:06
 * @Since:
 */
package com.zja.java;

/**
 *
 */
public class ConstructorExample<T> {
    private int x, y;
    private T description;

    private ConstructorExample(T description) {
        if (description == null) throw new NullPointerException("description");
        this.description = description;
    }

    public static <T> ConstructorExample<T> of(T description) {
        return new ConstructorExample<T>(description);
    }

    @java.beans.ConstructorProperties({"x", "y", "description"})
    protected ConstructorExample(int x, int y, T description) {
        if (description == null) throw new NullPointerException("description");
        this.x = x;
        this.y = y;
        this.description = description;
    }

    public static class NoArgsExample {
        private String field;

        public NoArgsExample() {
        }
    }
}
