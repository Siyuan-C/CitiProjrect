package com.dlut.citiproject.Controller;

import com.dlut.citiproject.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/after_login")
    public String after_login(HttpSession session,Model model){
        String name = (String) session.getAttribute("loginUser");
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/enterprise")
    public String enterprise(){return "enterprise";}
    @RequestMapping("/search")
    public String search(){return "search";}
//    @RequestMapping("/business")
//    public String businessHall(){
//        return "业务大厅";
//    }
    //显示个人信息，repository未设置 李季桥
//    @RequestMapping("/my_account")
//    public String my_account(HttpSession session,Model model){
//        String name = (String) session.getAttribute("loginUser");
//        ArrayList<WH_application> wh_saleArrayList = wh_applicationRepository.findWH_applicationsByName4(name);
//        model.addAttribute("saleList",wh_saleArrayList);
//        return "my_account";
//    }


}
