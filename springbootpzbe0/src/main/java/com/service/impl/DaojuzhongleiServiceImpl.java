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


import com.dao.DaojuzhongleiDao;
import com.entity.DaojuzhongleiEntity;
import com.service.DaojuzhongleiService;
import com.entity.vo.DaojuzhongleiVO;
import com.entity.view.DaojuzhongleiView;

@Service("daojuzhongleiService")
public class DaojuzhongleiServiceImpl extends ServiceImpl<DaojuzhongleiDao, DaojuzhongleiEntity> implements DaojuzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaojuzhongleiEntity> page = this.selectPage(
                new Query<DaojuzhongleiEntity>(params).getPage(),
                new EntityWrapper<DaojuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaojuzhongleiEntity> wrapper) {
		  Page<DaojuzhongleiView> page =new Query<DaojuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaojuzhongleiVO> selectListVO(Wrapper<DaojuzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaojuzhongleiVO selectVO(Wrapper<DaojuzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaojuzhongleiView> selectListView(Wrapper<DaojuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaojuzhongleiView selectView(Wrapper<DaojuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
