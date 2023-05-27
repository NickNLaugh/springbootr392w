package com.entity.view;

import com.entity.YihucheliangtanpaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医护车辆碳排放
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
@TableName("yihucheliangtanpaifang")
public class YihucheliangtanpaifangView  extends YihucheliangtanpaifangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YihucheliangtanpaifangView(){
	}
 
 	public YihucheliangtanpaifangView(YihucheliangtanpaifangEntity yihucheliangtanpaifangEntity){
 	try {
			BeanUtils.copyProperties(this, yihucheliangtanpaifangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
