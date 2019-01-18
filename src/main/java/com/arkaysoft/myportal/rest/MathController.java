package com.arkaysoft.myportal.rest;

import com.arkaysoft.myportal.service.MyCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {


    @Autowired
    private MyCalculatorService myCalculatorService;

    @GetMapping(path = "/add/{num1}/{num2}")
    public int add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {

        System.out.println(num1);
        System.out.println(num2);
        int num3 = myCalculatorService.addNum(num1, num2);
        System.out.println(num3);
        return num3;
    }

    @GetMapping(path = "/sub/{num1}/{num2}")
    public int sub(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {

        System.out.println(num1);
        System.out.println(num2);
        int num3 = myCalculatorService.subNum(num1, num2);
        System.out.println(num3);
        return num3;
    }

    @GetMapping(path = "/mul/{num1}/{num2}")
    public float mul(@PathVariable("num1") float num1, @PathVariable("num2") float num2) {

        System.out.println(num1);
        System.out.println(num2);
        float num3 = myCalculatorService.mulNum(num1, num2);
        System.out.println(num3);
        return num3;
    }


    @GetMapping(path = "/div/{num1}/{num2}")
    public float div(@PathVariable("num1") float num1, @PathVariable("num2") float num2) {

        System.out.println(num1);
        System.out.println(num2);
        float num3 = myCalculatorService.divNum(num1, num2);
        System.out.println(num3);
        return num3;

    }

}
