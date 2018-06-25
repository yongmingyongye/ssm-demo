package com.f.ssm.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f.ssm.model.Student;
import com.f.ssm.service.StudentService;

/**
* @author f
* @version 创建时间：2018年6月5日 上午8:35:18
* Student业务控制
*/
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	private final Log Logger = LogFactory.getLog(this.getClass());
	
	/**
	 * 添加学生信息
	 * @param student
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String saveStudent(Student student) throws Exception {
		studentService.saveStudent(student);
		return student.toString();
	}
	
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String updateStudent(Student student) throws Exception{
		studentService.updateStudent(student);
		return student.toString();
	}
	
	/**
	 * 根据id查找学生信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getStudentById/{id}")
	@ResponseBody
	public String getStudentById(@PathVariable("id") Integer id) throws Exception{
		return studentService.getStudentById(id).toString();
	}
	
	@RequestMapping("/getAllStudent")
	@ResponseBody
	public Object getAllStudent() throws Exception{
		List<Student> students = studentService.getAllStudent();
		for(Student s : students) {
			Logger.debug(s.toString());
		}
		return students;
	}
	
	@RequestMapping("/deleteStudent")
	@ResponseBody
	public String deleteStudent(@RequestParam("id") Integer id) throws Exception{
		studentService.deleteStudent(id);
		return "delete:" + id;
	}
	
}
