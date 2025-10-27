package ornekler;

import java.util.Scanner;

public class AsalSayiBulma {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sayi,kalan=0;
		boolean asal = true;
		System.out.println("Bir sayi giriniz : ");
		sayi = s.nextDouble();
		
		for (int i = 2;i<sayi;i++) {
			if (sayi%i==0) {
				System.out.println("Sayiniz Asal Sayi Degil.");		
				asal = false;
				break;
			}									 							
		} 
	if (asal) {
		System.out.println("Sayiniz bir asal sayi");
	} 
}
}