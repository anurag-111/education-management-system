package com.myProject.Repository;

import com.myProject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    // JPQL (Java Persistence Query Language) query with named parameter
    @Query("SELECT student FROM Student student WHERE student.emailId = :emailId")
    Student getStudentByEmailAddress(@Param("emailId") String emailId);

    // JPQL (Java Persistence Query Language) query with named parameter
    @Query("SELECT student.firstName FROM Student student WHERE student.emailId = :emailId")
    String getStudentFirstNameByEmailAddress(@Param("emailId") String emailId);

    // Native query with named parameter
    @Query(value = "SELECT * FROM tbl_students student WHERE student.email_id = :emailId", nativeQuery = true)
    Student getStudentByLastNameByEmailAddressNative(@Param("emailId") String emailId);

}
