package SınıflarOrnek;

import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name;
		double salary;
		int workHours,hireYear;
		
		System.out.print("Lütfen İsminizi giriniz :");
		name = s.next();
		System.out.print("Lütfen Maaşınızı giriniz : ");
		salary = s.nextDouble();
		System.out.print("Lütfen Bir haftada kaç saat çalıştığınızı giriniz : ");
		workHours = s.nextInt();
		System.out.print("Lütfen Hangi yılda çalışmaya başladığınızı giriniz  :");
		hireYear = s.nextInt();
		
		Employee calisan1 = new Employee(hireYear,workHours,salary,name);
		
		System.out.println("Tax : "+calisan1.Tax());
		System.out.println("Bonus : "+calisan1.bonus());
		System.out.println("Raise salary : "+calisan1.RaiseSalary());
		System.out.println("Güncel Brüt Maaşınız  : "+ (salary + calisan1.bonus()- calisan1.Tax()));
		System.out.println("Maaş artışıyla birlikte toplam maaş : " + (calisan1.RaiseSalary() + salary));
	

	}

}
