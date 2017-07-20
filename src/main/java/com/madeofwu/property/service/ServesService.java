package com.madeofwu.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.property.bean.Serves;
import com.madeofwu.property.bean.ServesExample;
import com.madeofwu.property.bean.ServesExample.Criteria;
import com.madeofwu.property.dao.ServesMapper;

@Service
public class ServesService {
	@Autowired
	private ServesMapper servesMapper;
	
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Serves> getAll() {
		// TODO Auto-generated method stub
		return servesMapper.selectByExampleWithDeptAndBuilding(null);
	}

	/**
	 * 员工保存
	 * @param employee
	 */
	public void saveServe(Serves serves) {
		// TODO Auto-generated method stub
		servesMapper.insertSelective(serves);
	}

	

	/**
	 * 按照员工id查询员工
	 * @param id
	 * @return
	 */
	public Serves getServe(Integer id) {
		// TODO Auto-generated method stub
		Serves serves = servesMapper.selectByPrimaryKey(id);
		return serves;
	}

	/**
	 * 员工更新
	 * @param employee
	 */
	public void updateServe(Serves serves) {
		// TODO Auto-generated method stub
		servesMapper.updateByPrimaryKeySelective(serves);
	}

	/**
	 * 员工删除
	 * @param id
	 */
	public void deleteServe(Integer id) {
		// TODO Auto-generated method stub
		servesMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		ServesExample example = new ServesExample();
		Criteria criteria = example.createCriteria();
		//delete from xxx where emp_id in(1,2,3)
		criteria.andServeIdIn(ids);
		servesMapper.deleteByExample(example);
	}
}
