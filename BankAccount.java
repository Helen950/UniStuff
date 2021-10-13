package project6;

public abstract class BankAccount {
	private double balance;
	private int numDeposits;
	private int numWithdrawals;
	private double interestRate;
	private double monthlyServiceCharge;
	
	BankAccount(){
		balance =0 ;
		numDeposits = 0;
		numWithdrawals = 0;
		interestRate= 0;
		monthlyServiceCharge =0; 
		
	}
	
	public BankAccount(double bal, double intRate, double mon ) {
		this.balance = bal;
		this.interestRate = intRate;
		this.monthlyServiceCharge = mon;
		
	
	} 
	public void deposit (double amount) {
		balance += amount;
		System.out.println("Amount deposited successfully.");
		numDeposits++;
		System.out.println("Final Account Balance after deposit is: $"+getBalance());
	}
	
	public void withdraw (double amount) {
		if(getBalance()>=amount) {
		balance = balance - amount;
		System.out.println("Amount withdrawn successfully.");
		System.out.println("Final Account Balance after withdraw is: $"+getBalance());
		numWithdrawals++;
		}
		else
			System.out.println("Insufficient funds in the account to process the withdraw");
		
	}
	
	public void calcInterest() {
		double monthlyInterestRate = (interestRate/12);
		double monthlyInterest = balance *  monthlyInterestRate;
		balance = balance + monthlyInterest;
	}
	
	public void monthlyProcess() {
		balance -= monthlyServiceCharge;
		numDeposits = 0;
		numWithdrawals = 0;
		monthlyServiceCharge = 0;
		
	}
	
	public double getBalance() {
		return balance;
	}
	

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getNumDeposits() {
		return numDeposits;
	}


	public void setNumDeposits(int numDeposits) {
		this.numDeposits = numDeposits;
	}


	public int getNumWithdrawals() {
		return numWithdrawals;
	}


	public void setNumWithdrawals(int numWithdrawals) {
		this.numWithdrawals = numWithdrawals;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getMonthlyServiceCharge() {
		return monthlyServiceCharge;
	}


	public void setMonthlyServiceCharge(double monthlyServiceCharge) {
		this.monthlyServiceCharge = monthlyServiceCharge;
	}
	
}


	
	
	



