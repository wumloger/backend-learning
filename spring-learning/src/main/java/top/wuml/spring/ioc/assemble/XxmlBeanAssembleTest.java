package top.wuml.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XxmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("user1"));
        System.out.println(ctx.getBean("user2"));
    }
}
