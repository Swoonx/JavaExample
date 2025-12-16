package library;

public class Book {
	private String title,author ;
	private boolean available ;
	private double price ;
	public static int totalbooks = 1907; 
	public static String libraryName = "Nevşehir Hacı Bektaş Veli Üniversitesi Kütüphanesi" ;
	
	public Book(String title , String author ,int price){
		this.title = title;
		this.author = author;
		this.price = price;
		available = true;
		totalbooks++;	
		}
	public void borrowBook() {
		if (available) {  
			System.out.println("Kitabı Ödünç Aldınız. ");			
			available = false; 
		}
		else {
			System.out.println("Kitap uygun değil !");
		}
	  }
	public void returnBook() {
		System.out.println("Kitabınız geri bırakıldı, İyi günler :)");		
		available = true;
      }  
	public double getPrice() {
		return this.price;  
	}
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} 
		else {
			System.out.println("Yanlış fiyatlandırma !");
		}	
	}
	public String getTitle() {
		return this.title; 
	}
	public static void printLibraryInfo() {
		System.out.println("Kütüphane ismi  : "+libraryName);
		System.out.println("Toplam kitap sayisi : "+totalbooks);	  
	}
	public String getAuthor() {
		return this.author; 
	}
	public boolean isAvaliable() {
		return this.available;  
	}
	public String toString() {
		return "kitabın adı : "+this.title+"\nkitabın fiyatı : "+this.price+"\nkitabın yazarı  :"+this.author+"\nkitabın durumu : "+
	            (available ? "Uygun" : "Ödünçte"); 
	} 
}
