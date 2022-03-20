package com.dlut.citiproject.Config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author:dzc
 * @date2020-10-11 9:55
 */

@WebFilter(filterName = "sessionFilter",urlPatterns = {"/*"})
public class SessionFilter implements Filter {

    //不需要登录就可以访问的路径(比如:注册登录等)
    String[] includeUrls = new String[]{"/login","/","/register","/login_data","/search","/result","/search_data","/enterprise","/env_performance.html","/navbar.html","/footer.html"
            ,"/overall","/env_performance","/env_disclosure","/env_investment","/soc_safety","/soc_customer","/soc_public","/gov_risk","/gov_admin","/gov_manage","/navbar","/footer",
    "/register_data","/my_account","/ent_upload","/ent_upload_test","/input_success"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession(false);
        String url = request.getRequestURI();
        //System.out.println("filter-url:"+url);
        boolean needFilter = isNeedFilter(url);
        if(!needFilter){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
//            // 验证登录状态
//            if(session != null){
//                filterChain.doFilter(servletRequest, servletResponse);
//            }else{
//                response.sendRedirect("/login");
//            }
        }

    }

    public boolean isNeedFilter(String uri) {
        for (String includeUrl : includeUrls) {
            if(includeUrl.equals(uri)) {
                return false;
            }
            if(uri.contains(".css")||uri.contains(".js")||uri.contains(".jpg")||uri.contains(".png")){
                return false;
            }
        }

        return true;
    }


    @Override
    public void destroy() {

    }
}
