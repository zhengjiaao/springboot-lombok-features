/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2021-11-16 14:15
 * @Since:
 */
package com.zja;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * 注解 @Data
 *
 * 现在一起：@ToString、@EqualsAndHashCode、@Getter 在所有字段上、@Setter 在所有final非最终字段上的快捷方式，以及@RequiredArgsConstructor！
 *
 * 对比java示例 {@link com.zja.java.DataExample}
 */
@Data
public class DataExample {
    private final String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;

    @ToString(includeFieldNames = true)
    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }
}
