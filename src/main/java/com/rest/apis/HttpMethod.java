package com.rest.apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethod {
    @GetMapping("/hello")
    public String fn(){
        return "hello:) {muishi? ,muishi!}";
    }
}
