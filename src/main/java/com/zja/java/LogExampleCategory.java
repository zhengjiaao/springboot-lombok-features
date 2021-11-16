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
public class LogExampleCategory {
    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog("CounterLog");

    public static void main(String... args) {
        log.error("Calling the 'CounterLog' with a message");
    }
}
