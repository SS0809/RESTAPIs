package com.rest.apis;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    ArrayList<User> users = new ArrayList<>();
    @PostMapping("/hello/add/data")
//    The @RequestBody annotation in Spring Boot is used to bind
//    the body of an HTTP request to a method parameter
//    in a controller handler method. When you annotate a method parameter with @RequestBody ,
//    Spring Boot automatically converts the request body into the specified Java object.
    public Boolean fn4(@RequestBody User user){
        return users.add(user);
    }
}
