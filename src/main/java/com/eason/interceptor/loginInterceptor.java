package com.eason.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 2017/2/23.
 */
public class loginInterceptor implements HandlerInterceptor {
    //拦截器进入controller之前
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if(!httpServletRequest.getRequestURL().toString().contains("home")){
            System.out.print("拦截器工作");
            return false;
        }
        System.out.print("拦截器工作");
        return true;
    }
    //拦截器刚出controller之后
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.print("拦截器工作");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
       httpServletResponse.sendError(400,"不让你玩");
        System.out.print("拦截器工作");
    }
}
