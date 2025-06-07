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


import com.dao.ZhanjixinxiDao;
import com.entity.ZhanjixinxiEntity;
import com.service.ZhanjixinxiService;
import com.entity.vo.ZhanjixinxiVO;
import com.entity.view.ZhanjixinxiView;

@Service("zhanjixinxiService")
public class ZhanjixinxiServiceImpl extends ServiceImpl<ZhanjixinxiDao, ZhanjixinxiEntity> implements ZhanjixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanjixinxiEntity> page = this.selectPage(
                new Query<ZhanjixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhanjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanjixinxiEntity> wrapper) {
		  Page<ZhanjixinxiView> page =new Query<ZhanjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanjixinxiVO> selectListVO(Wrapper<ZhanjixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanjixinxiVO selectVO(Wrapper<ZhanjixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanjixinxiView> selectListView(Wrapper<ZhanjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanjixinxiView selectView(Wrapper<ZhanjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
