/**
 * 
 */
package com.demo;

/**
 * @author bijendra
 *
 */
public class Test {

	public static void main(String args[]) {

		Student student = new Student();
		student.setName("Bijendra");
		student.setRollNo(51);

		StaticNestedClass staticNestedClass = new StaticNestedClass();

		staticNestedClass.setStud(student);
		/**
		 * AS displayStudentDetailsWithoutInnerClassObject is static method so no need
		 * to create object. directly we can call
		 * displayStudentDetailsWithoutInnerClassObject()
		 */
		StaticNestedClass.StaticInnerClass.displayStudentDetailsWithoutInnerClassObject();

		/**
		 * AS displayStudentDetailsWithInnerClassObject is not static method so need to
		 * create object.
		 */
		StaticNestedClass.StaticInnerClass innerClass = new StaticNestedClass.StaticInnerClass();
		innerClass.displayStudentDetailsWithInnerClassObject();
	}
}
