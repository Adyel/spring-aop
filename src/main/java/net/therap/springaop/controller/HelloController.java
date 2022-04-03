package net.therap.springaop.controller;

import net.therap.springaop.aspect.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author adyel.ullahil
 * @since 4/3/22
 */

@Controller
public class HelloController {

    @Log
    @GetMapping("/")
    @ResponseBody
    public String logTester(){
        return "OK";
    }
}
