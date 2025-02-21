package com.rest.apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethod {
    @GetMapping("/hello")
    public String fn(){
        return "hello:) {muishi? ,muishi!}";
    }
    @GetMapping("/hello/query")
    public String fn2(@RequestParam String name){
        return "hello:) "+name+" {muishi? ,muishi!}";
    }
    @GetMapping("hello/param/{name}")
    public String fn3(@PathVariable String name){
        return "hello:) "+name+" {muishi? ,muishi!}";
    }
}
