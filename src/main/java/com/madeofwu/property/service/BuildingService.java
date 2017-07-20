package com.madeofwu.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.property.bean.Building;
import com.madeofwu.property.dao.BuildingMapper;



	@Service
	public class BuildingService {
		
		@Autowired
		private BuildingMapper buildingMapper;

		public List<Building> getBuilds() {
			// TODO Auto-generated method stub
			List<Building> list = buildingMapper.selectByExample(null);
			return list;
		}

	}

