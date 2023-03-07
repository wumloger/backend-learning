package controller;

import entity.LoginUser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vo.UserVo;

import java.util.List;

@Controller

public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value = "user_id") Integer id){
        System.out.println("id=" + id);
        return "success";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    public String registerUser(LoginUser user){
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        return "success";
    }

    @RequestMapping("/toUser")
    public String selectUsers(){
        return "user";
    }

    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if (ids != null){
            for (Integer id:ids){
                System.out.println("删除了id为：" + id + "的用户");
            }
        }else {
            System.out.println("ids=null");
        }
        return "success";
    }

    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    public String editUsers(UserVo userList){
        List<LoginUser> users = userList.getUsers();
        for (LoginUser user:users){
            if (user.getId() != null){
                System.out.println("修改了id为" + user.getId() + "的用户名为" + user.getUsername());
            }
        }
        return "success";
    }
}
