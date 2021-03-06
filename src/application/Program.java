package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1102, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anoa", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 =  (BusinessAccount) acc2;
		acc4.loan(100.0);
		
	// Error: nao pode fazer dowcasting pq SavingAcouunt n�o � uma conta businesAcount BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200);
			System.out.println("emprestimo");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc12 = new  Account(1001, "Ales", 1000.0);
		acc12.withdraw(200.0);
		System.out.println(acc12.getBalance());
		
		Account acc22 = new SavingsAccount(1002, "marsa", 1000.0, 0.01);
		acc22.withdraw(200.0);
		System.out.println(acc22.getBalance());
		
		Account acc32 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc32.withdraw(200.0);
		
		System.out.println(acc32.getBalance());
	}

}
