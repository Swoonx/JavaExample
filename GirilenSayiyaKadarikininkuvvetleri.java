package ornekler;

import java.util.Scanner;

public class GirilenSayiyaKadarikininkuvvetleri {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sayi,i=0;
		System.out.println("Bir sayi giriniz : ");
		sayi = s.nextInt();
		
		while(i<=sayi) {
			System.out.print(" "+i);
			i+=2; 
		}
	}

}
