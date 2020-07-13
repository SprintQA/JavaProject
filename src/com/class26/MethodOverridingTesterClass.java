package com.class26;

public class MethodOverridingTesterClass {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
//		c.displayYourName();
//		c.doWork();
//		p.doWork();

		HSBC hsbc = new HSBC();
		BankOfAmerica boa = new BankOfAmerica();
//		hsbc.displayInterestRate();
//		boa.openAccount();

		Shape s = new Shape();
		Circle circle = new Circle();
		Squre sq = new Squre();

		s.displayShape();
		sq.displayShape();
		circle.displayShape();

	}
}
