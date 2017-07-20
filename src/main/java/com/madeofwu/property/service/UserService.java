package com.madeofwu.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.property.bean.User;
import com.madeofwu.property.bean.UserExample;
import com.madeofwu.property.bean.UserExample.Criteria;
import com.madeofwu.property.dao.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByExampleWithBuilding(null);
	}

	/**
	 * 员工保存
	 * @param userloyee
	 */
	public void saveU(User user) {
		// TODO Auto-generated method stub
		userMapper.insertSelective(user);
	}

	/**
	 * 检验用户名是否可用
	 * 
	 * @param userName
	 * @return  true：代表当前姓名可用   fasle：不可用
	 */
	public boolean checkUser(String userName) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		long count = userMapper.countByExample(example);
		return count == 0;
	}

	/**
	 * 按照员工id查询员工
	 * @param id
	 * @return
	 */
	public User getU(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	
	/**
	 * @param user
	 */
	public void updateU(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteU(Integer id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		//delete from xxx where user_id in(1,2,3)
		criteria.andUserIdIn(ids);
		userMapper.deleteByExample(example);
	}
}
