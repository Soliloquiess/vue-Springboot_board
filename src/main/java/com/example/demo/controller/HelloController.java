package com.example.demo.controller;

import com.example.demo.domain.ResultVO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello Test";
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("name") String name, @RequestParam("id") Integer id) {
        return "Hello" + name + "id " + id;
    }

    @GetMapping("/hello32/{name}/{id}")
    public String hello32(@PathVariable String name, @PathVariable Integer id) {
        return "Hello" + name + "Id " +id;
    }

    @PostMapping("/hello33")
    public String hello33(@RequestParam("name") String name) {
        return "Hello" + name;
    }

    @PostMapping("/hello4")
    public String hello4(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/hello5")
    public ResultVO hello5(@RequestParam("name") String name) {
        ResultVO result = new ResultVO(0, name);
        return result;
    }

    @PostMapping("/hello6")
    public ResultVO hello6(@RequestBody ResultVO result) {
        return result;
    }

}
