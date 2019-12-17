package com.biz.esp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.biz.esp.domain.ReferenceDTO;
import com.biz.esp.service.ReferenceService;

import lombok.extern.slf4j.Slf4j;

@SessionAttributes("referenceDTO")
@Slf4j
@RequestMapping(value="/reference")
@Controller
public class ReferenceController {

	@ModelAttribute("referenceDTO")
	public ReferenceDTO makeRefDTO() {
		ReferenceDTO referenceDTO = new ReferenceDTO();
		return referenceDTO;
	}
	@Autowired
	ReferenceService rService;
	
	//	정책 자료실 페이지
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String reference(String search, Model model) {
		
		return "/reference/reference";
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String referenceDetail(Model model) {
		
		return "/reference/reference_detail";
	}
	@RequestMapping(value="/rlist",method=RequestMethod.GET)
	public String getRList(String search, Model model) {
		List<ReferenceDTO> refList ;
		if(search.trim() == null || search.isEmpty()) {
			refList = rService.selectAll();
		} else {
			refList = rService.selectContentSearch(search);
		}
		model.addAttribute("RLIST",refList);
		return "/reference/r-list";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String rview(@RequestParam("id") String d_seq, @ModelAttribute("referenceDTO") ReferenceDTO referenceDTO, Model model, SessionStatus sStatus) {

		long r_seq = 0;
		try {
			r_seq = Long.valueOf(d_seq);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// memoDTO를 try 밖으로 보낸 이유는 저 안에서 오류나면 서비스에서 오류난걸 알 수 없음
		referenceDTO = rService.getSeq(r_seq);
		model.addAttribute("rDTO",referenceDTO);

		sStatus.setComplete();
		return "/reference/r-view";

	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert(@ModelAttribute("referenceDTO") ReferenceDTO referenceDTO, Model model) {


		model.addAttribute("rDTO",referenceDTO);
		return "/reference/r-input";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("referenceDTO") ReferenceDTO referenceDTO, String search, Model model) {
		ReferenceDTO rDTO = referenceDTO;
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
		
		String dateD = sd.format(date);
		st.format(date);

		rDTO.setD_date(dateD);
		rDTO.setD_writer("관리자");
		int ret = rService.insert(referenceDTO);

		return "redirect:/reference/rlist";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(String id,  @ModelAttribute("referenceDTO") ReferenceDTO referenceDTO,Model model) {
		
		long m_seq = 0;

		try {
			m_seq = Long.valueOf(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		referenceDTO = rService.getSeq(m_seq);
		model.addAttribute("referenceDTO",referenceDTO);
		
		return "/reference/r-input";
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@ModelAttribute("referenceDTO") ReferenceDTO referenceDTO, Model model) {
		
		// Service의 update 메서드를 이용해서 memoDTO를 전달
//		ReferenceDTO rDTO = referenceDTO;	
//		Date date = new Date();
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");
//		SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
//		
//		String dateD = sd.format(date);
//		st.format(date);
//		long lSeq = rDTO.getD_seq();
//		log.debug("시퀀스 번호 : " + lSeq);
//		rDTO.setD_date(dateD);
//		rDTO.setD_writer("관리자");
		int ret = rService.update(referenceDTO);
		return "redirect:/reference/rlist";
	}

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	// public String delete(long m_seq) {	
	public String delete(@ModelAttribute ReferenceDTO referenceDTO) {
		int ret = rService.delete(referenceDTO.getD_seq());
		return "redirect:/reference/rlist";
	}
}
