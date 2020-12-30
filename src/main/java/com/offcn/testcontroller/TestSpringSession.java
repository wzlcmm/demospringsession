package com.offcn.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestSpringSession {
    @RequestMapping("set")
    public String setSession(HttpSession session){
        session.setAttribute("smg","hello");
        return "ok";
    }
    @RequestMapping("get")
    public String  getSession(HttpSession session){
        String msg = (String) session.getAttribute("smg");
        return msg;
    }
}
