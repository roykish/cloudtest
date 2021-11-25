package com.cloudclient.cloud.client.controller;

import com.cloudclient.cloud.client.model.Student;
import com.cloudclient.cloud.client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
   private StudentService studentService;

    @GetMapping("/id")
    public Student getById(@RequestParam(value="id", defaultValue="1") int id){
        return studentService.getByStudentId(id);
    }

    @RequestMapping(value="/name", method=RequestMethod.GET)
    public Student getByName( @RequestParam(value="name", defaultValue="Kishor")String name){
        return studentService.getByStudentName(name);
    }
    @PostMapping("/save")
    public boolean saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }
}
