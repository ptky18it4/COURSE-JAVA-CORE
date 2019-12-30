package Exercises_2;

import java.util.ArrayList;

public class BookManager {
	// Chỗ này dễ sai.
	// private ArrayList<Document> listDocuments = new ArrayList<Document>(); //
	// Cách 1 :
	private ArrayList<Document> listDocuments;

	/*
	 * ?? Add ( Book, Magazine, News ) : - K lẽ gi�? viết 3 hàm sao ? - Do đó, ta chỉ
	 * cần viết thêm tài liệu chung chung thôi, chứ k nên viết hàm thêm cụ thể từng
	 * loại
	 */
	public BookManager() {
		listDocuments = new ArrayList<Document>(); // Cách 2 : Khởi tạo trong 1 Constructor
	}

	public void addDocument(Document documents) {
		// Create to save list documents
		String codeDocuments = documents.getCode();

		if (checkCodeDocuments(codeDocuments)) {
			System.out.println("Error : code documents isseted !");
		} else {
			listDocuments.add(documents);
		}

	}

	private boolean checkCodeDocuments(String codeDocuments) {
		for (Document document : listDocuments) {

			if (codeDocuments.equals(document.getCode())) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Document> searchDocument(TypeDocuments typeDocuments){
		ArrayList<Document> list = new ArrayList<Document>();
		for (Document document : listDocuments) {
			if (document.getTypeDocuments() == typeDocuments) {
				list.add(document);
			}
		}		
		return list;
		
	}

	public void delDocuments(String codeDocuments) {
		int location = -1;
		
		for (int i = 0; i < listDocuments.size(); i++) {
			Document document = listDocuments.get(i);
			if (codeDocuments.equals(document.getCode())) {
				location = i;
				break;
			}

		}

		if(location != -1) {
			listDocuments.remove(location);
			System.out.println("Da xoa tai lieu" + listDocuments.get(location));
		}
	}
	
	public void showListDocuments() {
		for (Document document : listDocuments) {
			document.show();
			System.out.println("------------");
		}
	}
}
