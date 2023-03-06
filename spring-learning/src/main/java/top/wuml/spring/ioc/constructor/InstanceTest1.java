package top.wuml.spring.ioc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = ctx.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }
}
