package com.alunocontrole.acontrole.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {

            Student vitor = new Student(
                    "Vitor",
                    "vitor@vitor.com",
                    LocalDate.of(1990, 9, 9)
            );

            Student gabriel = new Student(
                    "gabriel",
                    "gabriel@gabriel.com",
                    LocalDate.of(2010, 9, 9)
            );
            repository.saveAll(
                    List.of(vitor, gabriel)
            );
        };
    }

}
