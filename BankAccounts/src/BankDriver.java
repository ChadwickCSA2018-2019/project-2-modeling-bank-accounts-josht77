
public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prints the report of each persons account at the beginning  
    	BankAccount nicksAcct = new BankAccount("Nick", 450, 550);
    	BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
    	nicksAcct.printReport();
    	carolsAcct.printReport();
    	
    	// stores the money in all accounts into variable totalMoney and then is printed to console 
    	int totalMoney = nicksAcct.getCheckMoney() + carolsAcct.getCheckMoney() + nicksAcct.getSaveMoney() + carolsAcct.getSaveMoney();
    	System.out.println("Total money in all accounts: $" + totalMoney);
    	
    	// makes a deposit of 100 dollars into nicks checking account
    	nicksAcct.makeCheckingDeposit(100);
    	nicksAcct.printReport();
    	
    	// make value nicksMoney that stores the amount of money in his accounts
    	// is then deposited into carols account by stating nicksMoney
    	int nicksMoney = nicksAcct.getCheckMoney() + nicksAcct.getSaveMoney();
    	nicksAcct.makeCheckingWithdrawal(nicksAcct.getCheckMoney());
    	nicksAcct.makeSavingsWithdrawal(nicksAcct.getSaveMoney());
    	nicksAcct.printReport();
    	carolsAcct.makeCheckingDeposit(nicksMoney);
    	carolsAcct.printReport();
    	
    	
	}

	
	
}
