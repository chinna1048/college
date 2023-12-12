package com.college.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Student;
import com.college.management.entities.StudentClass;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
