package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihucheliangtanpaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihucheliangtanpaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihucheliangtanpaifangView;


/**
 * 医护车辆碳排放
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YihucheliangtanpaifangService extends IService<YihucheliangtanpaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihucheliangtanpaifangVO> selectListVO(Wrapper<YihucheliangtanpaifangEntity> wrapper);
   	
   	YihucheliangtanpaifangVO selectVO(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
   	
   	List<YihucheliangtanpaifangView> selectListView(Wrapper<YihucheliangtanpaifangEntity> wrapper);
   	
   	YihucheliangtanpaifangView selectView(@Param("ew") Wrapper<YihucheliangtanpaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihucheliangtanpaifangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YihucheliangtanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YihucheliangtanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YihucheliangtanpaifangEntity> wrapper);
}

