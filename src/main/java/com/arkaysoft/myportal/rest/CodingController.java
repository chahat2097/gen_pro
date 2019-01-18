package com.arkaysoft.myportal.rest;

import com.arkaysoft.myportal.service.CodingImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class CodingController {

    @Autowired
    private CodingImplementation codingimplementation;

    @GetMapping(path ="/s")
    public String palin(@PathVariable("s") String s){

        System.out.println(s);
        String result = codingimplementation.palindrome(s);
        System.out.println(result);
        return result;
    }
}
