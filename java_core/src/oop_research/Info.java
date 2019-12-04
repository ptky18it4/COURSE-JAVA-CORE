package oop_research;

public class Info {

	public static void main(String[] args) {
		Person[] person = new Person[2];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			person[i].name = "Kenneth " + i;
			person[i].age = 19 + i;
			person[i].height = 1.7f + i;
			person[i].homeTown = "Phu Yen " + i;
			person[i].school = " SICT " + i;
		}

		for (int i = 0; i < person.length; i++) {
			System.out.println("Name person " + i + " : " + person[i].name);
			System.out.println("Age person " + i + " : " + person[i].age);
			System.out.println("Height person " + i + " : " + person[i].height);
			System.out.println("Hometown person " + i + " : " + person[i].homeTown);
			System.out.println("School person " + i + " : " + person[i].school);
		}
	}

}
