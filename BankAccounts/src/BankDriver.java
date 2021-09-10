
public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	BankAccount nicksAcct = new BankAccount("Nick", 450, 550);
    	BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
    	nicksAcct.printReport();
    	carolsAcct.printReport();
    	
    	int totalMoney = nicksAcct.getCheckMoney() + carolsAcct.getCheckMoney() + nicksAcct.getSaveMoney() + carolsAcct.getSaveMoney();
    	System.out.println("Total money in all accounts: $" + totalMoney);
    	
    
    	nicksAcct.makeCheckingDeposit(100);
    	nicksAcct.printReport();
    	
    	
    	int nicksMoney = nicksAcct.getCheckMoney() + nicksAcct.getSaveMoney();
    	nicksAcct.makeCheckingWithdrawal(nicksAcct.getCheckMoney());
    	nicksAcct.makeSavingsWithdrawal(nicksAcct.getSaveMoney());
    	nicksAcct.printReport();
    	carolsAcct.makeCheckingDeposit(nicksMoney);
    	carolsAcct.printReport();
    	
    	
	}

	
	
}
