package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShuipingpingguDao;
import com.entity.ShuipingpingguEntity;
import com.service.ShuipingpingguService;
import com.entity.vo.ShuipingpingguVO;
import com.entity.view.ShuipingpingguView;

@Service("shuipingpingguService")
public class ShuipingpingguServiceImpl extends ServiceImpl<ShuipingpingguDao, ShuipingpingguEntity> implements ShuipingpingguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuipingpingguEntity> page = this.selectPage(
                new Query<ShuipingpingguEntity>(params).getPage(),
                new EntityWrapper<ShuipingpingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuipingpingguEntity> wrapper) {
		  Page<ShuipingpingguView> page =new Query<ShuipingpingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuipingpingguVO> selectListVO(Wrapper<ShuipingpingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuipingpingguVO selectVO(Wrapper<ShuipingpingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuipingpingguView> selectListView(Wrapper<ShuipingpingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuipingpingguView selectView(Wrapper<ShuipingpingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
