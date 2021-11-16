/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 13:41
 * @Since:
 */
package com.zja;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *  var：Finally! Hassle-free final local variables.
 */
public class ValExample {

    //Lombok var 示例

    public static String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public static void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println(example());
        example2();
    }
}
