/*
 * (©) Copyright  2020 Trung Ky-kenneth. All Right Reserved.
 * 
 * @author Trung Ky
 * @date Feb 13, 2020
 * @version 1.0
*/
package fa.model;

public class Manager {
	private String name;
	
	public Manager() {
		System.out.println("Create a manager object without name");
	}
	public Manager(String name) {
		System.out.println("Create a manager object with name: " + name);
	}
	public void report(Employee employee) throws Exception {
		System.out.println(employee.getName());
	}
	public void report(Developer developer) {
		developer.work();
	}
}
