package com.biz.esp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/esp")
@Controller
public class OBJController {
	
	
	
	
//	청년 정책 메인
	@RequestMapping(value="/object", method=RequestMethod.GET)
	public String object(Model model) {
		
		
		model.addAttribute("sideColorBold", "young");
		
		return "/object/object_main";
	}
	

// 청년 추가고용 장려금 지원사업 페이지
	
	@RequestMapping(value="/object/ym1", method=RequestMethod.GET)
	public String objectToYm1(Model model) {
		
		model.addAttribute("sideColorBold", "young");
		
		return "/object/object_ym1";
	}



	


	//여성 정책 메인
	@RequestMapping(value="/object/fmmain", method=RequestMethod.GET)
	public String objectFMMain(Model model) {
		
		model.addAttribute("sideColorBold", "female");
		
		return "/object/object_fmmain";
	}
	
	
	
	
	//중장년 정책 메인
	@RequestMapping(value="/object/mdmain", method=RequestMethod.GET)
	public String objectMDMain(Model model) {
			
		model.addAttribute("sideColorBold", "middle");
		
		return "/object/object_mdmain";
	}
	
	
	
	
	
	//장애인 정책 메인
	@RequestMapping(value="/object/damain", method=RequestMethod.GET)
	public String objectDAMain(Model model) {
		
		model.addAttribute("sideColorBold", "disable");
		
		return "/object/object_damain";
	}
	
	
	
	
	//외국인 정책 메인
	@RequestMapping(value="/object/frmain", method=RequestMethod.GET)
	public String objectFRMain(Model model) {
		
		model.addAttribute("sideColorBold", "foreign");
		
		return "/object/object_frmain";
	}
	
	
	
	
	
	
	
	
	
	
}
