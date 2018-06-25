package com.f.ssm.mapper;
/**
* @author f
* @version 创建时间：2018年6月1日 上午10:50:55
* classesMapper接口
*/

import java.util.List;

import com.f.ssm.model.Classes;

public interface ClassesMapper {
	
	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	public Classes getClassesById(Integer id);
	
	/**
	 * 获取班级信息
	 * @return
	 */
	public List<Classes> getAllClasses(Classes classes);
	
	/**
	 * 插入班级信息
	 * @param classes
	 */
	public void saveClasses(Classes classes);
	
	/**
	 * 更新班级信息
	 * @param classes
	 */
	public void updateClasses(Classes classes);
	
	/**
	 * 根据删除信息
	 * @param id
	 */
	public void delateClasses(Integer id);
	
}
