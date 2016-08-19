package com.omnipotent.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhangtb
 * @date 2016年8月18日 下午6:24:36
 * @since 1.0.0
 */
@Controller
public class IndexController {
	
	private Logger Logger = LoggerFactory.getLogger(IndexController.class);
	
	/**
	 * @author zhangtb
	 * @date 2016-8-18 18:24:25
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
	public String index(HttpServletRequest request) {
		JSONObject object = new JSONObject();
		object.put("username", "admin");
		object.put("password", "123456");
		
		Logger.info("object = " + object.toString());
		
		return object.toString();
	}

}
