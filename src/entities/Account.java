package entities;

public class Account {

	private Integer number;
	private String holdeder;
	protected Double balance;
	
	public Account() {}

	public Account(Integer number, String holdeder, Double balance) {
		this.number = number;
		this.holdeder = holdeder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoldeder() {
		return holdeder;
	}

	public void setHoldeder(String holdeder) {
		this.holdeder = holdeder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
