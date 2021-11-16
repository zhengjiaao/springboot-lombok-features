/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 13:54
 * @Since:
 */
package com.zja;

import lombok.Cleanup;

import java.io.*;

/**
 * 注解 @Cleanup
 *
 * 自动资源管理：安全地调用您的 close() 方法，没有麻烦。
 *
 * 对比java示例：{@link com.zja.java.CleanupExample}
 */
public class CleanupExample {
    public static void main(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}
