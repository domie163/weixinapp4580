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


import com.dao.WanjiaDao;
import com.entity.WanjiaEntity;
import com.service.WanjiaService;
import com.entity.vo.WanjiaVO;
import com.entity.view.WanjiaView;

@Service("wanjiaService")
public class WanjiaServiceImpl extends ServiceImpl<WanjiaDao, WanjiaEntity> implements WanjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjiaEntity> page = this.selectPage(
                new Query<WanjiaEntity>(params).getPage(),
                new EntityWrapper<WanjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjiaEntity> wrapper) {
		  Page<WanjiaView> page =new Query<WanjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanjiaVO> selectListVO(Wrapper<WanjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanjiaVO selectVO(Wrapper<WanjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanjiaView> selectListView(Wrapper<WanjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjiaView selectView(Wrapper<WanjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
