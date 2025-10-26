package ornekler;

import java.util.Scanner;

public class HesapMakinesi {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sayi;
	    double sayi1,sayi2;
	    System.out.println("Lütfen hangi islemi yapacağınızı giriniz ( 1-toplama 2-cıkarma"
	    		+ " 3-carpma 4-bölme ) : ");
	     sayi = s.nextInt();
	     if (sayi == 1 || sayi == 2 ||sayi == 3 ||sayi ==4) {
	    	 
	     
	     System.out.println("Birinci sayinizi giriniz : ");
	     sayi1 = s.nextDouble();
	     System.out.println("Ikinci sayinizi giriniz : ");
         sayi2 = s.nextDouble();
                          	 
            switch(sayi) {
         
            case 1 :
           	    System.out.println("islem sonucunuz : "+(sayi1+sayi2));
        	    break;
            case 2:
        	    System.out.println("islem sonucunuz : "+(sayi1-sayi2));
        	    break;
             case 3:
        	    System.out.println("islem sonucunuz : "+(sayi1*sayi2));
        	    break;
             case 4:
        	    System.out.println("islem sonucunuz : "+(sayi1/sayi2));
        	    break;
             default:
        	    System.out.println("Yanlis tuslama yaptiniz !");
        	    break;       
             } 
        }
         else {
    		 System.out.println("Yanlis tuslama yaptiniz !");
    	 }
   }

}
