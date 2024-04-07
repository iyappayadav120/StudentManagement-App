package com.projectjava.studentmanagementbackendapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.projectjava.studentmanagementbackendapp.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo extends JpaRepository <Student, Integer> {

}