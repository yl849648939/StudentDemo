package com.example.Mapper;

import com.example.Bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface StudentMapper {
  List<Student>findAll();

    Student getById(@Param("s_id")String s_id);

    void updateStudent(@Param("s_id") String s_id);

    void deleteStudent(@Param("s_id") String s_id);

    List<Student> findStuInfo();
}
