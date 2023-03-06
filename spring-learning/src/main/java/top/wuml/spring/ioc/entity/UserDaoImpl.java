package top.wuml.spring.ioc.entity;

public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("UserDao say hi");
    }
}
