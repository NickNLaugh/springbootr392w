package com.entity.vo;

import com.entity.YihurenyuantanpaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医护人员碳排放
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public class YihurenyuantanpaifangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食用排放
	 */
	
	private Float shiyongpaifang;
		
	/**
	 * 用电排放
	 */
	
	private Float yongdianpaifang;
		
	/**
	 * 用水排放
	 */
	
	private Float yongshuipaifang;
		
	/**
	 * 医疗器械碳排放
	 */
	
	private Float yiliaoqixietanpaifang;
		
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
	 * 设置：食用排放
	 */
	 
	public void setShiyongpaifang(Float shiyongpaifang) {
		this.shiyongpaifang = shiyongpaifang;
	}
	
	/**
	 * 获取：食用排放
	 */
	public Float getShiyongpaifang() {
		return shiyongpaifang;
	}
				
	
	/**
	 * 设置：用电排放
	 */
	 
	public void setYongdianpaifang(Float yongdianpaifang) {
		this.yongdianpaifang = yongdianpaifang;
	}
	
	/**
	 * 获取：用电排放
	 */
	public Float getYongdianpaifang() {
		return yongdianpaifang;
	}
				
	
	/**
	 * 设置：用水排放
	 */
	 
	public void setYongshuipaifang(Float yongshuipaifang) {
		this.yongshuipaifang = yongshuipaifang;
	}
	
	/**
	 * 获取：用水排放
	 */
	public Float getYongshuipaifang() {
		return yongshuipaifang;
	}
				
	
	/**
	 * 设置：医疗器械碳排放
	 */
	 
	public void setYiliaoqixietanpaifang(Float yiliaoqixietanpaifang) {
		this.yiliaoqixietanpaifang = yiliaoqixietanpaifang;
	}
	
	/**
	 * 获取：医疗器械碳排放
	 */
	public Float getYiliaoqixietanpaifang() {
		return yiliaoqixietanpaifang;
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
