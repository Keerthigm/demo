package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args ->{

                    Student keerthana = new Student(
                            1L,
                            "Keerthana",
                            "keerthanamanamurugan@gmail.com",
                            LocalDate.of(1994, Month.OCTOBER,3)


                    );
            Student mani = new Student(
                    2L,
                    "mani",
                    "dmani1987@gmail.com",
                    LocalDate.of(1987, Month.JANUARY,30)


            );
            repository.saveAll(
                    List.of(keerthana , mani)
            );


        };
    }
}
