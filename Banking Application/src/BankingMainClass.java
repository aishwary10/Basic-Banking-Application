import java.util.*;
public class BankingMainClass {

	public static void main(String[] args) {
		BankingUtility BUobj = new BankingUtility();
		String customerName;	
		Scanner sc = new Scanner(System.in);
		System.out.println("********************************************");
		System.out.println("      Please Enter your Name    ");
		System.out.println("********************************************");
		customerName = sc.nextLine();
		System.out.println("********************************************");
		System.out.println("Hi " + customerName);
		System.out.println("      Welcome to Banking Application     ");
		System.out.println("********************************************");
		System.out.println("Please select the required option");
		System.out.println("       A : Check Balance");
		System.out.println("       B : Withdraw Amount");
		System.out.println("       C : Deposit Amount");
		System.out.println("       D : Get Previous Transaction");
		System.out.println("       E : Find Simple Interest for 1 year at 10% p.a.");
		System.out.println("       F : Exit");	
		char ch = '\0';
		while(ch != 'F') {
			System.out.print("---->");
			ch = sc.next().charAt(0);
			ch=Character.toUpperCase(ch);
			switch(ch) {
			case 'A': int balance = BUobj.accbalance();
					  System.out.println("Your account balance is :" + balance);
				      break;
			case 'B': System.out.println("Please enter the amount to be withdrawn");
			          int withdrawAmt = sc.nextInt();
			          if(withdrawAmt > BUobj.accbalance()) {
			        	  System.out.println("Sorry, You don't have enough balance");
			          }else {
			          BUobj.withdraw(withdrawAmt);
			          System.out.println("Successfully Withdrawn!! Remaining Account Balance : " + BUobj.accbalance());
			          }
				      break;
			case 'C': System.out.println("Please enter the amount to be deposited");
	                  int depositAmt = sc.nextInt();
	                  BUobj.deposit(depositAmt);
	                  System.out.println("Successfully Deposited!! Updated Account Balance : " + BUobj.accbalance());
			          break;
			case 'D': if(BUobj.getPrevTransaction() > 0) {
				        System.out.println("Amount Deposited  : " + BUobj.getPrevTransaction());
		                } else if(BUobj.getPrevTransaction() < 0) {
		                	System.out.println("Amount Withdrawn  : " + Math.abs(BUobj.getPrevTransaction()));			                
		                } else {
		                	System.out.println("No Transactions Yet!!");
		                }
				break;
			case 'E': System.out.println("Simple Interest for 1 year at 10% p.a. is  : " + BUobj.getSI());
				break;
			case 'F': System.out.println("Thanks for using the Application :)");
				break;
			default: System.out.println("Invalid Entry!! Please enter correct option ");
			}
		}
	}

}
