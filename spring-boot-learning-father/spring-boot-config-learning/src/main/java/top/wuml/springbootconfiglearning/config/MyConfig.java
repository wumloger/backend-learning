package top.wuml.springbootconfiglearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.wuml.springbootconfiglearning.service.MyService;

@Configuration
public class MyConfig {
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
