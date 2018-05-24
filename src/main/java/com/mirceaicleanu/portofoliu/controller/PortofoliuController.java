package com.mirceaicleanu.portofoliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class PortofoliuController {

    @GetMapping(path="/index")
    public String index() {
        return "index.html";
    }
}
