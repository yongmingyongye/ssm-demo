package com.f.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.f.ssm.model.Classes;
import com.f.ssm.model.Student;
import com.f.ssm.service.StudentService;

/**
* @author f
* @version 创建时间：2018年5月31日 上午9:19:08
* 学生操作测试
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestStudentController {

	@Autowired
	private StudentService studentService;
	
	@Before
	public void setUp() throws Exception {
	}

	//@Test
	public void testSaveStudent() throws Exception {
		Student student = new Student();
		Classes classes = new Classes();
		classes.setId(10);
		for(int i=0;i<10;i++) {
			student.setName("学生"+i);
			student.setSex("男");
			student.setAge(18+i);
			student.setAddress(student.getName()+"的住址");
			student.setClasses(classes);
			studentService.saveStudent(student);
		}
	}
	
	@Test
	public void testStudent() throws Exception{
		/*Student student = studentService.getStudentById(1);
		System.out.println(student.toString());
		student.setAge(24);
		student.setAddress("测试修改和查询");
		studentService.updateStudent(student);
		student = studentService.getStudentById(student.getId());
		System.out.println(student.toString());*/
		List<Student> students = studentService.getAllStudent();
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
