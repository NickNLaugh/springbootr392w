package com.entity.view;

import com.entity.DiscussditanzhihuiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 低碳智慧园评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 20:16:45
 */
@TableName("discussditanzhihuiyuan")
public class DiscussditanzhihuiyuanView  extends DiscussditanzhihuiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussditanzhihuiyuanView(){
	}
 
 	public DiscussditanzhihuiyuanView(DiscussditanzhihuiyuanEntity discussditanzhihuiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussditanzhihuiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
