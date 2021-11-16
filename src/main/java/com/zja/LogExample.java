/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:56
 * @Since:
 */
package com.zja;

import lombok.extern.java.Log;

/**
 * 注解 @Log
 *
 * 具体参考：https://projectlombok.org/features/log
 */
@Log
public class LogExample {

    public static void main(String... args) {
        log.severe("Something's wrong here");
    }
}

