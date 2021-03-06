package com.pay.controller.fo.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * 付款索引页控制器
 * @author limeng
 *
 */
public class PayIndexController extends MultiActionController{

	private String indexView;
	
	public void setIndexView(String indexView){
		this.indexView = indexView;
	}

	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception{
		return new ModelAndView(indexView);
	}
}
