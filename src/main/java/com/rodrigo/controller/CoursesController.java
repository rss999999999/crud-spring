package com.rodrigo.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.model.Course;
import com.rodrigo.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController //java servelt por traz dos panos, post, get, put, etc;
@RequestMapping("/api/courses")  //localhost:8080/api/courses
@AllArgsConstructor  //cria os constructors da public class (lombok), mesma coisa de apertar botao direito do mouse > source action > constructors
//@Component  //beans para criar uma instancia e gerenciar o ciclo de vida dessas isntâncias

public class CoursesController {

    //@Autowired  //injeção via atributo, porém isso não é uma boa 
    private final CourseRepository courseRepository;  

    @GetMapping   //mesma coisa do @RequestMapping(method = RequestMethod.GET)
    public List<Course> list(){           //usa o import declarado acima para pegar a lista da pasta model/Course.java
        return courseRepository.findAll();
    }
    
}
