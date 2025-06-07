package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuipingpingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuipingpingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuipingpingguView;


/**
 * 水平评估
 *
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public interface ShuipingpingguService extends IService<ShuipingpingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuipingpingguVO> selectListVO(Wrapper<ShuipingpingguEntity> wrapper);
   	
   	ShuipingpingguVO selectVO(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
   	
   	List<ShuipingpingguView> selectListView(Wrapper<ShuipingpingguEntity> wrapper);
   	
   	ShuipingpingguView selectView(@Param("ew") Wrapper<ShuipingpingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuipingpingguEntity> wrapper);
   	

}

