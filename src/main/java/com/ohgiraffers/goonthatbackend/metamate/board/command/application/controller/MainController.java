package com.ohgiraffers.goonthatbackend.metamate.board.command.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = {"/","/main"})
    public String main() {

        return "index"; //html 이름
    }


    @GetMapping("board/blog")
    public String blog() {

        return "board/blog";
    }
}
