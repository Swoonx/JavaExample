package ornekler;

import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sayi,sonuc=1,i=1;
		System.out.println("Bir sayi giriniz : ");
		sayi = s.nextInt();
		
		while(i<=sayi) {
			sonuc *= i;
			i++;
		}
		System.out.println("Girdiginiz sayinin faktöriyeli : "+sonuc);
	}

}
