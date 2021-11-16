/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:07
 * @Since:
 */
package com.zja;

import com.zja.base.Shape;
import lombok.EqualsAndHashCode;

/**
 * 注解@EqualsAndHashCode
 *
 * 平等变得容易：从对象的字段生成 hashCode 和 equals 实现。
 *
 * 对比java示例：{@link com.zja.java.EqualsAndHashCodeExample}
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample {
    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode(callSuper = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
