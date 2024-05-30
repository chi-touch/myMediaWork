package application.config;


import application.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "application.services")
public class ProjectConfig {

    @Bean
    @Primary
    public HelloService helloService(){
        HelloService helloService = new HelloService();
//        System.out.println("HelloService bean in context => " + helloService);
        return helloService;
    }

    @Bean
    public HelloService helloService2(){
        HelloService helloService = new HelloService();
//        System.out.println("HelloService bean in context => " + helloService);
        return helloService;
    }

//    @Bean
//    public BigDecimal bigDecimal(){
//        return new BigDecimal(200);
//    }





}
