package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mydata.Entity.Student;
@Repository
public interface StudentInterface extends JpaRepository<Student, Integer> {

	
}
