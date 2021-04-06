package zzyzzy.spring.helloboot.service;

import zzyzzy.spring.helloboot.vo.MemberVO;

import javax.servlet.http.HttpSession;

public interface MemberService {
    String joinMember(MemberVO mvo);

    String loginMember(MemberVO mvo, HttpSession sess);
}
