package com.arkaysoft.myportal.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@Service
@Component
public class MyCalculatorService {

    public int addNum(int a, int b){


        return a + b;
    }

    public int subNum(int a, int b){
        return a - b;
    }

    public float mulNum(float a, float b){
        return a * b;
    }

    public float divNum(float a, float b){
        return a / b;
    }

    public String name

}
