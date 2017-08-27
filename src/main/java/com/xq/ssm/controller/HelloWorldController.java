package com.xq.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.dc.pr.PRError;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by xq on 2017/8/27.
 */
@Controller
public class HelloWorldController {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HelloWorldController.class);

    @RequestMapping("/tst")
    public String helloworld(HttpServletRequest request, HttpServletResponse response, Model model){
        logger.info("HEHEHEE");
        model.addAttribute("user", "xq");
        System.out.println("12312");
        return "hello";
    }
}
