package SınıflarOrnek;

public class Employee {
	private String name;
	private double salary;
	private int workHours,hireYear;
	
	Employee(int hireYear,int workHours,double salary,String name){
		
		this.hireYear = hireYear;
		this.name = name;
		this.workHours = workHours;
		this.salary = salary;			
	}
	public double Tax() {
		
		if (this.salary >=1000) { 		
			
			return this.salary*0.03; 	
		}
		else {
			return 0.0; 
		}				
	} 
	public double bonus() {
		int extrahours = workHours - 40;
		if (extrahours > 0) {
			return extrahours*30; 
		}
		else {
			return 0.0;
		}
	}
	
	public double RaiseSalary() {
		int year = 2025 - this.hireYear;
		if (year>20) {
			return (salary*15)/100;
		}
		else if (year>10) {
			return (salary*10)/100;
		}
		else { 
			return (salary*5)/100;
		}
	  }
	}
 


















