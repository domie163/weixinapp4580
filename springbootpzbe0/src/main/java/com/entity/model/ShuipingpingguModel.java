package com.entity.model;

import com.entity.ShuipingpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 水平评估
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public class ShuipingpingguModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 玩家姓名
	 */
	
	private String wanjiaxingming;
		
	/**
	 * 评估时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pinggushijian;
		
	/**
	 * 评估图片
	 */
	
	private String pinggutupian;
		
	/**
	 * 综合战力
	 */
	
	private Integer zonghezhanli;
		
	/**
	 * 评估内容
	 */
	
	private String pingguneirong;
				
	
	/**
	 * 设置：玩家姓名
	 */
	 
	public void setWanjiaxingming(String wanjiaxingming) {
		this.wanjiaxingming = wanjiaxingming;
	}
	
	/**
	 * 获取：玩家姓名
	 */
	public String getWanjiaxingming() {
		return wanjiaxingming;
	}
				
	
	/**
	 * 设置：评估时间
	 */
	 
	public void setPinggushijian(Date pinggushijian) {
		this.pinggushijian = pinggushijian;
	}
	
	/**
	 * 获取：评估时间
	 */
	public Date getPinggushijian() {
		return pinggushijian;
	}
				
	
	/**
	 * 设置：评估图片
	 */
	 
	public void setPinggutupian(String pinggutupian) {
		this.pinggutupian = pinggutupian;
	}
	
	/**
	 * 获取：评估图片
	 */
	public String getPinggutupian() {
		return pinggutupian;
	}
				
	
	/**
	 * 设置：综合战力
	 */
	 
	public void setZonghezhanli(Integer zonghezhanli) {
		this.zonghezhanli = zonghezhanli;
	}
	
	/**
	 * 获取：综合战力
	 */
	public Integer getZonghezhanli() {
		return zonghezhanli;
	}
				
	
	/**
	 * 设置：评估内容
	 */
	 
	public void setPingguneirong(String pingguneirong) {
		this.pingguneirong = pingguneirong;
	}
	
	/**
	 * 获取：评估内容
	 */
	public String getPingguneirong() {
		return pingguneirong;
	}
			
}
