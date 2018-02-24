package com.programcreek.helloworld.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.programcreek.helloworld.beans.User;

@Controller
@RequestMapping("/user")
public class ShowUserInfoController {

	@RequestMapping("/showinfo")
	public ModelAndView showMessage(
			@RequestParam(value="name",required = false,defaultValue="Root") String name){
		
		//打印日志信息
		System.out.println("进入ShowUserInfoController控制器");
		//创建showinfo.jsp的视图
		ModelAndView mv = new ModelAndView("showusers");
		
		//创建一个集合数据，用于到前台显示
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Mike","南京大学"));
		users.add(new User("Lily","南京工业大学"));
		users.add(new User("XiaoMing","东南大学"));
		
		//向视图中添加该对象
		mv.addObject("users",users);
		//接受超链接传递的变量，并添加
   	    mv.addObject("name",name);
		return mv;
	}

}




	

