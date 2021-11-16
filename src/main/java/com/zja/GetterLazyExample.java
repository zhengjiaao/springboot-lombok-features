/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:49
 * @Since:
 */
package com.zja;

import lombok.Getter;

/**
 * 注解 @Getter(lazy = true)
 *
 * 懒惰是一种美德！
 *
 */
public class GetterLazyExample {
    /**
     * lazy = true 初始化的时候expensive()不被执行，调用cached方法是才会执行 expensive()
     */
    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        System.out.println("执行 expensive() 方法");
        return result;
    }

    public static void main(String[] args) {
        GetterLazyExample getterLazyExample = new GetterLazyExample();
        //@Getter(lazy = true) 调用getCached()时才执行expensive()方法
        System.out.println(getterLazyExample.getCached().length);
    }
}
