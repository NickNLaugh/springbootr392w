package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiyuantanpaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiyuantanpaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiyuantanpaifangView;


/**
 * 医院碳排放评论表
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:45
 */
public interface DiscussyiyuantanpaifangService extends IService<DiscussyiyuantanpaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiyuantanpaifangVO> selectListVO(Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
   	
   	DiscussyiyuantanpaifangVO selectVO(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
   	
   	List<DiscussyiyuantanpaifangView> selectListView(Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
   	
   	DiscussyiyuantanpaifangView selectView(@Param("ew") Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiyuantanpaifangEntity> wrapper);
   	

}

