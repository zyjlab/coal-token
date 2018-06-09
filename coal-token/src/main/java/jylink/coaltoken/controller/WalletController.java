package jylink.coaltoken.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jylink.coaltoken.domain.CoalTokenWallet;
import jylink.coaltoken.service.CoalTokenWalletService;

@Controller
@RequestMapping("wallet")
public class WalletController {

	@Autowired
	private CoalTokenWalletService coalTokenWalletService;
	
	@RequestMapping("/testWallet")
	@ResponseBody
	CoalTokenWallet getWallet(){
		return coalTokenWalletService.get("0x13235634566345");
	}
	
	@RequestMapping("/listAll")
	@ResponseBody
	List<CoalTokenWallet> listwallets()
	{
		return coalTokenWalletService.listAll();
		
	}
	
	@RequestMapping("/InsertAll")
	@ResponseBody
	void InsertAll()
	{
		for(int i=10001;i<100100;i++)
		{
			CoalTokenWallet tokenWallet=new CoalTokenWallet();
		tokenWallet.setWalletAddress("n12143213532135532214621"+i);
		tokenWallet.setUserName("23432"+i);
		tokenWallet.setUserID("12343221"+i);
		
		tokenWallet.setCreateTime(new Date());
		coalTokenWalletService.saveCoalTokenWallet(tokenWallet);
			
		}
		
		
	}
}
