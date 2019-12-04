package oop_research;

public class Bird {
	public String 	name;
	public int 		age;
	public float 	height;
	
	public Bird(String name, int age, float height) {
		/**
		 * Thằng này gọi là phương thức khởi tạo
		 * từ khóa this mang ý nghĩa là Bird ( class Bird )
		 */
		this.name 	= name;
		this.age	= age;
		this.height = height;
	}
	
	public void eat(String foodName) {
		System.out.println(name + " is eating " + foodName);
	}
	
	public int getAge() {
		return age;
	}
}
