package zzyzzy.spring.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JstlController {

    @GetMapping("/index2")
    public ModelAndView index2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("msg", "Hello, In addition!!");
        return mav;
    }



}
