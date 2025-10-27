package ornekler;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int islemno,bakiye=3000,paracekme,parayatirma,girilensifre,sifredegistirme,yenisifre,sifre=1907;
		
	    System.out.println("****************************SWOON BANKACILIĞA HOSGELDİNİZ****************************");	   
	    while(true) {
	    
	        System.out.print("Lütfen şifrenizi giriniz : ");
	        girilensifre = s.nextInt();
	    
	    if (girilensifre == sifre){ 
	    	
	    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : \n"
	    		+ "1- Bakiye sorgulama\n"
	    		+ "2- Para çekme\n"
	    		+ "3- Para yatırma\n"
	    		+ "4- Şifre değiştirme\n"
	    		+ "5- Çıkış\n");
	    islemno = s.nextInt();
	    
	    switch(islemno) {
	    
	    case 1 : 
	    	
	        System.out.println("Güncel Bakiyeniz  :"+bakiye+"\n"); 
	        System.out.println("İşleminiz başarıyla tamamlandı!");
	        System.out.println("Giriş ekranına yönlendiriliyorsunuz...");
	        break;
	    
	    case 2 : 
	    		    	
	        System.out.print("Ne kadar para çekmek istiyorsunuz ? ");
	        paracekme = s.nextInt();
	        bakiye -= paracekme;
	        System.out.println("İşleminiz başarıyla tamamlandı!");
	        System.out.println("Giriş ekranına yönlendiriliyorsunuz...");
	        break;
	    
	    case 3 : 
	    	
	    	System.out.print("Ne kadar para yatırmak istiyorsunuz ? ");
	    	parayatirma = s.nextInt();
	    	bakiye += parayatirma;
	    	System.out.println("İşleminiz başarıyla tamamlandı!");
	        System.out.println("Giriş ekranına yönlendiriliyorsunuz...");
	    	break;
	    	
	    case 4 : 
	    	
	    	System.out.print("Lütfen eski şifrenizi giriniz : ");
	    	sifredegistirme = s.nextInt();
	    	if (sifredegistirme == sifre) {
	    		System.out.println("Yeni sifrenizi girebilirsiniz : ");
	    		sifre = s.nextInt(); 
	    		System.out.println("Şifreniz başarıyla değiştirildi !");
		        System.out.println("Giriş ekranına yönlendiriliyorsunuz...");
		        
	    	}
	    	else {
	    		System.out.println("Eski şifre hatalı !");
	    	}
	    	break;
	    case 5 :
	    	
	    	System.out.println("Oturumunuz sonlandırılıyor...");
	    	return;
	        }
	       	   
	    } 
	    else {
	    	System.out.println(" Girdiğiniz şifre yalnış ! oturumunuz sonlandırılıyor...");
	   }
	  }
   }
}
