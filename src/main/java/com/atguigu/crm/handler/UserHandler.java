package com.atguigu.crm.handler;

import com.atguigu.crm.entity.User;
import com.atguigu.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * TODO
 *
 * @ClassName: UserHandler
 * @author: yan
 * @since: 2019/4/10 16:15
 */
@RequestMapping(value = "/user")
@Controller
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public String login (@RequestParam(value = "name") String name,
                         @RequestParam(value = "password") String password,
                         HttpSession session){
        System.out.println("4444444444444444444");
        User user = userService.login(name ,password);
        System.out.println("555555555555555555555");
        if (user != null){
            System.out.println("66666666666666666");
            session.setAttribute("user",user);
            System.out.println("777777777777777777");
            return "success";
        }
        return "redirect:/index.jsp";
    }
}
