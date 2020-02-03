package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Contract;

/**
 * 	管理员合同管理
 * @author 子江
 *
 */
public interface AdminContractService {
	/**
	 * 	获得所有的合同信息
	 * @return
	 */
	public List<Contract> getAllContract();
	/**
	 * 	添加一个合同信息
	 * @param contract
	 * @throws Exception 
	 */
	public String addOneContract(Contract contract) throws Exception;
	/**
	 * 	根据合同编号得到合同信息
	 * @param cid
	 * @return
	 */
	public Contract getContractById(Integer cId);
	/**
	 * 	根据合同编号删除合同信息
	 * @param cid
	 */
	public void deleteContractById(Integer cId);
}
