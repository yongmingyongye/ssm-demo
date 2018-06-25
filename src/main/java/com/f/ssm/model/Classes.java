package com.f.ssm.model;
/**
* @author f
* @version 创建时间：2018年5月30日 下午3:11:11
* 班级表实体
*/

import java.util.List;

public class Classes {
	
	private Integer id;//班级编号
	private String className;//班级名称
	private List<Student> studentList;//学生集合
	
	public Classes() {
		super();
	}

	public Classes(Integer id, String className, List<Student> studentList) {
		super();
		this.id = id;
		this.className = className;
		this.studentList = studentList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", className=" + className + ", studentList=" + studentList + "]";
	}
	
	
	

}
