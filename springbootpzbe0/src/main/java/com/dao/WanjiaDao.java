package com.dao;

import com.entity.WanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanjiaVO;
import com.entity.view.WanjiaView;


/**
 * 玩家
 * 
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface WanjiaDao extends BaseMapper<WanjiaEntity> {
	
	List<WanjiaVO> selectListVO(@Param("ew") Wrapper<WanjiaEntity> wrapper);
	
	WanjiaVO selectVO(@Param("ew") Wrapper<WanjiaEntity> wrapper);
	
	List<WanjiaView> selectListView(@Param("ew") Wrapper<WanjiaEntity> wrapper);

	List<WanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<WanjiaEntity> wrapper);
	
	WanjiaView selectView(@Param("ew") Wrapper<WanjiaEntity> wrapper);
	

}
