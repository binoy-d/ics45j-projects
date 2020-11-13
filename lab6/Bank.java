package labs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	ArrayList<BankAccount> accounts;
	
	// Constructor that creates a Bank object with no bank accounts
	public Bank()  {
		accounts = new ArrayList<BankAccount>();
	}
	
	// reads a file with account numbers and balances and adds the accounts to the bank. If an account with that account number already exists, it overwrites the balance of that account.
	public void readFile(String fileName) {
		try(Scanner in = new Scanner(new File(fileName))){
			while(in.hasNextLine()) {
				String[] line = in.nextLine().split(" ");
				int accountNumber = Integer.parseInt(line[0]);
				double initialBalance = Double.parseDouble(line[1]);
				accounts.add(new BankAccount(accountNumber, initialBalance));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: "+fileName+" not found");
		}
	}
	
	// returns the account with the highest balance. If more than one just return any of them
	BankAccount getHighestBalanceAccount() {
		if(accounts.size() == 0) {
			return null;
		}
		BankAccount big = accounts.get(0);
		for(BankAccount a: accounts) {
			if(a.getBalance()>big.getBalance()) {
				big = a;
			}
		}
		return big;
	}
}
