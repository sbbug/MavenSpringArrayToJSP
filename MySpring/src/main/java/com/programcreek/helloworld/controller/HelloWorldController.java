package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {
     String message = "Welcome to Spring MVC!";
     
     @RequestMapping("/show")
     public ModelAndView Show(
    		 @RequestParam(value="name",required = false,defaultValue = "World")String name){
    	 
    	 //在控制台打印信息
    	 System.out.println("in controller");
    	 //创建一个视图
    	 ModelAndView mv = new ModelAndView("helloworld");
    	 //在视图mv里添加变量
    	 mv.addObject("message",message);
    	 //接受超链接传递的变量，并添加
    	 mv.addObject("name",name);
    	 
    	 return mv;
    	 
     }
     
	
}
