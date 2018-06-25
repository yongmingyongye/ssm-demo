package com.f.ssm.service;

import java.util.List;

import com.f.ssm.model.Student;

/**
* @author f
* @version 创建时间：2018年5月31日 上午11:14:38
* StudentService接口
*/
public interface StudentService {
	
	public void saveStudent(Student student) throws Exception;
	public void updateStudent(Student student) throws Exception;
	public Student getStudentById(Integer id) throws Exception;
	public List<Student> getAllStudent() throws Exception;
	public void deleteStudent(Integer id) throws Exception;
}
