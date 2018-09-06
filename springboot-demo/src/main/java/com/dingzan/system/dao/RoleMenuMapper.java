package com.dingzan.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dingzan.system.domain.RoleMenu;
import com.dingzan.system.domain.RoleMenuExample;

public interface RoleMenuMapper {
    long countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);

	List<Long> selectMenuIdByRoleId(Long roleId);
}