package Exercises_3;

public class Contestant_Block_B extends Contestant {
	private String math;
	private String chemistry;
	private String biological;

	// ==========================================CONSTRUCTOR=====================================================
	public Contestant_Block_B(String identNumber, String fullName, String address, Block block,
			PriorityLevel priorityLevel, String math, String chemistry, String biological) {
		super(identNumber, fullName, address, block, priorityLevel);
		this.math = math;
		this.chemistry = chemistry;
		this.biological = biological;
	}

	// =====================================GENERRARE GETTERS
	// SETTER==============================================
	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getBiological() {
		return biological;
	}

	public void setBiological(String biological) {
		this.biological = biological;
	}

	// ========================================SHOW INFORMATION OF CONTESTANT BLOCK
	// B=============================
	@Override
	public void show() {
		super.show();
		System.out.println("Math : 								" + math);
		System.out.println("Chemistry : 							" + chemistry);
		System.out.println("Biological : 							" + biological);
	}
}
