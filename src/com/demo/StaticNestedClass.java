/**
 * 
 */
package com.demo;

/**
 * @author bijendra
 * 
 */
public class StaticNestedClass {

	/*
	 * stud is static variable so it will belong to class area and it common for all
	 * object of StaticNestedClass
	 */
	private static Student stud;

	private int serialNo;

	public void setStud(Student student) {
		this.stud = student;
	}

	static class StaticInnerClass {
		public void displayStudentDetailsWithInnerClassObject() {
			System.out.println("*********displayStudentDetailsWithInnerClassObject********\n");
			System.out.println("Student Name: " + stud.getName() + "\nRoll no     : " + stud.getRollNo());
			// Compile Time Error :Cannot make a static reference to the non-static field
			// serialNo
			// System.out.println("Serial No :" +serialNo);
			// To access serialNo need to create object of StaticNestedClass class
			System.out.println("Serial No   :" + new StaticNestedClass().serialNo);
			System.out.println("*****************\n");
		}

		public static void displayStudentDetailsWithoutInnerClassObject() {
			System.out.println("********displayStudentDetailsWithoutInnerClassObject*********\n");
			System.out.println("Student Name: " + stud.getName() + "\nRoll no     : " + stud.getRollNo());
			System.out.println("Serial No   :" + new StaticNestedClass().serialNo);
			System.out.println("*****************\n");

		}
	}
}
