package ornekler;

import java.util.Scanner;

public class KDVhesaplama {

	public static void main(String[] args) {
		
		/*eğer gıda ürünleri alacaksa kdv oranı %10 , diğer tüketim malları %20 */
		
		System.out.println("***********************KDV HESAPLAMA***********************\n");
		Scanner s = new Scanner(System.in);
		
		String urunturu;
		double maliyet;
		double kdvlifiyat;
		
		System.out.println("Lütfen alacaginiz ürünün türünü belirtiniz ( gida veya diger ) : ");
		urunturu = s.nextLine();
		System.out.println("Lütfen alacağınız ürünün maliyetini giriniz :");
		maliyet = s.nextDouble();
		
		if (urunturu.equals("gida") || urunturu.equals("diger")) {
			
            if (urunturu.equals("gida")) {
		    	 
			    kdvlifiyat = maliyet + (maliyet*0.1); 
			    System.out.println("Ürününüzün KDV dahil fiyatı : "+kdvlifiyat);
		   }
		    else {
		    	 
			     kdvlifiyat = maliyet + (maliyet*0.2);
			     System.out.println("Ürününüzün KDV dahil fiyatı : "+kdvlifiyat);
		   }
		}
		else {
			
		 System.out.println("Hatali tuslama yaptiniz !");
		
		   }
		
	}

}
