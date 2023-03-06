package top.wuml.spring.ioc.instance.factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("bean3工厂实例化");
    }

    public Bean3 createBean(){
        return new Bean3();
    }
}
