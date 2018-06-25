package com.f.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f.ssm.mapper.StudentMapper;
import com.f.ssm.model.Student;
import com.f.ssm.service.StudentService;

/**
* @author 作者姓名
* @version 创建时间：2018年5月31日 下午2:54:21
* 类说明
*/
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 添加学生
	 */
	@Override
	public void saveStudent(Student student) throws Exception {
		studentMapper.saveStudent(student);
	}

	/**
	 * 更新学生
	 */
	@Override
	public void updateStudent(Student student) throws Exception {
		studentMapper.updateStudent(student);
	}

	/**
	 * 通过id获取学生信息
	 */
	@Override
	public Student getStudentById(Integer id) throws Exception {
		return studentMapper.getStudentById(id);
	}

	/**
	 * 获取所有学生信息
	 */
	@Override
	public List<Student> getAllStudent() throws Exception {
		return studentMapper.getAllStudent();
	}

	/**
	 * 删除学生
	 */
	@Override
	public void deleteStudent(Integer id) throws Exception {
		studentMapper.deleteStudent(id);
	}

	
}
