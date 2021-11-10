package com.hongshu.dao;

import com.hongshu.entity.Student;

import java.util.List;

public interface StudentDao
{
    int insertStudent(Student student);

    List<Student> selectStudents();
}
