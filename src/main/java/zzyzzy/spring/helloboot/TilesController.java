package zzyzzy.spring.helloboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import zzyzzy.spring.helloboot.service.MemberService;
import zzyzzy.spring.helloboot.vo.MemberVO;

import javax.servlet.http.HttpSession;

@Controller
public class TilesController {

    private MemberService msrv;

    @Autowired
    public TilesController(MemberService msrv) {
        this.msrv = msrv;
    }

    @GetMapping("/index3")
    public ModelAndView index2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.tiles");
        mav.addObject("msg", "Hello, Repeatedly!!");
        return mav;
    }

    @GetMapping("/jjoin")    // 회원가입 폼
    public String join() {
        //return "jsp/join";
        return "join.tiles";
    }

    @PostMapping("/jjoinok") // 회원가입 처리
    public String joinok(MemberVO mvo) {

        String result = msrv.joinMember(mvo);

        return result;
    }

    @GetMapping("/jlogin")
    public String login() {
        return "login.tiles";
    }

    @PostMapping("/jloginok") // 회원가입 처리
    public String loginok(MemberVO mvo, HttpSession sess) {

        String result = msrv.loginMember(mvo, sess);

        return result;
    }

    @GetMapping("/jlogout")
    public String logout(HttpSession sess) {
        sess.invalidate();
        return "redirect:/index3";
    }

    @GetMapping("/jlist")
    public String list() {
        return "list.tiles";
    }

    @GetMapping("/jmyinfo")
    public String myinfo() {
        return "myinfo.tiles";
    }

}
