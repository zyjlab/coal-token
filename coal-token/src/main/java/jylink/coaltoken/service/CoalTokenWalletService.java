package jylink.coaltoken.service;

import java.util.List;

import jylink.coaltoken.domain.CoalTokenWallet;

public interface CoalTokenWalletService {
	
	
	
	/**
	 * 获取指定ID的钱包信息
	 * @param walletAddress
	 * @return
	 */
	CoalTokenWallet get(String walletAddress);
	/**
	 * 获取所有属于userID的userID
	 * @param userID
	 * @return
	 */
	
	List<CoalTokenWallet> listTokenByID(String userID);
	
	/**
	 * 保存一条新的记录
	 * @param wallet
	 */
	int saveCoalTokenWallet(CoalTokenWallet wallet);
	/**
	 * 删除一条指定钱包地址的记录
	 * @param walletAddress
	 */
	void removeCoalTokenWallet(String walletAddress);
	
	/**
	 * 更新一条CoalTokenWallet
	 * @param wallet
	 */
	void updateCoalTokenWallet(CoalTokenWallet wallet);
	
    List<CoalTokenWallet> listAll();
	

}
