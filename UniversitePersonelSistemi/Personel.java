package UniversitePersonelSistemi;

public class Personel {
	private String ad,soyad,email;
	private int id=1907000;
	private static int toplamPersonelSayisi=0;
	private static int sayac = 0 ;
	
	
	public Personel(String ad,String soyad,String email) {
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;	
		toplamPersonelSayisi++;
		sayac++;
		this.id += sayac;
	}
	public int getId() { 
		return this.id;
	} 
	public String getAd() { 
		return this.ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return this.soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public void bilgiYazdir() {
		System.out.println("Personel isim : "+this.ad+"\n"+
				           "Personel soyad : "+this.soyad+"\n"+
				           "Personel email : "+this.email+"\n"+
				           "Personel id : "+this.id+"\n");				
	} 
	public static void getToplamPersonelSayisi() {
		System.out.println("Üniversitedeki Toplam Personel Sayisi : "+Personel.toplamPersonelSayisi);	 
	}
}





