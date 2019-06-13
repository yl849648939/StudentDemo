package com.example.Service;

import com.example.Bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

   List<Student>findAll();

    Student getById(@Param("s_id") String s_id);

    void updateStudent(@Param("s_id")String s_id);

    void deleteStudent(@Param("s_id")String s_id);

    List<Student> findStuInfo();
}
