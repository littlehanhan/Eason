package com.eason.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author eason
 * @create 2017-02-23-20:20
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }

    @RequestMapping(value = "/frist",method = RequestMethod.GET)
    public String getFristPage(ModelMap modelMap, HttpServletRequest httpServletRequest){
        Object object = httpServletRequest.getAttribute("name");
        modelMap.put("name1",object);
        modelMap.put("name","littlehanhan");
        modelMap.put("text","hello");
        return "frist";
    }
}