package com.dingzan.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.dao.AccountInfoMapper;
import com.dingzan.dao.CustomerInfoMapper;
import com.dingzan.domain.AccountInfo;
import com.dingzan.domain.AccountInfoExample;
import com.dingzan.domain.CustomerInfo;
import com.dingzan.domain.CustomerInfoExample;
import com.dingzan.domain.CustomerInfoExample.Criteria;
import com.dingzan.pojo.CustomerInfoVO;
import com.dingzan.pojo.QueryVO;
import com.dingzan.service.CustomerInfoService;
import com.dingzan.utils.DataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Transactional
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService{

	@Autowired
	private CustomerInfoMapper customerInfoMapper;
	
	@Autowired
	private AccountInfoMapper accountInfoMapper;
	
	@Override
	public DataGridResult list(QueryVO vo) {
		PageHelper.startPage(vo.getPageNo(), vo.getRows());
		CustomerInfoExample example = new CustomerInfoExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(vo.getComment())) {
			criteria.andCommentLike("%"+vo.getComment()+"%");
		}
		if (StringUtils.isNotBlank(vo.getCusName())) {
			criteria.andCusNameEqualTo(vo.getCusName());
		}
		if (StringUtils.isNotBlank(vo.getCusType())) {
			criteria.andCusTypeEqualTo(vo.getCusType());
		}
		if (StringUtils.isNotBlank(vo.getMobile())) {
			criteria.andMobileEqualTo(vo.getMobile());
		}
		List<CustomerInfo> list = customerInfoMapper.selectByExample(example);
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<CustomerInfo> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		return DataGridResult;
	}

	@Override
	public CustomerInfoVO getinfo(Long cusId) {
		
		CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(cusId);
		String[] cuslabel = customerInfo.getCusLabel().split(",");
		CustomerInfoVO customerInfoVO = new CustomerInfoVO();
		customerInfoVO.setCusId(cusId);
		customerInfoVO.setCusName(customerInfo.getCusName());
		customerInfoVO.setCusType(customerInfo.getCusType());
		customerInfoVO.setCusAccount(customerInfo.getCusAccount());
		customerInfoVO.setIdType(customerInfo.getIdType());
		customerInfoVO.setIdNumber(customerInfo.getIdNumber());
		customerInfoVO.setCusLabel(cuslabel);
		
		return customerInfoVO;
	}

	@Override
	public DataGridResult getaccount(int pageNo, int rows, Long cusId) {
		PageHelper.startPage(pageNo, rows);
		AccountInfoExample example = new AccountInfoExample();
		
		example.createCriteria().andCusIdEqualTo(cusId);
		List<AccountInfo> list = accountInfoMapper.selectByExample(example);
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<AccountInfo> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return DataGridResult;
	}

}
