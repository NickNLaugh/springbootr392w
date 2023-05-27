package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussditanzhihuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussditanzhihuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussditanzhihuiyuanView;


/**
 * 低碳智慧园评论表
 *
 * @author 
 * @email 
 * @date 2022-07-23 20:16:45
 */
public interface DiscussditanzhihuiyuanService extends IService<DiscussditanzhihuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussditanzhihuiyuanVO> selectListVO(Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
   	
   	DiscussditanzhihuiyuanVO selectVO(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
   	
   	List<DiscussditanzhihuiyuanView> selectListView(Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
   	
   	DiscussditanzhihuiyuanView selectView(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
   	

}

