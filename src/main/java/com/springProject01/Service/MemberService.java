package com.springProject01.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject01.Dao.MemberDao;
import com.springProject01.dto.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao mdao;
	
	public int memberJoin_svc(Member member) {
		System.out.println("service - memberJoin_svc() - 호출");
		//1. dao - INSERT INTO MEMBBERS
		int insertResult = mdao.insertMember(member);
		
		return insertResult;
	}

	public ArrayList<Member> getMemberList() {
		System.out.println("service - getMemberList() 호출");
		ArrayList<Member> mList = mdao.selectMemberList();
		return mList;
	}

}
