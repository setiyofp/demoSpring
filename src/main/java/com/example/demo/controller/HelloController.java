/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author DELL-PC
 */
@Controller
public class HelloController {
    @RequestMapping("/index")  
    public String index()  
    {  
        return "Greetings from Spring Boot!";  
    }     
    
    /*
        REST sample
    */
    
    @GetMapping("/sample-map")
    @ResponseBody
    public Map sampleByMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("tipe", "sample by map");
        result.put("data1", "abc");
        result.put("data2", 123);
        return result;
    }
    
    @GetMapping("/sample-entity")
    @ResponseBody
    public ResponseEntity<Map> sampleByResponseEntity() {
        Map<String, Object> result = new HashMap<>();
        result.put("tipe", "sample by response entity");
        result.put("data1", "abc");
        result.put("data2", 123);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
