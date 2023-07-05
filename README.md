# first spring-boot-starter
## check & test
#### 1、clone and install
```shell
git clone -b main https://github.com/itschenxiang/first-spring-boot-starter.git
cd first-spring-boot-starter
mvn clean install
```
#### 2、add dependence in your any springboot app
```xml
<dependency>
    <groupId>com.itschenxiang</groupId>
    <artifactId>first-spring-boot-starter</artifactId>
    <version>1.0</version>
</dependency>
```
#### 3、config the spring-boot-starter bean and usage
```java
@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Autowired
    private TempAccessAccount tempAccessAccount;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println(tempAccessAccount);
            }
        };
    }
}
```
## reference link
* https://juejin.cn/post/7127468724046528525