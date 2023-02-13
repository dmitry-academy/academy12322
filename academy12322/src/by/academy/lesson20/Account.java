package by.academy.lesson20;

public class Account implements Runnable {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public void run() {
		for (int x = 0; x < 5; x++) {
			if (getBalance() < 0) {
				System.out.println("account is overdrawn!");
			} else {
				makeWithdrawal(6);
			}
		}
	}

	public void makeWithdrawal(int amount) {
		if (getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			withdraw(amount);
			System.out.println(
					Thread.currentThread().getName() + " completes the withdrawal. The balance is " + getBalance());
		} else {
			System.out.println(
					"Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + getBalance());
		}
	}
}
