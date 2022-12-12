package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("classlist")
    public String classList(Model model){
        List<String> test = new ArrayList<String>();
        test.add("실전프로젝트1");
        test.add("웹서개");

        model.addAttribute("classList",test);
        String msg ="Lee List ";
        model.addAttribute("title",msg);
        return "board/list";

    }

}


