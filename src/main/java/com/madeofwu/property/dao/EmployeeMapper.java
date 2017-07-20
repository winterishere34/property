package com.madeofwu.property.dao;

import com.madeofwu.property.bean.Employee;
import com.madeofwu.property.bean.EmployeeExample;
import com.madeofwu.property.bean.User;
import com.madeofwu.property.bean.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);
    
    List<Employee> selectByExampleWithDeptAndBuilding(EmployeeExample example);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}