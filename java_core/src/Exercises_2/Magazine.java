package Exercises_2;

public class Magazine extends Document {

	private int numberPublished;
	private int monthPublished;

	// ===========================CONSTRUCTOR=========================================
	public Magazine(String code, String namePublished, int numberIssued, int numberPublished, int monthPublished) {
		super(code, namePublished, numberIssued);
		this.numberPublished = numberPublished;
		this.monthPublished = monthPublished;
		setTypeDocuments(TypeDocuments.MAGAZINE);
		System.out.println();
	}

	// ===========================GENDER GETTER
	// SETTER=========================================
	public int getNumberPublished() {
		return numberPublished;
	}

	public void setNumberPublished(int numberPublished) {
		this.numberPublished = numberPublished;
	}

	public int getMonthPublished() {
		return monthPublished;
	}

	public void setMonthPublished(int monthPublished) {
		this.monthPublished = monthPublished;
	}
	//=============================SHOW INFORMAITON OF Magazine - Override==================================
	@Override
	public void show() {
		super.show();
		System.out.println("Published number :		 	"+ numberPublished);
		System.out.println("Published month :		 	"+ monthPublished);
	}
}
