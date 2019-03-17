package cn.teaey.sprintboot.test.controller;

import cn.teaey.sprintboot.test.AbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    AbcService abcService;

    @RequestMapping("/index")
    public String test(){
        abcService.echoService.echo("12");
        return "index";
    }
}
