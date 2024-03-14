package com.example.spring.one.studunt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {
    @Autowired
    public studentController(com.example.spring.one.studunt.studentService
                                     studentService) {
        this.studentService = studentService;
    }

    private final studentService studentService;
    @GetMapping
    public List<student>  getStudents(){
       return studentService.getStudents();

    }
}
