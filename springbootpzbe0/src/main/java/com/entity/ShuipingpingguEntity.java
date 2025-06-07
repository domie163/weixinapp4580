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
 * 水平评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@TableName("shuipingpinggu")
public class ShuipingpingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuipingpingguEntity() {
		
	}
	
	public ShuipingpingguEntity(T t) {
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
	 * 玩家账号
	 */
					
	private String wanjiazhanghao;
	
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
