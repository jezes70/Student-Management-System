package com.cyngofokglobal.studentmanagementsystemspringboot.repository;

import com.cyngofokglobal.studentmanagementsystemspringboot.entity.Course;
import com.cyngofokglobal.studentmanagementsystemspringboot.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {


    @Autowired
    private TeacherRepository teacherRepository;


     @Test
    public void saveTeacher(){

        Course courseDBE = Course.builder()
                .title("DBE")
                .credit(4)
                .build();

        Course courseNode = Course.builder()
                .title("Node")
                .credit(5)
                .build();

        Course course_Net = Course.builder()
                .title("_Net")
                .credit(2)
                .build();


        Teacher teacher = Teacher.builder()
                .firstName("Jessica")
                .lastName("Harry")
//                .courses(List.of(courseDBE,courseNode,course_Net))
                .build();

        teacherRepository.save(teacher);
    }

}