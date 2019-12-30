package Exercises_2;

import java.time.LocalDate;

public class MainClass {
	
	public static void main(String[] args) {
		
		BookManager bookManager = new BookManager();
		System.out.println("CHƯƠNG TRÌNH QUẢN L�? S�?CH");
//		Magazine magazines = new Magazine("TC1", "KD", 1, 1, 1);
		News news = new News("New_1", "News", 1, LocalDate.now());
		News news1 = new News("New_2", "News", 1, LocalDate.of(2019, 9, 9));
		Books books = new Books("NX1", "GD1", 1, "Kenneth", 100);
		Books books_1 = new Books("NX3", "GD1", 1, "Kenneth", 100);
		
//		bookManager.addDocument(magazines); 
		bookManager.addDocument(books);
		bookManager.addDocument(books_1);
		bookManager.addDocument(news);
		bookManager.addDocument(news1);
		
//		bookManager.delDocuments("TC1");
		bookManager.showListDocuments();
		System.out.println("Result search !");
		System.out.println(bookManager.searchDocument(TypeDocuments.BOOKS));
		
	}

}
//NullPointException:
// Có 1 biến nào đó chưa được khởi tạo -> debug đi rồi biết. HAHA
// Lỗi huy�?n thoại -> Kinh nghiệm xương máu -> debug -> Google