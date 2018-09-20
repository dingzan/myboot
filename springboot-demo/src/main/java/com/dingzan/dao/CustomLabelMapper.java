package com.dingzan.dao;

import com.dingzan.domain.CustomLabel;
import com.dingzan.domain.CustomLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomLabelMapper {
    long countByExample(CustomLabelExample example);

    int deleteByExample(CustomLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomLabel record);

    int insertSelective(CustomLabel record);

    List<CustomLabel> selectByExample(CustomLabelExample example);

    CustomLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomLabel record, @Param("example") CustomLabelExample example);

    int updateByExample(@Param("record") CustomLabel record, @Param("example") CustomLabelExample example);

    int updateByPrimaryKeySelective(CustomLabel record);

    int updateByPrimaryKey(CustomLabel record);
}