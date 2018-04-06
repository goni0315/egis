package com.egis.test.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.egis.test.dao.BoardDao;
import com.egis.test.entity.Board;



public class BoardDaoMybatis implements BoardDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Board> getList() {
		
		
		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);
		List<Board> list = boardDao.getList();
		
		
		
		
		return list;
	}

	
	
	
}
