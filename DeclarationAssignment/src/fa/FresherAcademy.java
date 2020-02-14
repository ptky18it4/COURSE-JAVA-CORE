/*
 * (©) Copyright  2020 Trung Ky-kenneth. All Right Reserved.
 * 
 * @author Trung Ky
 * @date Feb 14, 2020
 * @version 1.0
*/
package fa;

public class FresherAcademy {
	
	private String name;
	private int numberOfStudent;
	
	public void checkVariables() {
		System.out.println("Name : " + name);
		System.out.println("Number of Student : " +  numberOfStudent);
	}
	
	public static void main(String[] args) {
		FresherAcademy fresherAcademy = new FresherAcademy();
		fresherAcademy.checkVariables();
	}
}
