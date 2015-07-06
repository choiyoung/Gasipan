package service;

import java.lang.reflect.Member;
import java.util.List;

import bean.MemberBean;
/*
@ Date : 2015.06
@ Author : ITB-1
@ Story : 회원관리 인터페이스
*/
public interface MemberService {
	    /*insert : 회원가입*/
	    public int join(MemberBean bean);
	    /*count : 회원수*/
	    public int count();
	    /*getElementById : 회원상세정보*/
	    public MemberBean memberDetail(String id);
	    /*getElementsBYName : 검색어로 회원 검색*/
	    public List<MemberBean> searchByKeyword(String Keyword);
	    /*list : 회원전체 목록*/
	    public List<Object> memberList();	  
	    /*update : 회원정보 수정*/
	    public int updateMember(MemberBean bean);
	    /*delete : 회원탈퇴*/
	    public int deleteMember(String id);
	    /*login : 로그인*/
	    public String login(String id, String password);
		
		    

}
