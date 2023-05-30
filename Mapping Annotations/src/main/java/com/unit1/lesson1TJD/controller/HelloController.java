package com.unit1.lesson1TJD.controller;

import com.unit1.lesson1TJD.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello Lankaran!";
    }

    @GetMapping(path = {"/message1", "/message1/{message}"})
    public String getMessage(@PathVariable(name = "message", required = false) String m) {
        return "Your message is: " + m;
    }

    @GetMapping(path = "/message2")
    public String getMyMessage(@RequestParam(name = "message", required = false, defaultValue = "abc") String m) {
        return "My message is: " + m;
    }

    @PostMapping("user")
    public User saveUser(@RequestBody User user) {
        return user;
    }

    @PostMapping("/users")
    public List<User> saveUsers(@RequestBody List<User> users) {
        return users;
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("Accept-Language") String header){
        return "Your header is " + header;
    }
}
