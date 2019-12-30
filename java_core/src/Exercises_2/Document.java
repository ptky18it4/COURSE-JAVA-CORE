package Exercises_2;

public class Document {
	private String code;
	private String namePublished;  // Published name
	private int numberIssued;	//Issued number
	private TypeDocuments typeDocuments;
	
	//========================= SOURCE -> CONSTRUCOTR ==============================
	
	public void setTypeDocuments(TypeDocuments typeDocuments) {
		this.typeDocuments = typeDocuments;
	}


	public Document(String code, String namePublished, int numberIssued) {
		super();
		this.code = code;
		this.namePublished = namePublished;
		this.numberIssued = numberIssued;
	}


	//========================= GENDER GETTER SETTER...=============================
	
	public TypeDocuments getTypeDocuments() {
		return typeDocuments;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getNamePublished() {
		return namePublished;
	}
	
	public void setNamePublished(String namePublished) {
		this.namePublished = namePublished;
	}
	
	public int getNumberIssued() {
		return numberIssued;
	}
	
	public void setNumberIssued(int numberIssued) {
		this.numberIssued = numberIssued;
	}
	
	//===========================SHOW INFORMATION DOCUMENT============================
	public void show() {
		System.out.println("Code : 					"+ code);
		System.out.println("Published name : 			"+ namePublished);
		System.out.println("Issued number :		 		"+ numberIssued);
	}
	
	
}
