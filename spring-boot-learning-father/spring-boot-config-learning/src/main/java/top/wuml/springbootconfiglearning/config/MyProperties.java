package top.wuml.springbootconfiglearning.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:my.properties")
@ConfigurationProperties(prefix = "my")
@Data
public class MyProperties {
    private String url;
    private String username;
    private String password;
}
