package com.entity.view;

import com.entity.HuanzhetanpaifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 患者碳排放
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
@TableName("huanzhetanpaifang")
public class HuanzhetanpaifangView  extends HuanzhetanpaifangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanzhetanpaifangView(){
	}
 
 	public HuanzhetanpaifangView(HuanzhetanpaifangEntity huanzhetanpaifangEntity){
 	try {
			BeanUtils.copyProperties(this, huanzhetanpaifangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
