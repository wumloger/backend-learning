package top.wuml.springbootconfiglearning.config;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.wuml.springbootconfiglearning.service.MyService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@AllArgsConstructor
class MyConfigTest {
    @Autowired
    private MyService myService;
    @Test
    void testMyConfig(){
        myService.sayHello();

    }

}