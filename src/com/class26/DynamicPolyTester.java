package com.class26;

public class DynamicPolyTester {
	public static void main(String[] args) {

//		LG_TV remoteLG = new LG_TV();
//		remoteLG.method1();
//
//		Sony_TV remoteSony = new Sony_TV();
//		remoteSony.method1();
//
//		LG_TV remoteLGTV = new Sony_TV();
//		remoteLGTV.method2();
//		
//		
//		Sony_TV remoteSonyTV = new LG_TV();

		AccountManager am = new AccountManager();
		am.createAccount(new HSBC());
		am.createAccount(new BankOfAmerica());

	}
}
