package com.learn.spring_security.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {

    private final Integer studentId;
    private final String studentName;

    @Override
    public String toString() {
        return "Student{"+"StudentId= "+studentId+", studentName= "+studentName+'\''+'}';
    }
}
