package top.wuml.springbootconfiglearning.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;
    @Test
    void testProperties(){
        System.out.println(myProperties);
    }

}