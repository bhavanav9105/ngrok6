

public class BankService {
	
	static class BankAccount {

		double bal;

		BankAccount (double b) {

			bal = b;
		}

		void deposit (double a) {

			bal += a;
		
		}

		void withdraw (double a) {

			bal -= a;
		}
	}

	public static void main(String[] args) {

		BankAccount acc = new BankAccount(5500);

		acc.deposit(500);
		System.out.println("bal after deposit : "+ acc.bal);


		acc.withdraw(300);
		System.out.println("bal after withdraw : "+ acc.bal);

		System.out.println("final bal : " + acc.bal);
	}
}
		


