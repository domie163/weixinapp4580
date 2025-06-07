package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanjixinxiView;


/**
 * 战绩信息
 *
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface ZhanjixinxiService extends IService<ZhanjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanjixinxiVO> selectListVO(Wrapper<ZhanjixinxiEntity> wrapper);
   	
   	ZhanjixinxiVO selectVO(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
   	
   	List<ZhanjixinxiView> selectListView(Wrapper<ZhanjixinxiEntity> wrapper);
   	
   	ZhanjixinxiView selectView(@Param("ew") Wrapper<ZhanjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanjixinxiEntity> wrapper);
   	

}

