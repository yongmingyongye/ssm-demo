package com.f.ssm.service;
/**
* @author f
* @version 创建时间：2018年6月1日 上午10:58:13
* 类说明
*/

import java.util.List;

import com.f.ssm.model.Classes;

public interface ClassesService {
	
	public Classes getClassesById(Integer id);
	
	public List<Classes> getAllClasses(Classes classes);
	
	public void saveClasses(Classes classes);
	
	public void updateClasses(Classes classes);
	
	public void deleteClasses(Integer id);

}
