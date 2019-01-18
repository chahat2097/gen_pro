package com.arkaysoft.myportal.rest;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String sayhello(HttpServletRequest request){

        System.out.println("Recieved Web request for Hello. Returning result");
        return "Hello My Chahat. I thing your IP address is : " + request.getRemoteAddr();
    }

    @PostMapping(path="/hello-caller")
    public String postGreet(@RequestParam("callerName") String caller /*HttpServletRequest request*/){

        System.out.println("Recieved Web request for Hello. Returning result");
        return "Hello My " + caller + ", How are you?";
    }

    @GetMapping (path="/greet/{callerName}/{from}/{age}")
    public String getGreet(@PathVariable("callerName") String caller, @PathVariable("from") String from, @PathVariable("age") int age){

        return "Hello My " + caller + " aged "+ age +" from "+  from + " How are you?";
    }


}
