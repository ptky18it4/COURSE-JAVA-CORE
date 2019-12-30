package Exercises_2;

import java.time.LocalDate;

public class News extends Document {

	private LocalDate dayPublished; // Release date

	public News(String code, String namePublished, int numberIssued, LocalDate dayPublished) {
		super(code, namePublished, numberIssued);
		this.dayPublished = dayPublished;
		setTypeDocuments(TypeDocuments.NEWS);
	}

	public LocalDate getDayPublished() {
		return dayPublished;
	}

	public void setDayPublished(LocalDate dayPublished) {
		this.dayPublished = dayPublished;
	}
	//=============================SHOW INFORMAITON OF News - Override==================================
	@Override
	public void show() {
		super.show();
		System.out.println("Published day :		 		"+ dayPublished);
	}
}
