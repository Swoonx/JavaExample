package UniversitePersonelSistemi;

public class AkademikPersonel extends Personel{
	private String bolum;
	private int dersSayisi;
	
	public AkademikPersonel(String ad,String soyad,String email,String bolum,int dersSayisi) {
		super(ad,soyad,email); 
		this.bolum = bolum;
		this.dersSayisi = dersSayisi;			
	}
	
	public void dersVer() {
		System.out.println("Ders verildi");
	}
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Akadamik Personel bölümü : "+this.bolum+"\n"+
                           "Akademik Personel ders sayisi : "+this.dersSayisi+"\n");		           
	} 
	public String getBolum() {
		return this.bolum; 
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public int getDersSayisi() {
		return this.dersSayisi;
	}
	public void setDersSayisi(int dersSayisi) {
		this.dersSayisi = dersSayisi;
	}
}
