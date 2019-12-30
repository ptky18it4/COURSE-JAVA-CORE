package Exercises_3;

public class Contestant_Block_C extends Contestant {

	private String literature;
	private String history;
	private String geography;

	// ==========================================CONSTRUCTOR=====================================================
	public Contestant_Block_C(String identNumber, String fullName, String address, Block block,
			PriorityLevel priorityLevel, String literature, String history, String geography) {
		super(identNumber, fullName, address, block, priorityLevel);
		this.literature = literature;
		this.history = history;
		this.geography = geography;
	}

	// =====================================GENERRARE GETTERS
	// SETTER==============================================
	public String getLiterature() {
		return literature;
	}

	public void setLiterature(String literature) {
		this.literature = literature;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getGeography() {
		return geography;
	}

	public void setGeography(String geography) {
		this.geography = geography;
	}

	// ========================================SHOW INFORMATION OF CONTESTANT BLOCK
	// C=============================
	@Override
	public void show() {
		super.show();
		System.out.println("Literature : 							" + literature);
		System.out.println("History : 							" + history);
		System.out.println("Geography : 							" + geography);
	}

}
