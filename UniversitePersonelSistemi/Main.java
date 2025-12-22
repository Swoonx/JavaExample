package UniversitePersonelSistemi;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		
	    IdersVerebilir I1 = new OgretimUyesi("Emirhan","Demir","ed@gmail.com","Bilgisayar Mühendisliği",12,"Profesör");   
		I1.dersVer();
		
		IEvrakIsleyebilir I2 = new Memur("Emre","Cöne","ec@gmail.com","Mühendislik",35,"Ögrenci işleri");
		I2.evrakIsle();
		
	}

}
