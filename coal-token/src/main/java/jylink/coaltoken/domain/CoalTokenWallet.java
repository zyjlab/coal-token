package jylink.coaltoken.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * ú̿�Ҵ���
 * @author ZHAOYUJIE
 *
 */
@Table(name = "coaltoken")
public class CoalTokenWallet {
	/**
	 * �޲ι��췽��
	 */
	public CoalTokenWallet() {
		super();
	}
	/**
	 * ȫ�εĹ��췽��
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
	 * Ǯ����ַ
	 */
	 @Column(name = "walletAddress")
	private String walletAddress;
	
	/**
	 * �û�����
	 */
	 @Column(name = "userName")
	private String userName;
	/**
	 * �û�ID
	 */
	 @Column(name = "userID")
	private String userID;
	/**
	 * ����ʱ��
	 */
	 @Column(name = "createTime")
	private Date createTime;
	/**
	 * ����ʱ��
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
