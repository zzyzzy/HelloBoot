package zzyzzy.spring.helloboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zzyzzy.spring.helloboot.dao.MemberDAO;
import zzyzzy.spring.helloboot.vo.MemberVO;

import javax.servlet.http.HttpSession;

@Service("msrv")
public class MemberServiceImpl implements MemberService {

    private MemberDAO mdao;

    @Autowired
    public MemberServiceImpl(MemberDAO mdao) {
        this.mdao = mdao;
    }

    public String joinMember(MemberVO mvo) {
        String result = "redirect:/joinfail";

        int cnt = mdao.insertMember(mvo);
        if (cnt > 0) result = "redirect:/jlogin";

        return result;
    }

    public String loginMember(MemberVO mvo, HttpSession sess) {
        String result = "redirect:/loginfail";

        int cnt = mdao.loginMember(mvo);
        if (cnt > 0) {
            sess.setAttribute("lgninfo", mvo);
            result = "redirect:/index3";
        }

        return result;
    }

}
