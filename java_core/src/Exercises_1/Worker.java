package Exercises_1;

public class Worker extends Officials {
	
	private int work;


	public Worker(String name, int age, Gender genDer, String add, int work) {
		super(name, age, genDer, add);
		this.work = work;
	}


	public int getWork() {
		return work;
	}


	public void setWork(int work) {
		this.work = work;
	}

	
	
}
