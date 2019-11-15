package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.MyQuery;
import com.model.MyUser;
import com.service.UserService;

@Controller("mycontroller")
public class MyController {
@Autowired
UserService userService;
	@RequestMapping(value="/hello1", method=RequestMethod.GET)
	public void show1(){
		System.out.println("I am fine....");
	}
	
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String show2(){
		System.out.println("I am fine from show2....");
		return "show2";
	}
	
	@RequestMapping(value="/hello3", method=RequestMethod.GET)
	public ModelAndView show3(){
		ModelAndView mav= new ModelAndView();
		mav.setViewName("show3");
		mav.addObject("var1","Ekta");
		mav.addObject("address","sec7");
		return mav;
	}
	
	@RequestMapping(value="/query", method=RequestMethod.GET)
	public String getQueryForm(){
		return "query";
	}
	
	@RequestMapping(value="/query", method=RequestMethod.POST)
	public ModelAndView sendQueryForm(@ModelAttribute MyQuery myQuery){
		System.out.println(myQuery.getName());
		ModelAndView mav= new ModelAndView("query1");
		mav.addObject("obj",myQuery);
		return mav;
	}
	
	@RequestMapping(value="/viewusers", method=RequestMethod.GET)
	public ModelAndView viewUsers(){
		List<MyUser> userlist= userService.getUsers();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("viewusers");
		mav.addObject("userlist",userlist);
		return mav;
	}
}
