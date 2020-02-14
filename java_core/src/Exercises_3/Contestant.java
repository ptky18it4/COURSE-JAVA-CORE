package Exercises_3;

public class Contestant {

	private String identNumber;
	private String fullName;
	private String address;
	private Block block;
	private PriorityLevel priorityLevel;

	// =============================CONSTRUCTOR===================================================

	public Contestant(String identNumber, String fullName, String address, Block block, PriorityLevel priorityLevel) {
		super();
		this.identNumber = identNumber;
		this.fullName = fullName;
		this.address = address;
		this.block = block;
		this.priorityLevel = priorityLevel;
	}
	// =============================GENERRARE GETTERS
	// SETTER=======================================

	public String getIdentNumber() {
		return identNumber;
	}

	public void setIdentNumber(String identNumber) {
		this.identNumber = identNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	// =======================================SHOW INFORMATION OF
	// CONTESTANTS=====================================
	public void show() {
		System.out.println("Identification number : 					" + identNumber);
		System.out.println("Full name :				 			" + fullName);
		System.out.println("Address :				 			" + identNumber);
		System.out.println("Priority level : 						" + priorityLevel);
		System.out.println("Block :			 					" + block);
	}
	

}
