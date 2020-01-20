package Challenge2;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(200000.00);
		BankAccount account2 = new BankAccount(account1);
		System.out.println("The balance in account 1:"+account1.getBalance()
						+"\nThe balance in account 2:"+account2.getBalance());
	}

}
