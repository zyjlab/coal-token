package jylink.coaltoken.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 煤炭币代币
 * @author ZHAOYUJIE
 *
 */
@Table(name = "coaltoken")
public class CoalTokenWallet {
	/**
	 * 无参构造方法
	 */
	public CoalTokenWallet() {
		super();
	}
	/**
	 * 全参的构造方法
	 * @param walletAddress
	 * @param userName
	 * @param createTime
	 * @param updateTime
	 */
	public CoalTokenWallet(String walletAddress, String userName, Date createTime, Date updateTime,String userID) {
		super();
		this.walletAddress = walletAddress;
		this.userName = userName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.userID=userID;
		
	}
	
	/**
	 * 钱包地址
	 */
	 @Column(name = "walletAddress")
	private String walletAddress;
	
	/**
	 * 用户姓名
	 */
	 @Column(name = "userName")
	private String userName;
	/**
	 * 用户ID
	 */
	 @Column(name = "userID")
	private String userID;
	/**
	 * 创建时间
	 */
	 @Column(name = "createTime")
	private Date createTime;
	/**
	 * 更新时间
	 */
	 @Column(name = "updateTime")
	private Date updateTime;
	public String getWalletAddress() {
		return walletAddress;
	}
	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	

}
