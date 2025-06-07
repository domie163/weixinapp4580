package com.entity.view;

import com.entity.DaojuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 道具种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@TableName("daojuzhonglei")
public class DaojuzhongleiView  extends DaojuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaojuzhongleiView(){
	}
 
 	public DaojuzhongleiView(DaojuzhongleiEntity daojuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, daojuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
