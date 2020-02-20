package com.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.movie.domain.Criteria;
import com.movie.domain.ReplyVO;

public interface ReplyMapper {
	
	public int insert(ReplyVO vo);

	public ReplyVO read(Long bno);

	public int delete(Long bno);

	public int update(ReplyVO reply);

	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno);

}


