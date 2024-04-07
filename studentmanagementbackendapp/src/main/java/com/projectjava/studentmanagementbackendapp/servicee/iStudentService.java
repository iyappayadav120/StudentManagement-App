package com.projectjava.studentmanagementbackendapp.servicee;

import com.projectjava.studentmanagementbackendapp.Student;

import java.util.List;

public interface iStudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);

    public void deleteStudentById(Integer id);

}
