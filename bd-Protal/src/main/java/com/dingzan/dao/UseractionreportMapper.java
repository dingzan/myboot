package com.dingzan.dao;

import com.dingzan.domain.Useractionreport;
import com.dingzan.domain.UseractionreportExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseractionreportMapper {
    long countByExample(UseractionreportExample example);

    int deleteByExample(UseractionreportExample example);

    int insert(Useractionreport record);

    int insertSelective(Useractionreport record);

    List<Useractionreport> selectByExample(UseractionreportExample example);
    
    List<Useractionreport> selectBatch(List<Date> list);

    int updateByExampleSelective(@Param("record") Useractionreport record, @Param("example") UseractionreportExample example);

    int updateByExample(@Param("record") Useractionreport record, @Param("example") UseractionreportExample example);
}