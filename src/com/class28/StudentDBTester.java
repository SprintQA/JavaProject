package com.class28;

public class StudentDBTester {
	public static void main(String[] args) {
		StudentDataBase fedor_az = new StudentDataBase();
		StudentDataBase guljahan_ny = new StudentDataBase();
		StudentDataBase urve_az = new StudentDataBase();
		StudentDataBase vildan_vg = new StudentDataBase();

		fedor_az.setName("Fedor Morozov");

//		System.out.println(fedor_az.getId());
//		System.out.println(guljahan_ny.getId());
//		System.out.println(urve_az.getId());
//		System.out.println(vildan_vg.getId());

		fedor_az.displayStudentInfo();
		vildan_vg.displayStudentInfo();

	}
}
