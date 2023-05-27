package com.entity.model;

import com.entity.YiyuantanpaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院碳排放
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public class YiyuantanpaifangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院图片
	 */
	
	private String yiyuantupian;
		
	/**
	 * 医院地址
	 */
	
	private String yiyuandizhi;
		
	/**
	 * 患者碳排放
	 */
	
	private Float huanzhetanpaifang;
		
	/**
	 * 医护人员碳排放
	 */
	
	private Float yihurenyuantanpaifang;
		
	/**
	 * 医护车辆碳排放
	 */
	
	private Float yihucheliangtanpaifang;
		
	/**
	 * 总碳排放
	 */
	
	private Float zongtanpaifang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：医院图片
	 */
	 
	public void setYiyuantupian(String yiyuantupian) {
		this.yiyuantupian = yiyuantupian;
	}
	
	/**
	 * 获取：医院图片
	 */
	public String getYiyuantupian() {
		return yiyuantupian;
	}
				
	
	/**
	 * 设置：医院地址
	 */
	 
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
				
	
	/**
	 * 设置：患者碳排放
	 */
	 
	public void setHuanzhetanpaifang(Float huanzhetanpaifang) {
		this.huanzhetanpaifang = huanzhetanpaifang;
	}
	
	/**
	 * 获取：患者碳排放
	 */
	public Float getHuanzhetanpaifang() {
		return huanzhetanpaifang;
	}
				
	
	/**
	 * 设置：医护人员碳排放
	 */
	 
	public void setYihurenyuantanpaifang(Float yihurenyuantanpaifang) {
		this.yihurenyuantanpaifang = yihurenyuantanpaifang;
	}
	
	/**
	 * 获取：医护人员碳排放
	 */
	public Float getYihurenyuantanpaifang() {
		return yihurenyuantanpaifang;
	}
				
	
	/**
	 * 设置：医护车辆碳排放
	 */
	 
	public void setYihucheliangtanpaifang(Float yihucheliangtanpaifang) {
		this.yihucheliangtanpaifang = yihucheliangtanpaifang;
	}
	
	/**
	 * 获取：医护车辆碳排放
	 */
	public Float getYihucheliangtanpaifang() {
		return yihucheliangtanpaifang;
	}
				
	
	/**
	 * 设置：总碳排放
	 */
	 
	public void setZongtanpaifang(Float zongtanpaifang) {
		this.zongtanpaifang = zongtanpaifang;
	}
	
	/**
	 * 获取：总碳排放
	 */
	public Float getZongtanpaifang() {
		return zongtanpaifang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
