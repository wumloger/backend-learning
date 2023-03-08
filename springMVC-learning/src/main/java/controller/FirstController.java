package controller;

import entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","我的第一个Spring MVC 程序");
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        mav.addObject("user",new User("wuml","21"));
        return mav;
    }
}
