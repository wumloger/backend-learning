package top.wuml.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans6.xml");
        UserController userController = ctx.getBean("userController", UserController.class);
        userController.save();
    }
}
