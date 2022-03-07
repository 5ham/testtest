package edu.test.service;

import java.util.List;

import edu.test.vo.BoardVO;

public interface MyBatisBoardService {
	
	List<BoardVO> list() throws Exception;
	BoardVO detail(int bno) throws Exception;
	int save(BoardVO vo) throws Exception;
}
