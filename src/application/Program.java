package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
				
		for(int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			
			String name;
			int hours;
			double valuePerHour, additionalCharge;
			Employee employee;
			
			char outsourced = sc.next().charAt(0);
			
			if(outsourced == 'y') {
				System.out.print("Name: ");
				sc.nextLine();				
				name = sc.nextLine();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employeeList.add(employee);
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();				
				name = sc.nextLine();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				employee = new Employee(name, hours, valuePerHour);
				employeeList.add(employee);
			}			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		
		sc.close();		
	}
}