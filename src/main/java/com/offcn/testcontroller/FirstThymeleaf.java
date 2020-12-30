package com.offcn.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstThymeleaf {
    @GetMapping("/first")
    public String firstThymeleaf(Model model){
        String msg = "hello ，java";

        Map<String,Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("bbb", "2.jpg");
        model.addAttribute("map",map);
        model.addAttribute("msg",msg);
        return "index";
    }
}
