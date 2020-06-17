package com.class06;

public class FindMonthDays {

	// Find number of days in given month

	public static void main(String[] args) {
		String month = "JunJuly";

		switch (month) {

		case "Jan":
		case "March":
		case "July":
		case "May":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("31 days");
			break;

		case "Feb":
			System.out.println("28/29 days");
			break;

		case "April":
		case "Jun":
		case "Sept":
		case "Nov":
			System.out.println("30 days");
			break;

		default:
			System.out.println("Pleasse provide valid input");

		}

	}

}
