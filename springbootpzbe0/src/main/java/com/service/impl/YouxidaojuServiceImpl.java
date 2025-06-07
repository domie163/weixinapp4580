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


import com.dao.YouxidaojuDao;
import com.entity.YouxidaojuEntity;
import com.service.YouxidaojuService;
import com.entity.vo.YouxidaojuVO;
import com.entity.view.YouxidaojuView;

@Service("youxidaojuService")
public class YouxidaojuServiceImpl extends ServiceImpl<YouxidaojuDao, YouxidaojuEntity> implements YouxidaojuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxidaojuEntity> page = this.selectPage(
                new Query<YouxidaojuEntity>(params).getPage(),
                new EntityWrapper<YouxidaojuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxidaojuEntity> wrapper) {
		  Page<YouxidaojuView> page =new Query<YouxidaojuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxidaojuVO> selectListVO(Wrapper<YouxidaojuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxidaojuVO selectVO(Wrapper<YouxidaojuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxidaojuView> selectListView(Wrapper<YouxidaojuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxidaojuView selectView(Wrapper<YouxidaojuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
