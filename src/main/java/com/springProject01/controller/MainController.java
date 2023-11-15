package com.springProject01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springProject01.dto.Member;

@Controller
public class MainController {
	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		System.out.println("controller - / 요청");
		ModelAndView mav = new ModelAndView();
		//1.데이터 - SERVICE
//		ArrayList<Board> bList = svc.getBoardList();
//		mav.addObject("이름",데이터);
		mav.addObject("maindata","TESTDATA");
		//2. 포워딩 - 페이지 지정
		mav.setViewName("MemberJoin"); // /WEB_INF/views/main.jsp 페이지를 담는 방식
		
		
		return mav; // 
	}
	@RequestMapping(value = "/testPage")
	public ModelAndView testPage(int testnum,@RequestParam(value="teststr")String tstr
			,@RequestParam(value="testval",defaultValue="TEST")String testval) {
		System.out.println("/testPage 요청");
		System.out.println("testnum : "+testnum);
		System.out.println("tstr : " + tstr);
		System.out.println("testval : " + testval);
		return null;
	}
	@RequestMapping(value="/testJoin")
	public ModelAndView testJoin(Member member) {
		System.out.println("/testJoin 요청");
		ModelAndView mav = new ModelAndView();
		//1. 회원가입 회원정보 파라메터 확인
		System.out.println(member);
		System.out.println(member.getMid());
		//2. SERVICE 회원가입 기능 호출
		//Member member = new Member();
		
		mav.setViewName("redirect:/"); // main.jsp 데이터 없이 넘어감
		
		return mav;
	}
	

}
