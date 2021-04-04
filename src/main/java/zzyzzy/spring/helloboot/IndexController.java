package zzyzzy.spring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index1")
    public String index1() {
        return "<h1>Hello, Again!!</h1>";
    }

}
