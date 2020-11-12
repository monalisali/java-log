# 测试 Java 常见Log框架
## 1. tinylog
- 优点：
1. 配置简单，功能基本齐全，可以满足大多数情况下的使用。

- 缺点：
1. infor 和 error 不能完全独立输出到单独的文件。虽然可以配置两个rolling file，一个写infor，一个写error，
但结果是：error文件只包含error信息，但infor文件会包含infor和error信息。

### 1.1 资源
https://github.com/pmwmedia/tinylog
https://tinylog.org/v2/getting-started/

### 1.2 Maven 依赖
```xml
   <dependency>
      <groupId>org.tinylog</groupId>
      <artifactId>tinylog-api</artifactId>
      <version>2.2.0</version>
   </dependency>

   <dependency>
      <groupId>org.tinylog</groupId>
       <artifactId>tinylog-impl</artifactId>
       <version>2.2.0</version>
    </dependency>
```

### 1.3 创建配置文件：tinylog.properties
src\main\resource\tinylog.properties

### 1.4 Severity Level
tinyLog提供5种log级别：trace, debug, info, warn, error, 它们的优先级是:  `trace < debug < info < warn < error`
**只有设置的优先级以及高于它的优先级才会被tinyLog记录**
比如说，现在设置的level为info,那么只有infor,warn,error这3个级别会被记录。即使在代码中写了Logger.debug('XXXXX'), 因为debug的level比infor小，这句代码会被
tinyLog忽略


### 1.5 注意点
1. 不用创建实例，直接使用 Logger 静态变量就可以使用
2. 打印方法infor(), error()等都可以接收 Throwable 类型参数。**如何要打印错误信息的stack，直接传入Throwable参数即可