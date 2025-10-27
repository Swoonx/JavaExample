package ornekler;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		
		int us,taban,sonuc=1,i=1;
		Scanner s = new Scanner(System.in);		
		System.out.println("Sayinizin tabanini giriniz : ");
		taban = s.nextInt();
		System.out.println("Sayinizin üssünü giriniz : ");
		us = s.nextInt();
		
		while(i<=us) {
			sonuc *= taban;
			i++;
		}
		System.out.println("isleminizin sonucu : "+sonuc);

	}

}
 