package com.pay.poss.systemmanager.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.poss.systemmanager.dao.IOrgDao;
import com.pay.poss.systemmanager.model.Org;
import com.pay.poss.systemmanager.service.IOrgService;

/**
 * 
 * @author 戴德荣
 * @date 2011-1-6 
 *
 */
public class OrgServiceImpl implements IOrgService {


	private Log logger = LogFactory.getLog(getClass());

	private IOrgDao orgDAO;

	// 注入DAO

	public void setOrgDAO(IOrgDao orgDAO) {
		this.orgDAO = orgDAO;
	}

	@Override
	public List<Org> findAllOrg() {
		return orgDAO.findAll();
	}

	@Override
	public Org findByCode(String orgCode) {
		return orgDAO.findByOrgCode(orgCode);
	}



}
