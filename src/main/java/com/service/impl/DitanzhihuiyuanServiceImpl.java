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


import com.dao.DitanzhihuiyuanDao;
import com.entity.DitanzhihuiyuanEntity;
import com.service.DitanzhihuiyuanService;
import com.entity.vo.DitanzhihuiyuanVO;
import com.entity.view.DitanzhihuiyuanView;

@Service("ditanzhihuiyuanService")
public class DitanzhihuiyuanServiceImpl extends ServiceImpl<DitanzhihuiyuanDao, DitanzhihuiyuanEntity> implements DitanzhihuiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DitanzhihuiyuanEntity> page = this.selectPage(
                new Query<DitanzhihuiyuanEntity>(params).getPage(),
                new EntityWrapper<DitanzhihuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DitanzhihuiyuanEntity> wrapper) {
		  Page<DitanzhihuiyuanView> page =new Query<DitanzhihuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DitanzhihuiyuanVO> selectListVO(Wrapper<DitanzhihuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DitanzhihuiyuanVO selectVO(Wrapper<DitanzhihuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DitanzhihuiyuanView> selectListView(Wrapper<DitanzhihuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DitanzhihuiyuanView selectView(Wrapper<DitanzhihuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
