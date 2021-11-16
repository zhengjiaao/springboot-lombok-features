/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:02
 * @Since:
 */
package com.zja;

import com.zja.base.Shape;
import lombok.ToString;

/**
 * 注解 @ToString
 *
 * 无需启动调试器即可查看您的字段：只需让 lombok 为您生成一个 toString 即可！
 */
@ToString
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }


    public static void main(String[] args) {
        ToStringExample toStringExample = new ToStringExample();
        System.out.println(toStringExample.toString());
    }
}
