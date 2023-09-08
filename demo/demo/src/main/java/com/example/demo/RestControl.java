/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author thesb
 */
@org.springframework.web.bind.annotation.RestController
public class RestControl {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello, World!";
    }
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam (value = "name", defaultValue = "World") String name) {
        return "Hello, " + name;
    }
    
    
}
