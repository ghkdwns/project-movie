package com.movie.mapper;

import java.util.List;

import com.movie.domain.BoardVO;
import com.movie.domain.Criteria;


public interface BoardMapper {

	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board); //기본키를 알때 사용한다.
	
	public BoardVO read(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO board);
	
}
