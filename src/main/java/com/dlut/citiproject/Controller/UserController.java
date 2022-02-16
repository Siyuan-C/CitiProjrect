package com.dlut.citiproject.Controller;

import com.dlut.citiproject.Bean.*;

import com.dlut.citiproject.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class UserController {
    //注入用户jpa操作接口
    @Autowired
    UserRepository userRepository;
    @Autowired
    Storage_corporationRepository storage_corporationRepository;



    //接受 提交注册数据
    @RequestMapping("/register_data")
    public String register_data( @RequestParam String username, String email, String password, Model model){
        System.out.println("收到请求");
        String message1 = null;
        if(userRepository.existsByName(username)){    //若存在此用户名  不允许重复注册
            message1 = "用户已存在，请重新输入！";
            model.addAttribute("message1", message1);
            return "注册";
        }else{          //不存在此用户名，允许注册
            UserBean userBean=new UserBean(username,password,email);
            userRepository.save(userBean);
            return "注册成功";
        }
    }

    @RequestMapping("/login_data")
    public String login_data(@RequestParam String username, String password, Model model, HttpSession session){
        String message2 = null;
        String message3 = null;
        if(username.equals("")){
            message2 = "请输入用户名！";
            model.addAttribute("message2", message2);
            return "登录";
        }
        if(storage_corporationRepository.existsByName(username)){
            Storage_corporation s = storage_corporationRepository.getStorage_corporationByName(username);
            if(password.equals(s.getPassword())){
                session.setAttribute("loginUser",username);


                return "redirect:/WH_business";
            }else{
                message3 = "密码有误！";
                model.addAttribute("message3", message3);
                return "登录";
            }
        }
        if(!userRepository.existsByName(username)){     //不存在此用户
            //提示前端不存在
            message2 = "该用户不存在！";
            model.addAttribute("message2", message2);
            return "登录";
        }else{
            UserBean userBean=userRepository.findUserBeanByName(username);
            //用户存在且密码相同
            if(userBean.getPassword().equals(password)){
                //提示
                System.out.println("密码相同");
                model.addAttribute("name",username);
                session.setAttribute("loginUser",username);
                System.out.println(session);
                return "首页-登录后";
            }else{   //如果密码与数据库相同   则提示前端用户名/密码错误
                System.out.println(userBean.getPassword()+"\n"+password);
                message3 = "密码有误！";
                model.addAttribute("message3", message3);
                return "登录";
            }
        }
    }
}
