package com.movie.service;

import java.util.List;

import com.movie.domain.Criteria;
import com.movie.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO vo);
	
	public ReplyVO get(Long rno);
		
	public int modify(ReplyVO vo);
	
	public int remove(Long rno);
	
	public List<ReplyVO> getList(Criteria cti, Long bno);
}
