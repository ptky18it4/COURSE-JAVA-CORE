package Exercises_1;

/*
 * (©) Copyright  $(year) Trung Ky-kenneth. All Right Reserved.
 * 
 * @author $(user)
 * @date $(date)
 * $version 1.0
*/
public class Employee extends Officials {
	private int level;
	private Gender gender;
	
	
	public Employee(String name, int age, Gender genDer, String add, int level) {
		super(name, age, genDer, add);
		this.level = level;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();  // tính đa hình
		System.out.println("Level:    	"+level);
	}

	
	
	
}
