
public class infoBird {

	public static void main(String[] args) {
		
		Bird bird = new Bird("Sky", 25, 1.7f);
		
		bird.eat("rice");
		int age = bird.getAge();
		System.out.println("His age: " + age);

	}

}
