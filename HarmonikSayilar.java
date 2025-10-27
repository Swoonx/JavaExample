package ornekler;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		double sayi,sonuc=0;
		int i=1;
		System.out.println("Bir sayi giriniz : ");
		sayi=s.nextInt();
		
		while(i<=sayi) {
			sonuc += (double)1/i;			
			i++;
		}
		System.out.println("Girdiginiz Sayinin Harmonik Sayilardaki Sonucu : "+sonuc);
	}

}
