package top.wuml.spring.ioc.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.wuml.spring.ioc.constructor.Bean1;

public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = ctx.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }
}
