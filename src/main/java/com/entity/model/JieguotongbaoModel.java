package com.entity.model;

import com.entity.JieguotongbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 结果通报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public class JieguotongbaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请职称
	 */
	
	private String shenqingzhicheng;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 真实姓名
	 */
	
	private String zhenshixingming;
		
	/**
	 * 通知内容
	 */
	
	private String tongzhineirong;
		
	/**
	 * 通知日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongzhiriqi;
				
	
	/**
	 * 设置：申请职称
	 */
	 
	public void setShenqingzhicheng(String shenqingzhicheng) {
		this.shenqingzhicheng = shenqingzhicheng;
	}
	
	/**
	 * 获取：申请职称
	 */
	public String getShenqingzhicheng() {
		return shenqingzhicheng;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：真实姓名
	 */
	 
	public void setZhenshixingming(String zhenshixingming) {
		this.zhenshixingming = zhenshixingming;
	}
	
	/**
	 * 获取：真实姓名
	 */
	public String getZhenshixingming() {
		return zhenshixingming;
	}
				
	
	/**
	 * 设置：通知内容
	 */
	 
	public void setTongzhineirong(String tongzhineirong) {
		this.tongzhineirong = tongzhineirong;
	}
	
	/**
	 * 获取：通知内容
	 */
	public String getTongzhineirong() {
		return tongzhineirong;
	}
				
	
	/**
	 * 设置：通知日期
	 */
	 
	public void setTongzhiriqi(Date tongzhiriqi) {
		this.tongzhiriqi = tongzhiriqi;
	}
	
	/**
	 * 获取：通知日期
	 */
	public Date getTongzhiriqi() {
		return tongzhiriqi;
	}
			
}
