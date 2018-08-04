package com.cg.wallet.walletDao;

public interface IQueryMapper {
	
	public String INSERT_Query="INSERT INTO Wallet(name,mobileNo,emailId,balance) Values(?,?,?,?)";
	public String getBal="SELECT balance from Wallet where mobileNo=?";
	public String getacc="SELECT * from Wallet";
	public String depo="UPDATE Wallet SET balance=?,Trans_date=? WHERE mobileNo=?";
	public String withD="UPDATE Wallet SET balance=?,Trans_date=?  WHERE mobileNo=?";

}
