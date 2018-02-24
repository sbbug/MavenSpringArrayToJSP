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
    	 
    	 //�ڿ���̨��ӡ��Ϣ
    	 System.out.println("in controller");
    	 //����һ����ͼ
    	 ModelAndView mv = new ModelAndView("helloworld");
    	 //����ͼmv����ӱ���
    	 mv.addObject("message",message);
    	 //���ܳ����Ӵ��ݵı����������
    	 mv.addObject("name",name);
    	 
    	 return mv;
    	 
     }
     
	
}
