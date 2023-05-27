package com.dao;

import com.entity.DiscussditanzhihuiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussditanzhihuiyuanVO;
import com.entity.view.DiscussditanzhihuiyuanView;


/**
 * 低碳智慧园评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-23 20:16:45
 */
public interface DiscussditanzhihuiyuanDao extends BaseMapper<DiscussditanzhihuiyuanEntity> {
	
	List<DiscussditanzhihuiyuanVO> selectListVO(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
	
	DiscussditanzhihuiyuanVO selectVO(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
	
	List<DiscussditanzhihuiyuanView> selectListView(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);

	List<DiscussditanzhihuiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
	
	DiscussditanzhihuiyuanView selectView(@Param("ew") Wrapper<DiscussditanzhihuiyuanEntity> wrapper);
	

}
