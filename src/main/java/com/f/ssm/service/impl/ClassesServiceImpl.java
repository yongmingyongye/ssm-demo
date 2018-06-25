package com.f.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f.ssm.mapper.ClassesMapper;
import com.f.ssm.model.Classes;
import com.f.ssm.service.ClassesService;

/**
* @author f
* @version 创建时间：2018年6月1日 上午11:01:06
* 类说明
*/
@Service
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	private ClassesMapper classesmapper;
	
	@Override
	public Classes getClassesById(Integer id) {
		return classesmapper.getClassesById(id);
	}

	@Override
	public List<Classes> getAllClasses(Classes classes) {
		return classesmapper.getAllClasses(classes);
	}

	@Override
	public void saveClasses(Classes classes) {
		classesmapper.saveClasses(classes);
	}

	@Override
	public void updateClasses(Classes classes) {
		classesmapper.updateClasses(classes);
	}

	@Override
	public void deleteClasses(Integer id) {
		classesmapper.delateClasses(id);
	}
	
	

}
