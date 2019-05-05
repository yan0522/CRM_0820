package com.atguigu.crm.handler;

import com.atguigu.crm.entity.User;
import com.atguigu.crm.orm.Navigation;
import com.atguigu.crm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public static Logger logger = Logger.getLogger(UserHandler.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public String login (@RequestParam(value = "name") String name,
                         @RequestParam(value = "password") String password,
                         HttpSession session){
        User user = userService.login(name ,password);
        if (user != null){
            session.setAttribute("user",user);
            return "/home/success";
        }
        return "redirect:/index";
    }

    @ResponseBody
    @RequestMapping("/navigate")
    public List<Navigation> navigate(){
        List<Navigation> navigations = new ArrayList<Navigation>();
        Navigation top = new Navigation(Long.MAX_VALUE,"客户关系管理系统");
        navigations.add(top);
        return navigations;
    }
}
