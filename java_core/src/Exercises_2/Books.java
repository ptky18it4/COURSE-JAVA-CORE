package Exercises_2;

public class Books extends Document {
	private String nameAuthor;
	private int pageNumber;
	
	
	
	//===========================CONSTRUCTOR=========================================

	
	public Books(String code, String namePublished, int numberIssued, String nameAuthor, int pageNumber) {
		super(code, namePublished, numberIssued);
		this.nameAuthor = nameAuthor;
		this.pageNumber = pageNumber;
		setTypeDocuments(TypeDocuments.BOOKS);
	}





	//===========================GENDER GETTER SETTER=========================================
	public String getNameAuthor() {
		return nameAuthor;
	}
	
	
	
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	
	
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	//=============================SHOW INFORMAITON OF BOOK - Override==================================

	@Override
	public void show() {
		super.show();
		System.out.println("Name Author :		 		"+ nameAuthor);
		System.out.println("Page number :		 		"+ pageNumber);
	}
	

	
	
	
}
