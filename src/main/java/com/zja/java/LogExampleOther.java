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
public class LogExampleOther {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleOther.class);

    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}
