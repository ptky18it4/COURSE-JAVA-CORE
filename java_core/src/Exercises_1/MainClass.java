package Exercises_1;

import java.util.ArrayList;

public class MainClass {
	
	static ArrayList<Officials> listOfficial = new ArrayList<Officials>();

	static void addOfficials(Officials officials) {
		listOfficial.add(officials);
	}

	static ArrayList<Officials> searchOfficial(String name) {

		ArrayList<Officials> listOfficial = new ArrayList<Officials>();

		for (Officials officials : listOfficial) {

			String nameOfficials = officials.getName();

			if (nameOfficials.equalsIgnoreCase(name)) {
				listOfficial.add(officials);
			}
		}

		return listOfficial;

	}

	static void showListOfficials() {
		for (Officials officials : listOfficial) {
			officials.show();
			System.out.println("------------");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter your name : ");
		Employee employee = new Employee("Kenneth", 19, Gender.NAM, "Vietnam", 1);
		addOfficials(employee);
		System.out.println("----Hien thi danh sach----");
		showListOfficials();
	}

}
