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


import com.dao.DiscussyiyuantanpaifangDao;
import com.entity.DiscussyiyuantanpaifangEntity;
import com.service.DiscussyiyuantanpaifangService;
import com.entity.vo.DiscussyiyuantanpaifangVO;
import com.entity.view.DiscussyiyuantanpaifangView;

@Service("discussyiyuantanpaifangService")
public class DiscussyiyuantanpaifangServiceImpl extends ServiceImpl<DiscussyiyuantanpaifangDao, DiscussyiyuantanpaifangEntity> implements DiscussyiyuantanpaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiyuantanpaifangEntity> page = this.selectPage(
                new Query<DiscussyiyuantanpaifangEntity>(params).getPage(),
                new EntityWrapper<DiscussyiyuantanpaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiyuantanpaifangEntity> wrapper) {
		  Page<DiscussyiyuantanpaifangView> page =new Query<DiscussyiyuantanpaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiyuantanpaifangVO> selectListVO(Wrapper<DiscussyiyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiyuantanpaifangVO selectVO(Wrapper<DiscussyiyuantanpaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiyuantanpaifangView> selectListView(Wrapper<DiscussyiyuantanpaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiyuantanpaifangView selectView(Wrapper<DiscussyiyuantanpaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
