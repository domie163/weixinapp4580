package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanjiaView;


/**
 * 玩家
 *
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface WanjiaService extends IService<WanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjiaVO> selectListVO(Wrapper<WanjiaEntity> wrapper);
   	
   	WanjiaVO selectVO(@Param("ew") Wrapper<WanjiaEntity> wrapper);
   	
   	List<WanjiaView> selectListView(Wrapper<WanjiaEntity> wrapper);
   	
   	WanjiaView selectView(@Param("ew") Wrapper<WanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjiaEntity> wrapper);
   	

}

