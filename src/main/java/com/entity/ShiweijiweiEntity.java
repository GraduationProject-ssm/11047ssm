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
 * 市卫计委
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("shiweijiwei")
public class ShiweijiweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiweijiweiEntity() {
		
	}
	
	public ShiweijiweiEntity(T t) {
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
	 * 市卫账号
	 */
					
	private String shiweizhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 昵称
	 */
					
	private String nicheng;
	
	/**
	 * 所属城市
	 */
					
	private String suoshuchengshi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	
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
	 * 设置：市卫账号
	 */
	public void setShiweizhanghao(String shiweizhanghao) {
		this.shiweizhanghao = shiweizhanghao;
	}
	/**
	 * 获取：市卫账号
	 */
	public String getShiweizhanghao() {
		return shiweizhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：昵称
	 */
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	/**
	 * 获取：昵称
	 */
	public String getNicheng() {
		return nicheng;
	}
	/**
	 * 设置：所属城市
	 */
	public void setSuoshuchengshi(String suoshuchengshi) {
		this.suoshuchengshi = suoshuchengshi;
	}
	/**
	 * 获取：所属城市
	 */
	public String getSuoshuchengshi() {
		return suoshuchengshi;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}

}