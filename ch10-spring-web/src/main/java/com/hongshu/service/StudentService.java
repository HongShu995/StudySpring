package com.hongshu.service;

import com.hongshu.entity.Student;

import java.util.List;

public interface StudentService
{
    int addStudent(Student student);

    List<Student> queryStudent();
}
