package com.madeofwu.property.dao;

import com.madeofwu.property.bean.Serves;
import com.madeofwu.property.bean.ServesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ServesMapper {
    int countByExample(ServesExample example);

    int deleteByExample(ServesExample example);

    int deleteByPrimaryKey(Integer serveId);

    int insert(Serves record);

    int insertSelective(Serves record);
    
    List<Serves> selectByExampleWithDeptAndBuilding(ServesExample example);

    List<Serves> selectByExample(ServesExample example);

    Serves selectByPrimaryKey(Integer serveId);

    int updateByExampleSelective(@Param("record") Serves record, @Param("example") ServesExample example);

    int updateByExample(@Param("record") Serves record, @Param("example") ServesExample example);

    int updateByPrimaryKeySelective(Serves record);

    int updateByPrimaryKey(Serves record);
}