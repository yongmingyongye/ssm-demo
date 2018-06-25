package com.f.ssm.model;

/**
* @author f
* @version 创建时间：2018年5月30日 下午3:05:10
* 学生表实体
*/

public class Student {
	
	private Integer id;//学生表主键
	private String name;//学生名字
	private String sex;//学生性别
	private Integer age;//学生年龄
	private String address;//学生家庭住址
	private Classes classes;//班级
	
	public Student() {
		super();
	}

	public Student(Integer id, String name, String sex, Integer age, String address, Classes classes) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.classes = classes;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", address=" + address
				+ ", classes=" + classes + "]";
	}

	

}
