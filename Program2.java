package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingAccount;
import entities.businessAccount;

public class Program2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		
		Account acc = new Account (1001, "Alex", 0.0);
		businessAccount bacc = new businessAccount (1002, "Maria", 0.0, 500.0);
			
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new businessAccount (1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount (1004, "Ana", 0.0, 0.01);
	
		// Downcasting
		
		businessAccount acc4 = (businessAccount) acc2; 
		acc4.loan(100.0);
	
		// businessAccount acc5 = (SavingAccount) acc3;
		
		if(acc3 instanceof businessAccount) {
			businessAccount acc5 = (businessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan !");
		};

		if(acc3 instanceof businessAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update !");
		};
		
	}
	

}
