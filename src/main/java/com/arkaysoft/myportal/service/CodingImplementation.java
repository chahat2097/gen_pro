package com.arkaysoft.myportal.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@Component
public class CodingImplementation {

    public String palindrome(String s) {

    char[] cc = s.toCharArray();
    int a = 0;
    int b = s.length() - 1;

        for(int i = 0;i<s.length();i++)
        {
        if (cc[i] != cc[b - i]) {
            a = 1;
        }
    }if(a==1){
            return "no it's not a palindrome";
        }else{
            return "yes it's a palindrome";
        }
}

}
