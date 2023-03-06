package top.wuml.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.wuml.spring.ioc.constructor.Bean1;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("scope"));
        System.out.println(ctx.getBean("scope"));
    }
}
