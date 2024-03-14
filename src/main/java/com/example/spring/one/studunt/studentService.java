package com.example.spring.one.studunt;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentService {

    public List<student> getStudents (){
        return List.of(
                new student(
                        1L,
                        "vincent",
                        "vincent@gmail.com",
                        LocalDate.of(2002, Month.NOVEMBER,5),
                        22

                )
        );
    }
}
