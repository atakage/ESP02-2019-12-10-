package com.biz.esp.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.biz.esp.domain.ReferenceDTO;

public interface ReferenceDao {

	public List<ReferenceDTO> selectAll();
	public ReferenceDTO findById(long d_seq);
	public List<ReferenceDTO> findByCategory(String m_cat);
	public List<ReferenceDTO> findByTitle(ReferenceDTO referenceDTO);
	public List<ReferenceDTO> findByContent(ReferenceDTO referenceDTO);
	
	public int update(ReferenceDTO referenceDTO);
	public int insert(ReferenceDTO referenceDTO);
	public int delete(long d_seq);
}
