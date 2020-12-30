package com.offcn.testcontroller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondThymeleafController {
    @RequestMapping("second")
    public String secondTest(Model model){
        String msg = "hello, thymeleaf";
        User u = new User();
        u.setId(1);
        u.setName("苗苗");
        u.setAge(18);
        model.addAttribute("msg",msg);
        model.addAttribute("u",u);
        return "index2";
    }



}
