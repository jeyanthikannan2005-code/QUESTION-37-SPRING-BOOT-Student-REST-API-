package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public String students() {

        return "[{\"id\":101,\"name\":\"Arun\",\"course\":\"Java Full Stack\"}," +
               "{\"id\":102,\"name\":\"Priya\",\"course\":\"Java Full Stack\"}]";
    }
}