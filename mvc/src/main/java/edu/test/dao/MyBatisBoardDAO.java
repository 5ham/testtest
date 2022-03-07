package edu.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.test.vo.BoardVO;

@Repository
public class MyBatisBoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String Namespace 
						="edu.test.mapper.boardMapper";
	
	public List<BoardVO> list(){
		return sqlSession.selectList(Namespace+".listBoard");
	}
	
	
	public BoardVO detail(int bno) {
		return sqlSession.selectOne(Namespace+".viewBoard", bno);
	}
	
	public int insert(BoardVO vo) {
		return sqlSession.insert(Namespace+".insertBoard", vo);
	}
	
	
	
	
}
