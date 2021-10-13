package project6;

import java.util.Scanner;

public class SavingsDemo {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(100, 0, 0);
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Number of deposits: "+ account.getNumDeposits());
		System.out.println("Number of withdrawals: "+ account.getNumWithdrawals());
		
		
		System.out.println("Please enter the amount you want to deposit: ");
		Scanner sc = new Scanner(System.in);
		Double balance = sc.nextDouble();

		account.deposit(balance);
	
		
		System.out.println("Do you want to make another Withdrawals?");
		String option = sc.nextLine();
	
		/*System.out.println("Balance: $" + account.getBalance());
		System.out.println("Number of deposits: "+ account.getNumDeposits());
		System.out.println("Number of withdrawals: "+ account.getNumWithdrawals());
		
		
		System.out.println("Doing the monthly processing");
		
		
		System.out.println(account.getMonthlyServiceCharge());*/
		
		sc.close();
		
	
	}
}
