package com.f.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f.ssm.model.Classes;
import com.f.ssm.service.ClassesService;

/**
* @author f
* @version 创建时间：2018年6月8日 下午1:06:36
* 类说明
*/
@Controller
@RequestMapping("/classes")
public class ClassessController {
	
	@Autowired
	private ClassesService classesService;
	
	/**
	 * 保存班级信息
	 * @param classes
	 * @return
	 */
	@RequestMapping("/save")
	public String saveClasses(Classes classes) {
		classesService.saveClasses(classes);
		return "forward:/classes/getAllClasses";
	}

	/**
	 * 更新班级信息
	 * @param classes
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public String updateClasses(Classes classes) {
		classesService.updateClasses(classes);
		return "forward:/classes/getAllClasses";
	}
	
	/**
	 * 根据Id查询信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getClassesById/{id}")
	public Object getClassesById(@PathVariable Integer id) {
		return classesService.getClassesById(id);
	}
	
	/**
	 * 条件查询班级信息
	 * @param classes
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllClasses")
	public Object getAllClasses(Classes classes) {
		return classesService.getAllClasses(classes);
	}
	
	/**
	 * 根据id删除班级信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public String deleteClasses(@RequestParam Integer id) {
		classesService.deleteClasses(id);
		return "redirect:/classes/getAllClasses";
	}
	
	@RequestMapping("/test")
	public String test() {
		//return "redirect:/classes/getAllClasses";
		return "main";
	}
}
