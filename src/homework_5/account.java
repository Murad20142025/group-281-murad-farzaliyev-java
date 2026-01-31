package homework_5;

public class account {
private String owner;
private double balance;


public account(String owner,double balance) {
	this.owner=owner;
	this.balance=balance;
}
public void deposit(double amount) {
	balance+=amount;
}


public void withdraw(double amount) {
	if(balance>0&&balance-amount>=0) {
		balance-=amount;
	}else {
		System.out.println("No money");
	}

	
}
public void getBalance() {
	System.out.println("Balance: "+balance);
}

}
