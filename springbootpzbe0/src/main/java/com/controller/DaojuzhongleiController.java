package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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

import com.entity.DaojuzhongleiEntity;
import com.entity.view.DaojuzhongleiView;

import com.service.DaojuzhongleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 道具种类
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@RestController
@RequestMapping("/daojuzhonglei")
public class DaojuzhongleiController {
    @Autowired
    private DaojuzhongleiService daojuzhongleiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaojuzhongleiEntity daojuzhonglei,
		HttpServletRequest request){
        EntityWrapper<DaojuzhongleiEntity> ew = new EntityWrapper<DaojuzhongleiEntity>();

		PageUtils page = daojuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuzhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaojuzhongleiEntity daojuzhonglei, 
		HttpServletRequest request){
        EntityWrapper<DaojuzhongleiEntity> ew = new EntityWrapper<DaojuzhongleiEntity>();

		PageUtils page = daojuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuzhonglei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaojuzhongleiEntity daojuzhonglei){
       	EntityWrapper<DaojuzhongleiEntity> ew = new EntityWrapper<DaojuzhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daojuzhonglei, "daojuzhonglei")); 
        return R.ok().put("data", daojuzhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaojuzhongleiEntity daojuzhonglei){
        EntityWrapper< DaojuzhongleiEntity> ew = new EntityWrapper< DaojuzhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daojuzhonglei, "daojuzhonglei")); 
		DaojuzhongleiView daojuzhongleiView =  daojuzhongleiService.selectView(ew);
		return R.ok("查询道具种类成功").put("data", daojuzhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaojuzhongleiEntity daojuzhonglei = daojuzhongleiService.selectById(id);
        return R.ok().put("data", daojuzhonglei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaojuzhongleiEntity daojuzhonglei = daojuzhongleiService.selectById(id);
        return R.ok().put("data", daojuzhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaojuzhongleiEntity daojuzhonglei, HttpServletRequest request){
    	daojuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuzhonglei);
        daojuzhongleiService.insert(daojuzhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaojuzhongleiEntity daojuzhonglei, HttpServletRequest request){
    	daojuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuzhonglei);
        daojuzhongleiService.insert(daojuzhonglei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaojuzhongleiEntity daojuzhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daojuzhonglei);
        daojuzhongleiService.updateById(daojuzhonglei);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daojuzhongleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DaojuzhongleiEntity> wrapper = new EntityWrapper<DaojuzhongleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = daojuzhongleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
