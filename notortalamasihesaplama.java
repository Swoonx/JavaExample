package ornekler;

import java.util.Scanner;

public class notortalamasihesaplama {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int vize , Final, ort;
		String ders;
		System.out.println("Hangi dersin ortalamasini hesaplicaksınız : ");
		ders = s.nextLine();
		System.out.println("Vize notunuzu giriniz :");
		vize = s.nextInt();
		System.out.println("Final notunuzu giriniz :");
	    Final = s.nextInt();
	   
	    ort = (vize*40)/100 + (Final*60)/100;
	    	    
	    if (Final < 60) {
	    	System.out.println("Final notunuz : "+Final);
	    	System.out.println("Final notunuz düsük oldugu icin dersten kaldiniz.");
	    }
	    	
	    else {	    
	    		    	    		
	    		if (ort >= 90) {
	    			System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    			System.out.println("Başarı notunuz : AA");
	    		}
	    	    else if (ort >= 85) {
	    			System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    			System.out.println("Başarı notunuz : BA");
	    		}
	    	    else if (ort >= 80) {
	    	    	System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    			System.out.println("Başarı notunuz : BB");
	    	    }
	    	    else if (ort >= 75) {
	    	    	System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    			System.out.println("Başarı notunuz : CB");
	    	    }
	    		else if (ort >= 65) {
	    			System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    			System.out.println("Başarı notunuz : CC");
	    		}
	    	    else if(ort<65) {
	    	    	System.out.println(ders+" Dersinizin aldiginiz notlara göre ortalamasi : "+ort);
	    	    	System.out.println("Ortalamaniz düsük oldugu icin dersten kaldiniz.");
	    	    }	    	    		
	    	    }	    	  	    	    	    	    	    			    		    		     	
	    	}	   
	    }	