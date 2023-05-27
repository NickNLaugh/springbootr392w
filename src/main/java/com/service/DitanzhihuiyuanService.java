package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DitanzhihuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DitanzhihuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DitanzhihuiyuanView;


/**
 * 低碳智慧园
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
public interface DitanzhihuiyuanService extends IService<DitanzhihuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DitanzhihuiyuanVO> selectListVO(Wrapper<DitanzhihuiyuanEntity> wrapper);
   	
   	DitanzhihuiyuanVO selectVO(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
   	
   	List<DitanzhihuiyuanView> selectListView(Wrapper<DitanzhihuiyuanEntity> wrapper);
   	
   	DitanzhihuiyuanView selectView(@Param("ew") Wrapper<DitanzhihuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DitanzhihuiyuanEntity> wrapper);
   	

}

