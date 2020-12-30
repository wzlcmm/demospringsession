package com.offcn.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test4 {

    @RequestMapping("four")
    public String testTe(Model model){
        model.addAttribute("userName", "mmwoaini");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }
}
