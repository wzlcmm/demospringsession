package com.offcn.testcontroller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Third {
   @RequestMapping("/third")
    public String test3(Model model){
        User u1 = new User(1,"mm",18);
        User u2 = new User(2,"ll",19);
        User u3 = new User(3,"lm",21);
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("user",list);
        return "index3";

    }
}
