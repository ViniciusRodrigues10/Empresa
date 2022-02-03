package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();	
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println("\nEmployee: " + emp.toString());
		
		System.out.println("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + emp);
		
		sc.close();

	}

}
