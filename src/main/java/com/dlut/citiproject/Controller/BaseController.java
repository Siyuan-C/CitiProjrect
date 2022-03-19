package com.dlut.citiproject.Controller;

import com.dlut.citiproject.Repository.*;
import com.dlut.citiproject.Repository.LevelRepository;
import com.dlut.citiproject.Bean.*;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {
    //注入用户jpa操作接口
    @Autowired
    LevelRepository levelRepository;
    @Autowired
    EnvironmentAchievement_DetailsRepository EnvAchiRepo;
    @Autowired
    EnvironmentExposure_DebtRepository EnvExpRepo;
    @Autowired
    EnvironmentInvestment_DetailsRepository EnvInvRepo;
    @Autowired
    Financial_IndexRepository FinIndRepo;
    @Autowired
    Govern_CapacityRepository GovCapRepo;
    @Autowired
    Risk_LevelRepository RisLevRepo;
    @Autowired
    SocialResponsibility_IndexRepository SocResRepo;


    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/search")
    public String s(){
        return "search";
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
    @RequestMapping("/overall")
    public String overall(){return "overall";}
    @RequestMapping("/soc_safety")
    public String soc_safety(){return "soc_safety";}
    @RequestMapping("/soc_customer")
    public String soc_customer(){return "soc_customer";}
    @RequestMapping("/soc_public")
    public String soc_public(){return "soc_public";}
    @RequestMapping("/gov_risk")
    public String gov_risk(){return "gov_risk";}
    @RequestMapping("/gov_admin")
    public String gov_admin(){return "gov_admin";}
    @RequestMapping("/gov_manage")
    public String gov_manage(){return "gov_manage";}
    @RequestMapping("/env_performance")
    public String env_performance(){return "env_performance";}
    @RequestMapping("/env_disclosure")
    public String env_disclosure(){return "env_disclosure";}
    @RequestMapping("/env_investment")
    public String env_investment(){return "env_investment";}


    @RequestMapping("/search_data")
    public String search(@RequestParam String enterprise_name, Model model){
        String message = null;
        ArrayList<String> enterPrises = levelRepository.findLevelByName(enterprise_name);
        if(!enterPrises.isEmpty()){
            model.addAttribute("enterPrises",enterPrises);
            return "result";
        }else{
            message = "查询无相关企业！";
            model.addAttribute("message",message);
            return "search";
        }
    }
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

    //企业上传信息
    @RequestMapping("/upload")
    public String upload(@RequestParam String Name, Model model){
        model.addAttribute("name",Name);
        System.out.println(Name);
        return "upload";
    }

    @GetMapping("/enterprise")
    public String display(@RequestParam("enterprise_name") String enterprise_name, Model model,HttpSession session){

        //System.out.println(enterprise_name);
        LevelBean enterPrise = levelRepository.findLevelByName1(enterprise_name);
        //EnvironmentAchievement_Details envAchi = new EnvironmentAchievement_Details();
        ArrayList<EnvironmentAchievement_Details> envAchiDetail = EnvAchiRepo.findEnvironmentAchievement_DetailsByName(enterprise_name);
        ArrayList<EnvironmentExposure_Debt> envExpo = EnvExpRepo.findEnvironmentExposure_DebtByName(enterprise_name);
        ArrayList<EnvironmentInvestment_Details> envInves = EnvInvRepo.findEnvironmentInvestment_DetailsByName(enterprise_name);
        ArrayList<SocialResponsibility_Index> socRes1 = SocResRepo.findSocialResponsibility_IndexByName0(enterprise_name);
        ArrayList<SocialResponsibility_Index> socRes2 = SocResRepo.findSocialResponsibility_IndexByName1(enterprise_name);
        ArrayList<SocialResponsibility_Index> socRes3 = SocResRepo.findSocialResponsibility_IndexByName2(enterprise_name);
        ArrayList<Risk_Level> risLev = RisLevRepo.findRisk_LevelByName(enterprise_name);
        ArrayList<Financial_Index> finIndex = FinIndRepo.findFinancial_IndexByName(enterprise_name);
        ArrayList<Govern_Capacity> govCap = GovCapRepo.findGovern_CapacityByName(enterprise_name);

        for(int i=0;i<govCap.size();i++){

            System.out.println(govCap.get(i).toString()+" "+i);
        }
        //System.out.println(enterPrise.getE_level());
        model.addAttribute("enterprise",enterPrise);
        model.addAttribute("enterprise_name",enterprise_name);
        session.setAttribute("envAchiDetail",envAchiDetail);
        session.setAttribute("envExpo",envExpo);
        session.setAttribute("envInves",envInves);
        session.setAttribute("socRes1",socRes1);
        session.setAttribute("socRes2",socRes2);
        session.setAttribute("socRes3",socRes3);
        session.setAttribute("risLev",risLev);
        session.setAttribute("finIndex",finIndex);
        session.setAttribute("govCap",govCap);
//        model.addAttribute("enterprise",enterPrise);
       session.setAttribute("enterprise",enterPrise);
       // session.setAttribute("enterPrise",envAchi);

        return "enterprise";

    }


}
