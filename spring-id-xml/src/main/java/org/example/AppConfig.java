package org.example;

import org.example.bean.Address;
import org.example.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //include also component
@ComponentScan
public class AppConfig {

   /* @Bean
    public Student student(Address mybean){
       *//* Student student= new Student();
        student.setName("Thuzar Nwe");
        student.setAdd(mybean); //implicit injection
       *//**//* student.setAdd(appConfig());*//**//*
        return student;  //explicit dependency injection
    }

    @Bean(name = {"address","mybean"})
    public Address appConfig(){
        Address address = new Address();
        address.setStreetName("Love Lane.");
        return address;
    }*/
}
