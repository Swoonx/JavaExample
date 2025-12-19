package UniversitePersonelSistemi;

public class Main {
	
	public static void main(String[] args) {
		
		OgretimUyesi o1 = new OgretimUyesi("Emirhan","Demir","ed@gmail.com","Bilgisayar Mühendisliği",12,"Profesör");
		Memur m1 = new Memur("Emre","Cöne","ec@gmail.com","Mühendislik",35,"Ögrenci işleri");
		IdariPersonel i1 = new IdariPersonel("Abdulkadir","Yurttaş","ay@gmail.com","Mühendislik Mimarlık",40);
		
		o1.bilgiYazdir();
		System.out.println("**********************************");
		m1.bilgiYazdir();
		System.out.println("**********************************");
		i1.bilgiYazdir();
		System.out.println("**********************************");
		Personel.getToplamPersonelSayisi();
		
	}

}
