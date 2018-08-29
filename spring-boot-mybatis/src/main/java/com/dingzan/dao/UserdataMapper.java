package com.dingzan.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dingzan.domain.Userdata;
import com.dingzan.domain.UserdataExample;

public interface UserdataMapper {
    long countByExample(UserdataExample example);

    int deleteByExample(UserdataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userdata record);

    int insertSelective(Userdata record);

    List<Userdata> selectByExample(UserdataExample example);

    Userdata selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByExample(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByPrimaryKeySelective(Userdata record);

    int updateByPrimaryKey(Userdata record);
}