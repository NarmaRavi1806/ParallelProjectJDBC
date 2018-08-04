package com.cg.wallet.Db;


import com.cg.wallet.bean.Wallet;
import com.cg.wallet.walletException.WalletException;
import com.cg.wallet.walletService.IWalletService;
import com.cg.wallet.walletService.WalletServiceImpl;

public class MainUi {

	public static void main(String[] args) {
		IWalletService ser=new WalletServiceImpl();
		Wallet wallet= new Wallet();
		wallet.setName("Ravan");
		wallet.setMobileNo("1234567890");
		wallet.setEmailId("ravan@gmail.com");
		wallet.setBalance(1000.0);
		try {
			ser.createAccount(wallet);
			System.out.println("Account created");
			
		} catch (WalletException e) {
			System.out.println("invalid");
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		wallet.setMobileNo("7788665533");
		try {
			System.out.println(ser.showBalance(wallet.getMobileNo()));
		} catch (WalletException e) {
			System.out.println("invalid");
			System.out.println(e.getMessage());
			System.out.println();
		}

	}

}
