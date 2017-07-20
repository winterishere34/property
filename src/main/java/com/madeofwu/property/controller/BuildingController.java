package com.madeofwu.property.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madeofwu.property.bean.Building;
import com.madeofwu.property.bean.Msg;
import com.madeofwu.property.service.BuildingService;


@Controller
public class BuildingController {

	@Autowired
	private BuildingService buildService;
	/**
	 * 返回所有的部门信息
	 */
	@RequestMapping("/builds")
	@ResponseBody
	public Msg getBuilds(){
		//查出的所有部门信息
		List<Building> list = buildService.getBuilds();
		return Msg.success().add("builds", list);
	}
}
