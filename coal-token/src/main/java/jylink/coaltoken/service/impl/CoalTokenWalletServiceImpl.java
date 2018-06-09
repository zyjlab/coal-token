package jylink.coaltoken.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jylink.coaltoken.data.CoalTokenWalletDao;
import jylink.coaltoken.domain.CoalTokenWallet;
import jylink.coaltoken.service.CoalTokenWalletService;

@Service
public class CoalTokenWalletServiceImpl implements CoalTokenWalletService{

	 @Autowired 
	 CoalTokenWalletDao coalTokenWalletDao;

	
	public CoalTokenWallet get(String walletAddress) {
		return coalTokenWalletDao.selectByPrimaryKey(walletAddress);
	}

	public List<CoalTokenWallet> listTokenByID(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public int saveCoalTokenWallet(CoalTokenWallet wallet) {
		// TODO Auto-generated method stub
		return coalTokenWalletDao.insert(wallet);
		
	}

	public void removeCoalTokenWallet(String walletAddress) {
		// TODO Auto-generated method stub
		
	}

	public void updateCoalTokenWallet(CoalTokenWallet wallet) {
		// TODO Auto-generated method stub
		
	}

	public List<CoalTokenWallet> listAll() {
		// TODO Auto-generated method stub
		return coalTokenWalletDao.selectAll();
	}
	
	//public List<CoalTokenWallet> listAll() {
		//return userDao.listAll();
	//}

}
