package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 游戏道具
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@TableName("youxidaoju")
public class YouxidaojuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxidaojuEntity() {
		
	}
	
	public YouxidaojuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 道具名称
	 */
					
	private String daojumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：道具名称
	 */
	public void setDaojumingcheng(String daojumingcheng) {
		this.daojumingcheng = daojumingcheng;
	}
	/**
	 * 获取：道具名称
	 */
	public String getDaojumingcheng() {
		return daojumingcheng;
	}
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
