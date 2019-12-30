package Exercises_3;

public class Contestant_Block_A extends Contestant {
	private String math;
	private String physical;
	private String chemistry;

	// =============================CONSTRUCTOR================================================================
	public Contestant_Block_A(String identNumber, String fullName, String address, Block block,
			PriorityLevel priorityLevel, String math, String physical, String chemistry) {
		super(identNumber, fullName, address, block, priorityLevel);
		this.math = math;
		this.physical = physical;
		this.chemistry = chemistry;
	}

	// =============================GENERRARE GETTERS
	// SETTER===================================================
	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	// ========================================SHOW INFORMATION OF CONTESTANT BLOCK
	// A=============================
	@Override
	public void show() {
		super.show();
		System.out.println("Math : 								" + math);
		System.out.println("Physical : 							" + physical);
		System.out.println("Chemistry : 							" + chemistry);
	}

}
