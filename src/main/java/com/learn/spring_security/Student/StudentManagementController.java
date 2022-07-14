package com.learn.spring_security.Student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James caro"),
            new Student(2, "fatai fool"),
            new Student(3, "meme mees")
    );

    @PreAuthorize("hasAnyRole('ADMIN','ADMINTRAINEE')")
    @GetMapping
    public List<Student> getAllSTudents(){
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void AddStudnet(@RequestBody Student  student){
        System.out.println("AddStudnet");
        System.out.println(student);
    }

    @PreAuthorize("hasAuthority('student:write')")
    @DeleteMapping(path = "{studentId}")
    public void DeleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("DeleteStudent");
        System.out.println(studentId);
    }
    @PreAuthorize("hasAuthority('student:write')")
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId")  Integer studentId,@RequestBody Student student){
        System.out.println(String.format("%s %s",studentId, student));
    }
}

