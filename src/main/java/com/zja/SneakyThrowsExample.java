/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:35
 * @Since:
 */
package com.zja;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * 注解 @SneakyThrows
 *
 * 大胆地抛出之前没有人抛出过的已检查异常！
 */
public class SneakyThrowsExample implements Runnable {
    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @Override
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
