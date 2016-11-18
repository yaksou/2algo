
//*******************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

import java.util.ArrayList;


public class Account implements Comparable {
	private double balance;
	private String acctNum;

	// ----------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// ----------------------------------------------
	public Account(String number, double initBal) {
		balance = initBal;
		acctNum = number;
	}

	// ----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// ----------------------------------------------
	public String withdraw(double amount) {
		String info = "Insufficient funds";
		if (balance >= amount) {
			balance = balance - amount;
			info = "Succeeded, the new balance is : " + balance;
		}

		return info;
	}

	// ----------------------------------------------
	// Adds deposit amount to balance.
	// ----------------------------------------------
	public String deposit(double amount) {
		String info = "";
		if (amount < 0)
			info = " Wrong amount";
		else {
			balance = balance + amount;
			info = " Succeeded, the new balance is: " + balance;
		}

		return info;
	}

	// ----------------------------------------------
	// Returns balance.
	// ----------------------------------------------
	public double getBalance() {
		return balance;
	}

	// ----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// ----------------------------------------------
	public String toString() {
		return " Numer: " + acctNum + " Balance: " + balance;
	}

	// ----------------------------------------------
	// Returns accoutn number.
	// ----------------------------------------------

	public String getAcctNum() {
		return acctNum;
	}

	public boolean equals(Object other) {

		if (this.compareTo(other) == 0)
			return true;
		return false;
	}

	public static Comparable<Account> findmin(ArrayList<Account> lista) {
		Account min = new Account("", Integer.MAX_VALUE);

		for (int i = 0; i < lista.size(); i++) {
			if (min.compareTo(lista.get(i)) > 0) {
				min = lista.get(i);

			}
		}
		return min;
	}

	public int compareTo(Account a) {
		if (balance == a.getBalance()) {
			return 0;
		} else if (balance < a.getBalance()) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] arg) {
		// Exempel om hur du kan anv�nder ArrayList ocg Account-objekt
		ArrayList<Account> lista = new ArrayList<Account>();
		// Skapa ett konto och sedan l�gga den i listan
		Account a = new Account("111", 1000);
		lista.add(a);
		// skapa account och l�gg den i listan samtidigt
		lista.add(new Account("112", 2000));

		lista.add(new Account("113", 3000));

		lista.add(new Account("114", 1400));

		lista.add(new Account("115", 1400));

		System.out.println(lista.get(2));

		// f�r att anropa metod skall f�rst objektet returneras från listan
		// det g�rs med metoden get();
		// h�r nedan direkt anrop
		lista.get(1).deposit(4000);

		// h�r nedan f�rst anrop av get() sedan,
		Account konto = lista.get(1);
		System.out.println(konto.deposit(300));
		System.out.println(konto.deposit(300));
		System.out.println(konto.deposit(300));
		System.out.println(findmin(lista));

	}

	@Override
	public int compareTo(Object o) {

		return 0;
	}
}