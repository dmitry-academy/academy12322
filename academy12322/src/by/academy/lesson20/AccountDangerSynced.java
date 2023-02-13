package by.academy.lesson20;

public class AccountDangerSynced implements Runnable {
	private Account account = new Account();

	public static void main(String[] args) {
		AccountDangerSynced accountDanger = new AccountDangerSynced();
		Thread one = new Thread(accountDanger);
		Thread two = new Thread(accountDanger);
		one.setName("Fred");
		two.setName("Lucy");
		two.start();
		one.start();
	}

	public void run() {
		for (int x = 0; x < 5; x++) {
			if (account.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			} else {
				makeWithdrawal(5);
			}
		}
	}

	private synchronized void makeWithdrawal(int amt) {
		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			account.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal. The balance is "
					+ account.getBalance());
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ account.getBalance());
		}
	}
}