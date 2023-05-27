package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuantanpaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuantanpaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuantanpaifangView;


/**
 * 医院碳排放
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface YiyuantanpaifangService extends IService<YiyuantanpaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuantanpaifangVO> selectListVO(Wrapper<YiyuantanpaifangEntity> wrapper);
   	
   	YiyuantanpaifangVO selectVO(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
   	
   	List<YiyuantanpaifangView> selectListView(Wrapper<YiyuantanpaifangEntity> wrapper);
   	
   	YiyuantanpaifangView selectView(@Param("ew") Wrapper<YiyuantanpaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuantanpaifangEntity> wrapper);
   	

}

