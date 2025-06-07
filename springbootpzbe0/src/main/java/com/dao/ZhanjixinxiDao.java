package com.dao;

import com.entity.ZhanjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanjixinxiVO;
import com.entity.view.ZhanjixinxiView;


/**
 * 战绩信息
 * 
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface ZhanjixinxiDao extends BaseMapper<ZhanjixinxiEntity> {
	
	List<ZhanjixinxiVO> selectListVO(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
	
	ZhanjixinxiVO selectVO(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
	
	List<ZhanjixinxiView> selectListView(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);

	List<ZhanjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
	
	ZhanjixinxiView selectView(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
	

}
