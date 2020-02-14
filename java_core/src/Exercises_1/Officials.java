package Exercises_1;

public class Officials {
	private String name;
	private int age;
	private Gender genDer;
	private String add;
	
	public Officials(String name, int age, Gender genDer, String add) {
		super();
		this.name = name;
		this.age = age;
		this.genDer = genDer;
		this.add = add;
	}
	// Click mouse right -> Source -> Gener... getTer... Setter	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGenDer() {
		return genDer;
	}
	public void setGenDer(Gender genDer) {
		this.genDer = genDer;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void show() {
		System.out.println("Name : 		"+ name);
		System.out.println("Age : 		"+ age);
		System.out.println("Gender : 	"+ genDer);
		System.out.println("Address : 	"+ add);
	}

}
