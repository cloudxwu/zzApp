package java.com.zz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = "/index", produces = "application/json;charset=utf-8")
public class RootController { 

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}
