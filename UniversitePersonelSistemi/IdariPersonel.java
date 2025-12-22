package UniversitePersonelSistemi;

public abstract class IdariPersonel extends Personel{
	private String birim;
	private int mesaiSaati;
	
	
	public IdariPersonel(String ad,String soyad,String email,String birim,int mesaiSaati) {
		super(ad,soyad,email);
		this.birim = birim;
		this.mesaiSaati = mesaiSaati; 
  }
	public void calis() { 
		System.out.println("Calisildi..."); 
	}
	@Override 
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("İdari Personel birimi : "+this.birim+"\n"+
		                   "İdari Personel Mesai saati : "+this.mesaiSaati+"\n");
	} 
	public String getBirim() {
		return this.birim;
	}
	public void setBirim(String birim) {
		this.birim = birim;
	}
	public int getMesaiSaati() {
		return this.mesaiSaati;
	}
	public void setMesaiSaati(int mesaiSaati) {
		this.mesaiSaati = mesaiSaati;
	}
}
 