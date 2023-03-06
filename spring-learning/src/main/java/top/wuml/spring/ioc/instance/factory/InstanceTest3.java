package top.wuml.spring.ioc.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.wuml.spring.ioc.constructor.Bean1;

public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = ctx.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }
}
