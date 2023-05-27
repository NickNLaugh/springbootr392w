package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanzhetanpaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanzhetanpaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanzhetanpaifangView;


/**
 * 患者碳排放
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface HuanzhetanpaifangService extends IService<HuanzhetanpaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanzhetanpaifangVO> selectListVO(Wrapper<HuanzhetanpaifangEntity> wrapper);
   	
   	HuanzhetanpaifangVO selectVO(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
   	
   	List<HuanzhetanpaifangView> selectListView(Wrapper<HuanzhetanpaifangEntity> wrapper);
   	
   	HuanzhetanpaifangView selectView(@Param("ew") Wrapper<HuanzhetanpaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanzhetanpaifangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuanzhetanpaifangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuanzhetanpaifangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuanzhetanpaifangEntity> wrapper);
}

