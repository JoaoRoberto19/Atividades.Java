package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enuns.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
		
		
		System.out.print("Entre com o nome do Departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre com a data de trabalho: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Salario base: ");
		double workerSalary = sc.nextDouble();
	
		
		Worker worker = new Worker (workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));
		
		
		System.out.print("Quantos contratos você vai digitar?? ");
		
		int n = sc.nextInt();
		
		for(int i = 0; i>n; i++){
			
			System.out.println("Entre com o #"+i+"data: ");
			System.out.print("Data dd/MM/yyyy: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");	
			
			double valuePerHour= sc.nextDouble();
			System.out.print("Duração(horas): ");
			
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.AddContract(contract);
			}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano que deseja socilitar MM/YYYY: ");
		String monthAndYear = sc.next(); 
		
		
		int month =  Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for"+ monthAndYear+":" + String.format("%2f", worker.income(year, month)));
		
		
		
		
		sc.close();
		
		
		
		
	}
	

}
