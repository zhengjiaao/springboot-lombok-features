/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:42
 * @Since:
 */
package com.zja;

import lombok.Synchronized;

/**
 * 注解 @Synchronized
 * 同步完成正确：不要暴露你的锁
 */
public class SynchronizedExample {
    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }

    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        synchronizedExample.foo();

        System.out.println(synchronizedExample.answerToLife());
//        System.out.println(synchronizedExample.readLock);

    }
}

