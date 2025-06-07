package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaojuzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaojuzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaojuzhongleiView;


/**
 * 道具种类
 *
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface DaojuzhongleiService extends IService<DaojuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaojuzhongleiVO> selectListVO(Wrapper<DaojuzhongleiEntity> wrapper);
   	
   	DaojuzhongleiVO selectVO(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
   	
   	List<DaojuzhongleiView> selectListView(Wrapper<DaojuzhongleiEntity> wrapper);
   	
   	DaojuzhongleiView selectView(@Param("ew") Wrapper<DaojuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaojuzhongleiEntity> wrapper);
   	

}

