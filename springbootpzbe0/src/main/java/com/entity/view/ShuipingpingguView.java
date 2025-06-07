package com.entity.view;

import com.entity.ShuipingpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水平评估
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@TableName("shuipingpinggu")
public class ShuipingpingguView  extends ShuipingpingguEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuipingpingguView(){
	}
 
 	public ShuipingpingguView(ShuipingpingguEntity shuipingpingguEntity){
 	try {
			BeanUtils.copyProperties(this, shuipingpingguEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
