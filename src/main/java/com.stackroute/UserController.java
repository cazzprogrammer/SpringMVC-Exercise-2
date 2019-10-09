package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping(value = "/")
    public String method()
    {
        return "index";
    }

    @RequestMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        System.out.println("Inside");
        String str=req.getParameter("name");
        String str1=req.getParameter("password");
        User user = new User(str,str1);
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("user",user);
        return  modelAndView;
    }
}
