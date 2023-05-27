package com.entity.vo;

import com.entity.YihucheliangtanpaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医护车辆碳排放
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public class YihucheliangtanpaifangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽油排放
	 */
	
	private Float qiyoupaifang;
		
	/**
	 * 尾气排放
	 */
	
	private Float weiqipaifang;
		
	/**
	 * 总排放
	 */
	
	private Float zongpaifang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：汽油排放
	 */
	 
	public void setQiyoupaifang(Float qiyoupaifang) {
		this.qiyoupaifang = qiyoupaifang;
	}
	
	/**
	 * 获取：汽油排放
	 */
	public Float getQiyoupaifang() {
		return qiyoupaifang;
	}
				
	
	/**
	 * 设置：尾气排放
	 */
	 
	public void setWeiqipaifang(Float weiqipaifang) {
		this.weiqipaifang = weiqipaifang;
	}
	
	/**
	 * 获取：尾气排放
	 */
	public Float getWeiqipaifang() {
		return weiqipaifang;
	}
				
	
	/**
	 * 设置：总排放
	 */
	 
	public void setZongpaifang(Float zongpaifang) {
		this.zongpaifang = zongpaifang;
	}
	
	/**
	 * 获取：总排放
	 */
	public Float getZongpaifang() {
		return zongpaifang;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
