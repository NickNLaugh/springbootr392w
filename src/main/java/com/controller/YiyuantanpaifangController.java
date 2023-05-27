package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YiyuantanpaifangEntity;
import com.entity.view.YiyuantanpaifangView;

import com.service.YiyuantanpaifangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 医院碳排放
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-23 20:16:44
 */
@RestController
@RequestMapping("/yiyuantanpaifang")
public class YiyuantanpaifangController {
    @Autowired
    private YiyuantanpaifangService yiyuantanpaifangService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YiyuantanpaifangEntity yiyuantanpaifang,
		HttpServletRequest request){
        EntityWrapper<YiyuantanpaifangEntity> ew = new EntityWrapper<YiyuantanpaifangEntity>();
		PageUtils page = yiyuantanpaifangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiyuantanpaifang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YiyuantanpaifangEntity yiyuantanpaifang, 
		HttpServletRequest request){
        EntityWrapper<YiyuantanpaifangEntity> ew = new EntityWrapper<YiyuantanpaifangEntity>();
		PageUtils page = yiyuantanpaifangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiyuantanpaifang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YiyuantanpaifangEntity yiyuantanpaifang){
       	EntityWrapper<YiyuantanpaifangEntity> ew = new EntityWrapper<YiyuantanpaifangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yiyuantanpaifang, "yiyuantanpaifang")); 
        return R.ok().put("data", yiyuantanpaifangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YiyuantanpaifangEntity yiyuantanpaifang){
        EntityWrapper< YiyuantanpaifangEntity> ew = new EntityWrapper< YiyuantanpaifangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yiyuantanpaifang, "yiyuantanpaifang")); 
		YiyuantanpaifangView yiyuantanpaifangView =  yiyuantanpaifangService.selectView(ew);
		return R.ok("查询医院碳排放成功").put("data", yiyuantanpaifangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YiyuantanpaifangEntity yiyuantanpaifang = yiyuantanpaifangService.selectById(id);
        return R.ok().put("data", yiyuantanpaifang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YiyuantanpaifangEntity yiyuantanpaifang = yiyuantanpaifangService.selectById(id);
        return R.ok().put("data", yiyuantanpaifang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YiyuantanpaifangEntity yiyuantanpaifang, HttpServletRequest request){
    	yiyuantanpaifang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiyuantanpaifang);
        yiyuantanpaifangService.insert(yiyuantanpaifang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YiyuantanpaifangEntity yiyuantanpaifang, HttpServletRequest request){
    	yiyuantanpaifang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiyuantanpaifang);
        yiyuantanpaifangService.insert(yiyuantanpaifang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YiyuantanpaifangEntity yiyuantanpaifang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yiyuantanpaifang);
        yiyuantanpaifangService.updateById(yiyuantanpaifang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yiyuantanpaifangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YiyuantanpaifangEntity> wrapper = new EntityWrapper<YiyuantanpaifangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yiyuantanpaifangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
