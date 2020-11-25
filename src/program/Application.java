package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Register;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Register> registerList = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		Integer toBeRegistred = scan.nextInt();
		System.out.println();
		
		
		for (int i=0; i<toBeRegistred; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			
			System.out.print("ID: ");			
			Integer id = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();
			System.out.println();
			
			Register register = new Register(id, name, salary);
			registerList.add(register);
			
		}
		
		
		System.out.println("List of employees: \n");		
		for (Register reg : registerList) {
			System.out.println(reg);
		}		
		System.out.println();		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idSalary = scan.nextInt();
		Integer pos = idPosition(registerList, idSalary);		
		System.out.println();
		
		if (pos == null) {
			System.out.println("This id doesn't exists.");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			registerList.get(pos).setIncreasePercent(percent);			
			System.out.println();
			
			System.out.println("Employee updated: \n");
			System.out.print(
						"ID: " + registerList.get(pos).getIdEmployee() + ", " +
						"Name: " + registerList.get(pos).getNameEmployee() + ", " +
						"Salary: " + registerList.get(pos).getEmployeeSalary() + "\n");
		}
		
		scan.close();
		
		}	
	
	public static Integer idPosition(List<Register> registerList, int id) {
		for (int i = 0; i < registerList.size(); i++) {
			if (registerList.get(i).getIdEmployee() == id) {
				return i;
			}
		}
		return null;
	}

}
