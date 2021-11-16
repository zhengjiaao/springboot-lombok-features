# Lombok

- 官网：https://projectlombok.org/features/all
- 示例代码仓库 gitte [springboot-lombok-features]()


## lombok install

### maven install

```xml
<dependencies>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.22</version>
		<scope>provided</scope>
	</dependency>
</dependencies>
```

jdk9

```xml
<annotationProcessorPaths>
	<path>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.22</version>
	</path>
</annotationProcessorPaths>
```

### IntelliJ IDEA install

从 2020.3 版本开始，Jetbrains IntelliJ IDEA 编辑器与 lombok 兼容，无需插件。 对于 2020.3 之前的版本，可以添加 Lombok IntelliJ 插件，为 [IntelliJ 添加 lombok](https://plugins.jetbrains.com/plugin/6317) 支持：

- Go to `File > Settings > Plugins`
- Click on `Browse repositories...`
- Search for `Lombok Plugin`
- Click on `Install plugin`
- Restart IntelliJ IDEA

您还可以查看使用 [Eclipse 和 IntelliJ 设置 Lombok](https://www.baeldung.com/lombok-ide)，这是一篇关于 baeldung 的博客文章。



### other install

更多参考：[lombok other install](https://projectlombok.org/setup/overview) 



## lombok features

> lombok 功能示例来源[lombok官方文档中的示例](https://projectlombok.org/features/all)，具体使用的细节请查看官方使用说明，此仓库示例仅个人预研使用。
> 代码仓库地址 [springboot-lombok-features]() 



### @Data

> 现在一起：@ToString、@EqualsAndHashCode、@Getter 在所有字段上、@Setter 在所有非final最终字段上的快捷方式，以及@RequiredArgsConstructor！

##### Lombok

```java
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
```

##### java

```java
public class DataExample {
    private final String name;
    private int age;
    private double score;
    private String[] tags;

    public DataExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public String[] getTags() {
        return this.tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "DataExampleJava(" + this.getName() + ", " + this.getAge() + ", " + this.getScore() + ", " + Arrays.deepToString(this.getTags()) + ")";
    }

    protected boolean canEqual(Object other) {
        return other instanceof DataExample;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DataExample)) return false;
        DataExample other = (DataExample) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
        if (!Arrays.deepEquals(this.getTags(), other.getTags())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long temp1 = Double.doubleToLongBits(this.getScore());
        result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
        result = (result * PRIME) + this.getAge();
        result = (result * PRIME) + (int) (temp1 ^ (temp1 >>> 32));
        result = (result * PRIME) + Arrays.deepHashCode(this.getTags());
        return result;
    }

    public static class Exercise<T> {
        private final String name;
        private final T value;

        private Exercise(String name, T value) {
            this.name = name;
            this.value = value;
        }

        public static <T> Exercise<T> of(String name, T value) {
            return new Exercise<T>(name, value);
        }

        public String getName() {
            return this.name;
        }

        public T getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return "Exercise(name=" + this.getName() + ", value=" + this.getValue() + ")";
        }

        protected boolean canEqual(Object other) {
            return other instanceof Exercise;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Exercise)) return false;
            Exercise<?> other = (Exercise<?>) o;
            if (!other.canEqual((Object) this)) return false;
            if (this.getName() == null ? other.getValue() != null : !this.getName().equals(other.getName()))
                return false;
            if (this.getValue() == null ? other.getValue() != null : !this.getValue().equals(other.getValue()))
                return false;
            return true;
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
            result = (result * PRIME) + (this.getValue() == null ? 43 : this.getValue().hashCode());
            return result;
        }
    }
}
```

### @Getter/@Setter

> 永远不要再写 public String getName() {return name;}

##### Lombok

```java
public class GetterSetterExample {
    @Getter
    @Setter
    private int age = 10;
    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
```

##### java

```java
public class GetterSetterExample {
    private int age = 10;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
```

### @Builder

>用于创建对象的无障碍花哨 API

##### Lombok

```java
@Builder
public class BuilderExample {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
```

##### java

```java
public class BuilderExample {
    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    BuilderExample(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static BuilderExampleBuilder builder() {
        return new BuilderExampleBuilder();
    }

    public static class BuilderExampleBuilder {
        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        BuilderExampleBuilder() {
        }

        public BuilderExampleBuilder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public BuilderExampleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExampleBuilder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExampleBuilder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExampleBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExampleBuilder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        public BuilderExample build() {
            Set<String> occupations = new HashSet<>();
            return new BuilderExample(name, age, occupations);
        }

        @java.lang.Override
        public String toString() {
            return "BuilderExample.BuilderExampleBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age + ", occupations = " + this.occupations + ")";
        }
    }
```



### @NonNull

>学会停止担心并喜欢 NullPointerException 

##### Lombok

```java
public class NonNullExample extends Something {
    private String name;

    public NonNullExample(@NonNull Person person) {
        super("Hello");
        this.name = person.getName();
    }
}
```

##### java

```java
public class NonNullExample extends Something {
    private String name;

    public NonNullExample(Person person) {
        super("Hello");
        if (person == null) {
            throw new NullPointerException("person is marked @NonNull but is null");
        }
        this.name = person.getName();
    }
}
```

由于字数限制，更多用法，参考代码仓库示例。

完整示例：

```java
.
|-- BuilderExample.java
|-- CleanupExample.java
|-- ConstructorExample.java
|-- DataExample.java
|-- EqualsAndHashCodeExample.java
|-- GetterLazyExample.java
|-- GetterSetterExample.java
|-- LogExample.java
|-- LogExampleCategory.java
|-- LogExampleOther.java
|-- LombokFeaturesApplication.java
|-- NonNullExample.java
|-- SneakyThrowsExample.java
|-- SynchronizedExample.java
|-- ToStringExample.java
|-- ValExample.java
|-- ValueExample.java
|-- WithExample.java
|-- base
|   |-- Person.java
|   |-- Shape.java
|   `-- Something.java
`-- java
    |-- BuilderExample.java
    |-- CleanupExample.java
    |-- ConstructorExample.java
    |-- DataExample.java
    |-- EqualsAndHashCodeExample.java
    |-- GetterLazyExample.java
    |-- GetterSetterExample.java
    |-- LogExample.java
    |-- LogExampleCategory.java
    |-- LogExampleOther.java
    |-- NonNullExample.java
    |-- SneakyThrowsExample.java
    |-- SynchronizedExample.java
    |-- ToStringExample.java
    |-- ValExample.java
    |-- ValueExample.java
    `-- WithExample.java
```

