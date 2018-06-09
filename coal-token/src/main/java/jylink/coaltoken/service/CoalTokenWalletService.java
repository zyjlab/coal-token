package jylink.coaltoken.service;

import java.util.List;

import jylink.coaltoken.domain.CoalTokenWallet;

public interface CoalTokenWalletService {
	
	
	
	/**
	 * ��ȡָ��ID��Ǯ����Ϣ
	 * @param walletAddress
	 * @return
	 */
	CoalTokenWallet get(String walletAddress);
	/**
	 * ��ȡ��������userID��userID
	 * @param userID
	 * @return
	 */
	
	List<CoalTokenWallet> listTokenByID(String userID);
	
	/**
	 * ����һ���µļ�¼
	 * @param wallet
	 */
	int saveCoalTokenWallet(CoalTokenWallet wallet);
	/**
	 * ɾ��һ��ָ��Ǯ����ַ�ļ�¼
	 * @param walletAddress
	 */
	void removeCoalTokenWallet(String walletAddress);
	
	/**
	 * ����һ��CoalTokenWallet
	 * @param wallet
	 */
	void updateCoalTokenWallet(CoalTokenWallet wallet);
	
    List<CoalTokenWallet> listAll();
	

}
