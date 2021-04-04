package zzyzzy.spring.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TilesController {

    @GetMapping("/index3")
    public ModelAndView index2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.tiles");
        mav.addObject("msg", "Hello, Repeatedly!!");
        return mav;
    }

}
