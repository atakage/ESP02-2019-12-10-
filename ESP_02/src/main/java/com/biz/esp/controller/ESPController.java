package com.biz.esp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ESPController {

//	사이트 소개 페이지
	@RequestMapping(value="/intro", method=RequestMethod.GET)
	public String intro(Model model) {
		
		return "/intro";
	}
//	로그인 페이지
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		
		return "/login/login";
	}
	
//	회원가입 페이지
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join_personal(Model model) {
		
		return "/join/personal_info_agree";
	}
	@RequestMapping(value="/join/agree", method=RequestMethod.GET)
	public String joinAgree(Model model) {
		
		return "/join/personal_info_agree";
	}
	@RequestMapping(value="/join/join", method=RequestMethod.GET)
	public String join(Model model) {
		
		return "/join/join";
	}
	
	
	
	/*															--- 외부 컨트롤러로 뺌
	
	
//	대상별 정책 메인
	@RequestMapping(value="/object", method=RequestMethod.GET)
	public String object(Model model) {
		
		return "/object/object";
	}
	@RequestMapping(value="/object/object-content", method=RequestMethod.GET)
	public String object_content(Model model) {
		
		return "/object/object-content";
	}
	
	
	
	*/
	
	
	/*
	
//	지역별 정책 메인
	@RequestMapping(value="/area", method=RequestMethod.GET)
	public String area(Model model) {
		
		return "/area/area";
	}
	@RequestMapping(value="/area/area-seoul", method=RequestMethod.GET)
	public String area_content(Model model) {
		
		return "/area/area-seoul";
	}
	
	
	*/
	
//	소식 페이지
	@RequestMapping(value="/news", method=RequestMethod.GET)
	public String news(Model model) {
		
		return "/news/news";
	}
	@RequestMapping(value="/news/detail", method=RequestMethod.GET)
	public String newsDetail(Model model) {
		
		return "/news/news_detail";
	}
	

	
//	이용약관 페이지
	@RequestMapping(value="/infouse", method=RequestMethod.GET)
	public String infouse(Model model) {
		
		return "/infouse/infouse";
	}
	
//	개인정보처리방침 페이지
	@RequestMapping(value="/privacy", method=RequestMethod.GET)
	public String privacy(Model model) {
		
		return "/infouse/privacy";
	}
	
//	개선의견 페이지
	@RequestMapping(value="/opinion", method=RequestMethod.GET)
	public String opinion(Model model) {
		
		return "/infouse/opinion";
	}
	
}

