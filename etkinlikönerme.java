package ornekler;

import java.util.Scanner;

public class etkinlikönerme {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int havasicakligi;
		
		System.out.println("Etkinlik yapacaginiz günü hava sicakligini giriniz : ");
		havasicakligi = s.nextInt();
		
		if (havasicakligi>=50)
		{
			System.out.println("YANİYOSUN FUAT ABİİİ");
		}			
		else if (havasicakligi>30) 
		{
			System.out.println("Denize gidebilirsinn :)"); 
		}		
		else if (havasicakligi>5) 
		{
		    System.out.println("Sinemaya gidebilirsinn :)");	
		}
		else if (havasicakligi>-20) 
		{
			System.out.println("Kayak yapabilirsinn :)");
		}
		else 
		{
			System.out.println("HAVA SOGUK MI ? -YOO SICAK");
		}
	}
}
  
