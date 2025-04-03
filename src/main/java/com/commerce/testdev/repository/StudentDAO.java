package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
      Student findById(int id);
}
/*
Hibernate: select s1_0.id,s1_0.age,s1_0.name from students s1_0 where s1_0.id=?
Hibernate: select cl1_0.student_id,cl1_1.id,cl1_1.name from students_courses cl1_0 join courses cl1_1 on cl1_1.id=cl1_0.course_id where cl1_0.student_id=?
Hibernate: select s1_0.course_id,s1_1.id,s1_1.age,s1_1.name from students_courses s1_0 join students s1_1 on s1_1.id=s1_0.student_id where s1_0.course_id=?
 */