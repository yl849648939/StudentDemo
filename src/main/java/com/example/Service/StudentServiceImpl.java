package com.example.Service;

import com.example.Bean.Student;
import com.example.Mapper.StudentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        List<Student> list = studentMapper.findAll();
        return list;
    }

    @Override
    public Student getById(@Param("s_id")String s_id) {
       Student student= studentMapper.getById(s_id);
       return  student;
    }

    @Override
    public void updateStudent(@Param("s_id")String s_id) {
        studentMapper.updateStudent(s_id);
    }

    @Override
    public void deleteStudent(@Param("s_id")String s_id) {
        studentMapper.deleteStudent(s_id);
    }

    @Override
    public List<Student> findStuInfo() {
List<Student> students=studentMapper.findStuInfo();
        System.out.println(students);
return students;
    }
}
