package jylink.coaltoken.data;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jylink.coaltoken.common.MyMapper;
import jylink.coaltoken.domain.CoalTokenWallet;

@Mapper
public interface CoalTokenWalletDao extends MyMapper<CoalTokenWallet> {
	
	  
}
