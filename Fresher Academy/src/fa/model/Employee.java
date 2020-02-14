/*
 * (©) Copyright  2020 Trung Ky-kenneth. All Right Reserved.
 * 
 * @author Trung Ky
 * @date Feb 13, 2020
 * @version 1.0
*/
package fa.model;

public class Employee extends Person implements Member, Colleague {
	private String name;
	private String age;
	private String address;

//	Create fast Getters & Setters : Alt + Shift + S -> R -> Select All -> Generate
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void move() {
		System.out.println("Moving of Employee");		
	}

	@Override
	public void showName() {
		System.out.println("Show Employee name");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

}
