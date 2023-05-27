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
 * 医护车辆碳排放
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
@TableName("yihucheliangtanpaifang")
public class YihucheliangtanpaifangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YihucheliangtanpaifangEntity() {
		
	}
	
	public YihucheliangtanpaifangEntity(T t) {
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
