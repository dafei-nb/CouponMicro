package cn.cdqf.kjxzmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("cn.cdqf.kjxzmanager.dao")
@SpringBootApplication
@ComponentScan({"cn.cdqf.global","cn.cdqf.kjxzmanager"})
@EnableSwagger2
@EnableAsync
@EnableDiscoveryClient
public class KjxzManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KjxzManagerApplication.class, args);
    }

}
