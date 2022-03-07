package edu.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.test.dao.MyBatisBoardDAO;
import edu.test.vo.BoardVO;

@Service
public class MyBatisBoardServiceImpl implements MyBatisBoardService {

	@Autowired
	private MyBatisBoardDAO mybatisBoardDao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return mybatisBoardDao.list();
	}

	@Override
	public BoardVO detail(int bno) throws Exception {
		// TODO Auto-generated method stub
		return mybatisBoardDao.detail(bno);
	}

	@Override
	public int save(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mybatisBoardDao.insert(vo);
	}

}
