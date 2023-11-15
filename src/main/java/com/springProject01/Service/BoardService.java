package com.springProject01.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject01.Dao.BoardDao;
import com.springProject01.dto.Board;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao bdao;
	
	public int board_svc(Board board) {
		System.out.println("service - board_svc()호출");
		int boardDao = bdao.boardWriteDao(board);
		
		
		return boardDao;
	}
}
