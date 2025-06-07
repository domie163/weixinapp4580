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

import com.entity.ZhanjixinxiEntity;
import com.entity.view.ZhanjixinxiView;

import com.service.ZhanjixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 战绩信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-07 07:53:49
 */
@RestController
@RequestMapping("/zhanjixinxi")
public class ZhanjixinxiController {
    @Autowired
    private ZhanjixinxiService zhanjixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhanjixinxiEntity zhanjixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("wanjia")) {
			zhanjixinxi.setWanjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhanjixinxiEntity> ew = new EntityWrapper<ZhanjixinxiEntity>();

		PageUtils page = zhanjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhanjixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhanjixinxiEntity zhanjixinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhanjixinxiEntity> ew = new EntityWrapper<ZhanjixinxiEntity>();

		PageUtils page = zhanjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhanjixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhanjixinxiEntity zhanjixinxi){
       	EntityWrapper<ZhanjixinxiEntity> ew = new EntityWrapper<ZhanjixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhanjixinxi, "zhanjixinxi")); 
        return R.ok().put("data", zhanjixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhanjixinxiEntity zhanjixinxi){
        EntityWrapper< ZhanjixinxiEntity> ew = new EntityWrapper< ZhanjixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhanjixinxi, "zhanjixinxi")); 
		ZhanjixinxiView zhanjixinxiView =  zhanjixinxiService.selectView(ew);
		return R.ok("查询战绩信息成功").put("data", zhanjixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhanjixinxiEntity zhanjixinxi = zhanjixinxiService.selectById(id);
        return R.ok().put("data", zhanjixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhanjixinxiEntity zhanjixinxi = zhanjixinxiService.selectById(id);
        return R.ok().put("data", zhanjixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhanjixinxiEntity zhanjixinxi, HttpServletRequest request){
    	zhanjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhanjixinxi);
        zhanjixinxiService.insert(zhanjixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhanjixinxiEntity zhanjixinxi, HttpServletRequest request){
    	zhanjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhanjixinxi);
        zhanjixinxiService.insert(zhanjixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhanjixinxiEntity zhanjixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhanjixinxi);
        zhanjixinxiService.updateById(zhanjixinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhanjixinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhanjixinxiEntity> wrapper = new EntityWrapper<ZhanjixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("wanjia")) {
			wrapper.eq("wanjiazhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhanjixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
