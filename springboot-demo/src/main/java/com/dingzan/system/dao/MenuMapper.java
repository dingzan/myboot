package com.dingzan.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dingzan.system.domain.Menu;
import com.dingzan.system.domain.MenuExample;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Long menuId);
    
    //多表查询  通过用户ID查询菜单信息(不包括按钮)
  	List<Menu> listMenuByUserId(Long id);

  	//多表查询  通过用户ID查询菜权限项
  	List<String> listUserPerms(Long id);
  	
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}