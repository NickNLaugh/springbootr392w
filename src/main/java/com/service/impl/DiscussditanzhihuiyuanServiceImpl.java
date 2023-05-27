package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussditanzhihuiyuanDao;
import com.entity.DiscussditanzhihuiyuanEntity;
import com.service.DiscussditanzhihuiyuanService;
import com.entity.vo.DiscussditanzhihuiyuanVO;
import com.entity.view.DiscussditanzhihuiyuanView;

@Service("discussditanzhihuiyuanService")
public class DiscussditanzhihuiyuanServiceImpl extends ServiceImpl<DiscussditanzhihuiyuanDao, DiscussditanzhihuiyuanEntity> implements DiscussditanzhihuiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussditanzhihuiyuanEntity> page = this.selectPage(
                new Query<DiscussditanzhihuiyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussditanzhihuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussditanzhihuiyuanEntity> wrapper) {
		  Page<DiscussditanzhihuiyuanView> page =new Query<DiscussditanzhihuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussditanzhihuiyuanVO> selectListVO(Wrapper<DiscussditanzhihuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussditanzhihuiyuanVO selectVO(Wrapper<DiscussditanzhihuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussditanzhihuiyuanView> selectListView(Wrapper<DiscussditanzhihuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussditanzhihuiyuanView selectView(Wrapper<DiscussditanzhihuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
