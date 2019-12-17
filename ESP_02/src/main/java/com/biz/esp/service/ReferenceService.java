package com.biz.esp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.esp.domain.ReferenceDTO;
import com.biz.esp.persistence.ReferenceDao;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class ReferenceService {

	@Autowired
	SqlSession sqlSession;
	
	ReferenceDao refDao;
	
	@Autowired
	public void getRefDao() {
		this.refDao = sqlSession.getMapper(ReferenceDao.class);
	}
	// DB를 리스트 통째로 가져오기
	public List<ReferenceDTO> selectAll(){
		List<ReferenceDTO> rList = refDao.selectAll();
		
		return rList;
	}
	// PK로 가져오기
	public ReferenceDTO getSeq(long d_seq) {

		ReferenceDTO rDTO = refDao.findById(d_seq);
		return rDTO;
	}
	public int insert(ReferenceDTO referenceDTO) {

		
		
		return refDao.insert(referenceDTO);
	}
	public int update(ReferenceDTO referenceDTO) {
		// TODO Auto-generated method stub
		return refDao.update(referenceDTO);
	}
	
	public int delete(long d_seq) {
		// TODO Auto-generated method stub
		return refDao.delete(d_seq);
	}
	public List<ReferenceDTO> selectContentSearch(String strText) {

		ReferenceDTO referenceDTO = ReferenceDTO.builder()
								.d_content(strText)
								.build();
		log.debug("으아아아:"+referenceDTO.getD_content());
		return refDao.findByContent(referenceDTO);
	}
}
