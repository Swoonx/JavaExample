package ornekler;

import java.util.Scanner;

public class teksayilarprogramı {

	public static void main(String[] args) {
		int sayi,toplam = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("bir sayi giriniz :");
			sayi = s.nextInt();
		    if (sayi<0) {
		    	break;		       
		    }
		    else if (sayi%2 != 0) {		
		    	toplam += sayi;	    	
		    }
		    else {
		    	continue;
		    }			
		}
		System.out.println(toplam);

	}

}
