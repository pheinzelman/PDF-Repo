package com.heinzelman.pdf_repo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {

    @RequestMapping(value = {"/add"} , method = RequestMethod.GET )
    @ResponseBody
    public String addFile ( Model model ){
        return "abc";
    }

}
