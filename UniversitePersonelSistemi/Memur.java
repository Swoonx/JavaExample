package UniversitePersonelSistemi;

public class Memur extends IdariPersonel implements IEvrakIsleyebilir{ 
	private String gorev;
	
	
	public Memur(String ad,String soyad,String email,String birim,int mesaiSaati,String gorev) {
		super(ad,soyad,email,birim,mesaiSaati);
		this.gorev = gorev; 
	}
	public void evrakIsle() { 
		System.out.println("Evraklar isleniyor....\nEvraklar islendi.");
	}
	public String getGorev() {
		return this.gorev;
	}
	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Memurun görevi : "+this.gorev+"\n\n");
	}

}
