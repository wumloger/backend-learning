package controller;

import entity.Orders;
import entity.User;
import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
    public String toFindOrdersWithUser(){
        return "orders";
    }

    public String findOrdersWithUser(Orders orders){
        Integer orderId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUserName();
        System.out.println("orderId=" + orderId);
        System.out.println("username=" + username);
        return "success";
    }
}
