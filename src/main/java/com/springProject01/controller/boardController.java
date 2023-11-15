package com.springProject01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springProject01.Service.BoardService;
import com.springProject01.dto.Board;

@Controller
public class boardController {
	@Autowired
	private BoardService bsvc;
	
	@RequestMapping(value="/boardWriteForm")
	public ModelAndView boardWriteForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardWriteForm");
		
		return mav;
	}
	
	@RequestMapping(value="/boardWrite")
	public ModelAndView boardWrite(Board board) {
		System.out.println("boardContorller 호출");
		
		int writeResult = bsvc.board_svc(board);
		if (writeResult>0) {
			System.out.println("글 등록 성공");	
		}else {
			System.out.println("글 등록 실패");
		}
		System.out.println("boardUp");
		System.out.println(board);
		
		return null;
	}
	
	
 
}
