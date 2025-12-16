package library;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
				
		Book book1 = new Book("gül yetiştiren adam","Rasim Özdenören",355);
		Book book2 = new Book("kuyucaklı yusuf","Sabahattin Ali",239);
		Book book3 = new Book("yaban","Yakup Kadri Karaosmanoğlu",199);
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		Book.printLibraryInfo();
		
		System.out.println("***********************************************");
		
		for(Book book : library) {
			System.out.println(book); 
		}
		book2.borrowBook();
		System.out.println(book2.isAvaliable() ? "Kitap Uygun " : "Kitap Ödünçte");
		
	
		 
	}
}
 