package com.dao;

import com.entity.YouxidaojuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxidaojuVO;
import com.entity.view.YouxidaojuView;


/**
 * 游戏道具
 * 
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface YouxidaojuDao extends BaseMapper<YouxidaojuEntity> {
	
	List<YouxidaojuVO> selectListVO(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
	
	YouxidaojuVO selectVO(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
	
	List<YouxidaojuView> selectListView(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);

	List<YouxidaojuView> selectListView(Pagination page,@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
	
	YouxidaojuView selectView(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
	

}
