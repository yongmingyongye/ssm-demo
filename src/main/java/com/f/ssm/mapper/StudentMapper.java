package com.f.ssm.mapper;

import java.util.List;

import com.f.ssm.model.Student;

/**
* @author 作者姓名
* @version 创建时间：2018年5月30日 下午3:14:50
* 
*/
public interface StudentMapper {
	
	/**
	 * 插入student信息
	 * @param student
	 * @throws Exception
	 */
	void saveStudent(Student student) throws Exception;
	
	/**
	 * 更新student信息
	 * @param student
	 * @throws Exception
	 */
	void updateStudent(Student student) throws Exception;
	
	/**
	 * 通过id获取student信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Student getStudentById(Integer id) throws Exception;
	
	/**
	 * 获取所有student信息
	 * @return
	 * @throws Exception
	 */
	List<Student> getAllStudent() throws Exception;
	
	/**
	 * 根据id删除学生信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteStudent(Integer id) throws Exception;

}
