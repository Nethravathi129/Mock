package com.jsp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.EmpDao;
import com.jsp.dto.EmpDto;
@Controller
public class EmpController {
	@RequestMapping("/signup")
	public ModelAndView singup(){
		ModelAndView modelandView=new ModelAndView("signup.jsp");
		EmpDto empdto=new EmpDto();
		modelandView.addObject("empobject", empdto);
		return modelandView;
		}
	@ResponseBody
	@RequestMapping("/insert")
	public String saveData(EmpDto receiveObject){
		EmpDao empdao=new EmpDao();
		empdao.insert(receiveObject);
		return "inserted successfully" ;
		}
	@RequestMapping("/fetch")
	public ModelAndView fetch(){
		ModelAndView modelandView=new ModelAndView("fetch.jsp");
		EmpDto empdto=new EmpDto();
		modelandView.addObject("fetchfromDB", empdto);
		return modelandView;
		}
	@RequestMapping("/fetchfromFrentend")
	public ModelAndView fetchdata(String email){
		EmpDao empdao=new EmpDao();
		EmpDto dto=empdao.fetch(email);
		ModelAndView modelandView=new ModelAndView("display.jsp");
		modelandView.addObject("requestKey",dto);
		return modelandView;
		}
	
}
