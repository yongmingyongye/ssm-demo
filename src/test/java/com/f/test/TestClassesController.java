package com.f.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.f.ssm.model.Classes;
import com.f.ssm.service.ClassesService;

/**
* @author 作者姓名
* @version 创建时间：2018年6月1日 上午11:04:15
* 类说明
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestClassesController {
	
	@Autowired
	private ClassesService classesService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testClasses() {
		Classes classes = classesService.getClassesById(10);
		System.out.println(classes.toString());
		
	}

}
