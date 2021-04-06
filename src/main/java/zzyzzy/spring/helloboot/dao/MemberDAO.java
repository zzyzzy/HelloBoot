package zzyzzy.spring.helloboot.dao;

import zzyzzy.spring.helloboot.vo.MemberVO;

public interface MemberDAO {
    int insertMember(MemberVO mvo);

    int loginMember(MemberVO mvo);
}
