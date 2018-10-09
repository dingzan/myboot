package com.dingzan.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.dao.CustomLabelMapper;
import com.dingzan.domain.CustomLabel;
import com.dingzan.domain.CustomLabelExample;
import com.dingzan.domain.CustomLabelExample.Criteria;
import com.dingzan.pojo.CustomLabelVO;
import com.dingzan.service.CustomLabelService;
import com.dingzan.utils.DataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Transactional
@Service
public class CustomLabelServiceImpl implements CustomLabelService {

	@Autowired
	private CustomLabelMapper customLabelMapper;
	
	@Override
	public DataGridResult list(CustomLabelVO vo) {
		//设置分页信息
		PageHelper.startPage(vo.getPageNo(), vo.getRows());
		//封装条件
		CustomLabelExample example = new CustomLabelExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(vo.getFirstcategory())) {
			criteria.andFirstcategoryEqualTo(vo.getFirstcategory());
		}
		if (StringUtils.isNotBlank(vo.getSecondcategory())) {
			criteria.andSecondcategoryEqualTo(vo.getSecondcategory());
		}
		if (StringUtils.isNotBlank(vo.getThirdcategory())) {
			criteria.andThirdcategoryEqualTo(vo.getThirdcategory());
		}
		if (StringUtils.isNotBlank(vo.getComment())) {
			criteria.andCommentLike("%"+vo.getComment()+"%");
		}
		//执行查询
		List<CustomLabel> list = customLabelMapper.selectByExample(example);
		//创建返回值对象
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<CustomLabel> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return DataGridResult;
	}

	@Override
	public CustomLabel get(Long id) {
		return customLabelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(CustomLabel customLabel) {
		return customLabelMapper.insertSelective(customLabel);
	}

	@Override
	public int remove(Long id) {
		return customLabelMapper.deleteByPrimaryKey(id);
	}


	@Override
	public int update(CustomLabel customLabel) {
		return customLabelMapper.updateByPrimaryKeySelective(customLabel);
	}

}
