package com.dao;

import com.entity.DaojuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaojuzhongleiVO;
import com.entity.view.DaojuzhongleiView;


/**
 * 道具种类
 * 
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface DaojuzhongleiDao extends BaseMapper<DaojuzhongleiEntity> {
	
	List<DaojuzhongleiVO> selectListVO(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
	
	DaojuzhongleiVO selectVO(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
	
	List<DaojuzhongleiView> selectListView(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);

	List<DaojuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
	
	DaojuzhongleiView selectView(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
	

}
