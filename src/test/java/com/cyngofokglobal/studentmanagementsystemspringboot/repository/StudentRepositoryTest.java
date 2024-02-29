package com.cyngofokglobal.studentmanagementsystemspringboot.repository;

import com.cyngofokglobal.studentmanagementsystemspringboot.entity.Guardian;
import com.cyngofokglobal.studentmanagementsystemspringboot.entity.Student;
import org.aspectj.apache.bcel.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("chiqui@gmail.com")
                .firstName("Chiqui")
                .lastName("Morris")
//                .guardianName("Shabalala")
//                .guardianEmail("shabalala@gmail.com")
//                .guardianMobile("1234567890")
                .build();

        studentRepository.save(student);
    }


    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("shabalala@gmail.com")
                .name("Shabalala")
                .mobile("1234567890")
                .build();

        Student student = Student.builder()
                .firstName("Okpara")
                .lastName("Ifeanyi")
                .emailId("okpara@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();


        System.out.println("studentList = " + studentList);
    }
    @Test
    public void printStudentByFirstName() {

        List<Student> students = studentRepository.findByFirstName("Chiqui");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {

        List<Student> students = studentRepository.findByFirstNameContaining("Chi");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Shabalala");
        System.out.println("students = " + students);

    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student student = studentRepository.getStudentByEmailAddress("chiqui@gmail.com");

        System.out.println("student = " + student);
    }


    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName = studentRepository.getStudentFirstNameByEmailAddress(
                "okpara@gmail.com");
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative() {
        Student student = studentRepository.getStudentByEmailAddressNative("okpara@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNameParam() {
        Student student = studentRepository.getStudentByEmailAddressNativeNameParam("okpara@gmail.com");

        System.out.println("student = " + student);
    }


    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "Chiqui Morris",
                "chiqui@gmail.com");
    }
}
