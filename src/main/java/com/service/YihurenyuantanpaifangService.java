package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihurenyuantanpaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihurenyuantanpaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihurenyuantanpaifangView;


/**
 * 医护人员碳排放
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YihurenyuantanpaifangService extends IService<YihurenyuantanpaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihurenyuantanpaifangVO> selectListVO(Wrapper<YihurenyuantanpaifangEntity> wrapper);
   	
   	YihurenyuantanpaifangVO selectVO(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
   	
   	List<YihurenyuantanpaifangView> selectListView(Wrapper<YihurenyuantanpaifangEntity> wrapper);
   	
   	YihurenyuantanpaifangView selectView(@Param("ew") Wrapper<YihurenyuantanpaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihurenyuantanpaifangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YihurenyuantanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YihurenyuantanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YihurenyuantanpaifangEntity> wrapper);
}

