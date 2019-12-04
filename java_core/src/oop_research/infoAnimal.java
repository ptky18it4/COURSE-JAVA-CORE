package oop_research;

public class infoAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "Becgie";
		animal.age 	= 5;
		animal.height = 700f;
		
		animal.eat(" beef ");
		int age = animal.getAge();
		System.out.println("His age: " + age);

	}

}
