package com.dingzan.dao;

import com.dingzan.domain.CustomerInfo;
import com.dingzan.domain.CustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoMapper {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long cusId);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long cusId);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}