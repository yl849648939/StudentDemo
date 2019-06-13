package com.example.Controller;

import com.example.Bean.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/stus")
    @ResponseBody
    //查询所有
    public String findList(Model model){
        List<Student> list = studentService.findAll();
        model.addAttribute("students",list);
        return "student";
    }
    //到修改界面，查询要修改的学生信息
    @GetMapping("/stu/{s_id}")
    @ResponseBody
    public  String toEdit(@PathVariable("s_id")String id, Model model){
       Student student=studentService.getById(id);
       model.addAttribute("student",student);
        return "edit";
    }
    //修改学生信息，并重定向到查询界面
    @PutMapping("/stu/{s_id}")
    @ResponseBody
    public  String updateStudent(@PathVariable("s_id")String s_id){
        studentService.updateStudent(s_id);
        return "redirect:/student";
    }
    @DeleteMapping("/stu/{s_id}")
    @ResponseBody
public  String deleteStudent(@PathVariable("s_id")String s_id){
        studentService.deleteStudent(s_id);
        return "redirect:/student";
    }
    @GetMapping("/stuInfo")
    @ResponseBody
    public  String findStuInfo(Model model){
        List<Student> stuInfo=studentService.findStuInfo();
        return "/student";
    }
}
