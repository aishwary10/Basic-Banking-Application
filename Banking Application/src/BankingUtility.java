
public class BankingUtility {
		int balance = 0;
		int prevTransaction = 0;
		public int accbalance() {
			return balance;
		}
		public int getPrevTransaction() {
			return prevTransaction;
		}
		public void deposit(int depositAmt) {
			balance = balance + depositAmt;
			prevTransaction = depositAmt;
		}
		public void withdraw(int withdrawAmt) {
			balance = balance - withdrawAmt;
			prevTransaction = -withdrawAmt;
		}
		public double getSI() {		
			return ((balance*10*1)/100);
		}
		
	}
