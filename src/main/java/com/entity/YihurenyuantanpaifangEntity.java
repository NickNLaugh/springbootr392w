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
 * 医护人员碳排放
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
@TableName("yihurenyuantanpaifang")
public class YihurenyuantanpaifangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YihurenyuantanpaifangEntity() {
		
	}
	
	public YihurenyuantanpaifangEntity(T t) {
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
	 * 计算名称
	 */
					
	private String jisuanmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：计算名称
	 */
	public void setJisuanmingcheng(String jisuanmingcheng) {
		this.jisuanmingcheng = jisuanmingcheng;
	}
	/**
	 * 获取：计算名称
	 */
	public String getJisuanmingcheng() {
		return jisuanmingcheng;
	}
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
