package com.entity.vo;

import com.entity.YouxidaojuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 游戏道具
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public class YouxidaojuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 道具图片
	 */
	
	private String daojutupian;
		
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 道具种类
	 */
	
	private String daojuzhonglei;
		
	/**
	 * 道具品质
	 */
	
	private String daojupinzhi;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
		
	/**
	 * 玩家账号
	 */
	
	private String wanjiazhanghao;
		
	/**
	 * 玩家姓名
	 */
	
	private String wanjiaxingming;
		
	/**
	 * 道具数量
	 */
	
	private Integer daojushuliang;
				
	
	/**
	 * 设置：道具图片
	 */
	 
	public void setDaojutupian(String daojutupian) {
		this.daojutupian = daojutupian;
	}
	
	/**
	 * 获取：道具图片
	 */
	public String getDaojutupian() {
		return daojutupian;
	}
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：道具种类
	 */
	 
	public void setDaojuzhonglei(String daojuzhonglei) {
		this.daojuzhonglei = daojuzhonglei;
	}
	
	/**
	 * 获取：道具种类
	 */
	public String getDaojuzhonglei() {
		return daojuzhonglei;
	}
				
	
	/**
	 * 设置：道具品质
	 */
	 
	public void setDaojupinzhi(String daojupinzhi) {
		this.daojupinzhi = daojupinzhi;
	}
	
	/**
	 * 获取：道具品质
	 */
	public String getDaojupinzhi() {
		return daojupinzhi;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
				
	
	/**
	 * 设置：玩家账号
	 */
	 
	public void setWanjiazhanghao(String wanjiazhanghao) {
		this.wanjiazhanghao = wanjiazhanghao;
	}
	
	/**
	 * 获取：玩家账号
	 */
	public String getWanjiazhanghao() {
		return wanjiazhanghao;
	}
				
	
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
	 * 设置：道具数量
	 */
	 
	public void setDaojushuliang(Integer daojushuliang) {
		this.daojushuliang = daojushuliang;
	}
	
	/**
	 * 获取：道具数量
	 */
	public Integer getDaojushuliang() {
		return daojushuliang;
	}
			
}
