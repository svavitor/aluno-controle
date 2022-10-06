package com.alunocontrole.acontrole.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Vitor",
                        "vitor@vitor.com",
                        LocalDate.of(1990, 9, 9),
                        20
                )
        );
    }

}
