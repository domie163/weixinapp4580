package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxidaojuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxidaojuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxidaojuView;


/**
 * 游戏道具
 *
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface YouxidaojuService extends IService<YouxidaojuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxidaojuVO> selectListVO(Wrapper<YouxidaojuEntity> wrapper);
   	
   	YouxidaojuVO selectVO(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
   	
   	List<YouxidaojuView> selectListView(Wrapper<YouxidaojuEntity> wrapper);
   	
   	YouxidaojuView selectView(@Param("ew") Wrapper<YouxidaojuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxidaojuEntity> wrapper);
   	

}

