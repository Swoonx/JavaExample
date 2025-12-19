package UniversitePersonelSistemi;

public class OgretimUyesi extends AkademikPersonel{
	private String unvan;
	
	
	public OgretimUyesi(String ad,String soyad,String email,String bolum,int dersSayisi,String unvan) {
		super(ad,soyad,email,bolum,dersSayisi);   
		this.unvan = unvan;
	}
	public void sinavYap() {
		System.out.println("Sınav Yapıldı...");
	}
	public String getUnvan() {
		return this.unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public void bilgiYazdir() {
		super.bilgiYazdir(); 
		System.out.println("Ögretim üyesinin unvanı : "+this.unvan+"\n");
	}

}
