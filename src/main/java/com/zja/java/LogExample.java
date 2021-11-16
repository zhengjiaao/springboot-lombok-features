/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:58
 * @Since:
 */
package com.zja.java;

/**
 *
 */

public class LogExample {
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());

    public static void main(String... args) {
        log.severe("Something's wrong here");
    }
}
