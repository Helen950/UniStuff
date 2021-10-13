package project6;

public class SavingsAccount extends BankAccount {
	
	private boolean status;

	public SavingsAccount(double bal, double intRate, double mon) {
		super(bal, intRate, mon);
		status = true;
	}
	/**
	 * @Override super class method deposit
	 */
	
	public void deposit(double amount) {
		super.deposit(amount);
		if(super.getBalance()>25)
			status = true;
		
	}
	/**
	 * @Override super class method withdraw
	 */
	
	public void withdraw(double amount) {
		if ( status == false)
		{
			System.out.println("Your account is inactive");
		}
		else
			super.withdraw(amount);
		if (super.getBalance()<25)
			status=false;
	}
	/**
	 * Override super class method monthlyProcess
	 */
	
	public void monthlyProcess() {
		
		if(super.getNumWithdrawals()>4) {
			double charge = (super.getNumWithdrawals()-4);
			super.setMonthlyServiceCharge(charge);
			super.monthlyProcess();
			if(super.getBalance()<25)
				this.status = false;
		}
	}

}
