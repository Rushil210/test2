package ver1;

public class Account {
	
	public double balance;
	public Account(double initBalance) {
		balance = initBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBal) {

		if(newBal>0.0) {

		balance = newBal;

		}

		}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	public void withdraw(double amount) {
		if(amount > 0) {
			balance -= amount;
			
		}
		
	}
	
	@Override

	public String toString() {

		String msg = "balance=$" + balance;

		return msg;

	}
	public static void main(String [] args) {
		Account a1 = new Account(1000.00);
		//Account a2 = new Account(1000.00);
		a1.setBalance(1000.00);
		a1.deposit(500.0);
		a1.withdraw(200.0);

		System.out.println("Balance=$" + a1.getBalance());

		System.out.println(a1.toString());

		System.out.println(a1);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println("Balance = $" + a1.getBalance());
	}

}
