/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:57
 * @Since:
 */
package com.zja;

import lombok.extern.apachecommons.CommonsLog;

/**
 * 注解 @CommonsLog
 *
 *
 */
@CommonsLog(topic="CounterLog")
public class LogExampleCategory {

    public static void main(String... args) {
        log.error("Calling the 'CounterLog' with a message");
    }
}
