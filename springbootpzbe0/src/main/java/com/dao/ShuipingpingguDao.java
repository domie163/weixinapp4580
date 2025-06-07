package com.dao;

import com.entity.ShuipingpingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuipingpingguVO;
import com.entity.view.ShuipingpingguView;


/**
 * 水平评估
 * 
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface ShuipingpingguDao extends BaseMapper<ShuipingpingguEntity> {
	
	List<ShuipingpingguVO> selectListVO(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
	
	ShuipingpingguVO selectVO(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
	
	List<ShuipingpingguView> selectListView(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);

	List<ShuipingpingguView> selectListView(Pagination page,@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
	
	ShuipingpingguView selectView(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
	

}
