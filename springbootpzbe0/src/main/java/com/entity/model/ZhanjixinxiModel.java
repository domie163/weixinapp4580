package com.entity.model;

import com.entity.ZhanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 战绩信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
public class ZhanjixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 玩家姓名
	 */
	
	private String wanjiaxingming;
		
	/**
	 * 玩家手机
	 */
	
	private String wanjiashouji;
		
	/**
	 * 场次
	 */
	
	private String changci;
		
	/**
	 * 击杀数
	 */
	
	private String jishashu;
		
	/**
	 * 死亡数
	 */
	
	private String siwangshu;
		
	/**
	 * 场均击杀
	 */
	
	private String changjunjisha;
		
	/**
	 * 场均死亡
	 */
	
	private String changjunsiwang;
		
	/**
	 * 场均助攻
	 */
	
	private String changjunzhugong;
		
	/**
	 * 分数
	 */
	
	private Integer fenshu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
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
	 * 设置：玩家手机
	 */
	 
	public void setWanjiashouji(String wanjiashouji) {
		this.wanjiashouji = wanjiashouji;
	}
	
	/**
	 * 获取：玩家手机
	 */
	public String getWanjiashouji() {
		return wanjiashouji;
	}
				
	
	/**
	 * 设置：场次
	 */
	 
	public void setChangci(String changci) {
		this.changci = changci;
	}
	
	/**
	 * 获取：场次
	 */
	public String getChangci() {
		return changci;
	}
				
	
	/**
	 * 设置：击杀数
	 */
	 
	public void setJishashu(String jishashu) {
		this.jishashu = jishashu;
	}
	
	/**
	 * 获取：击杀数
	 */
	public String getJishashu() {
		return jishashu;
	}
				
	
	/**
	 * 设置：死亡数
	 */
	 
	public void setSiwangshu(String siwangshu) {
		this.siwangshu = siwangshu;
	}
	
	/**
	 * 获取：死亡数
	 */
	public String getSiwangshu() {
		return siwangshu;
	}
				
	
	/**
	 * 设置：场均击杀
	 */
	 
	public void setChangjunjisha(String changjunjisha) {
		this.changjunjisha = changjunjisha;
	}
	
	/**
	 * 获取：场均击杀
	 */
	public String getChangjunjisha() {
		return changjunjisha;
	}
				
	
	/**
	 * 设置：场均死亡
	 */
	 
	public void setChangjunsiwang(String changjunsiwang) {
		this.changjunsiwang = changjunsiwang;
	}
	
	/**
	 * 获取：场均死亡
	 */
	public String getChangjunsiwang() {
		return changjunsiwang;
	}
				
	
	/**
	 * 设置：场均助攻
	 */
	 
	public void setChangjunzhugong(String changjunzhugong) {
		this.changjunzhugong = changjunzhugong;
	}
	
	/**
	 * 获取：场均助攻
	 */
	public String getChangjunzhugong() {
		return changjunzhugong;
	}
				
	
	/**
	 * 设置：分数
	 */
	 
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
