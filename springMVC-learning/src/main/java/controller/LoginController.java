package controller;

import entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpRequest;

@Controller
@ResponseBody
public class LoginController {

    @RequestMapping(value = "/login" ,produces = "text/html;charset=utf-8")
    public String Login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);

        if (username != null && password != null){
            return "<fieldset><legend>登陆成功</legend>用户名：" +user.getUserName()+ "<br>密码："+user.getPassword()+"</fieldset>";
        }
        return "";
    }
}
