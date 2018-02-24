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
		
		//��ӡ��־��Ϣ
		System.out.println("����ShowUserInfoController������");
		//����showinfo.jsp����ͼ
		ModelAndView mv = new ModelAndView("showusers");
		
		//����һ���������ݣ����ڵ�ǰ̨��ʾ
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Mike","�Ͼ���ѧ"));
		users.add(new User("Lily","�Ͼ���ҵ��ѧ"));
		users.add(new User("XiaoMing","���ϴ�ѧ"));
		
		//����ͼ����Ӹö���
		mv.addObject("users",users);
		//���ܳ����Ӵ��ݵı����������
   	    mv.addObject("name",name);
		return mv;
	}

}




	

