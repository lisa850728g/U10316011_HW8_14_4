import java.util.*;

/**Loan class的測試程式
 * 讓使用者輸入loan amount . annual interest rate . number of years
 * 如果數值小於或等於0就會跑出IllegalArgumentException，結束程式
 */
public class TestLoan{
	//Main method
	public static void main(String[] args){
		//new object
		Loan loan = new Loan();
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//測試是否有IllegalArgumentException被丟出
		try{
			//Prompt the user to enter the loan amount
			System.out.println("Please enter the loan amount :");
			double loanAmount = input.nextDouble();
		
			//呼叫Loan class的setLoanAmount method 並傳值進去
			loan.setLoanAmount(loanAmount);
		}
		//抓出被丟出的IllegalArgumentException
		catch(IllegalArgumentException exLoanAmount){
			System.out.println(exLoanAmount);
			//end programming
			System.exit(1);
		}
		
		//測試是否有IllegalArgumentException被丟出
		try{
			//Prompt the user to enter the annual interest rate
			System.out.println("Please enter the annual interest rate :");
			double annualInterestRate = input.nextDouble();
			
			//呼叫Loan class的setAnnualInterestRate method 並傳值進去
			loan.setAnnualInterestRate(annualInterestRate);
		}
		//抓出被丟出的IllegalArgumentException
		catch(IllegalArgumentException exAnnualInterestRate){
			System.out.println(exAnnualInterestRate);
			//end programming
			System.exit(1);
		}
		
		//測試是否有IllegalArgumentException被丟出
		try{
			//Prompt the user to enter the number of years
			System.out.println("Please enter the number of years :");
			int numberOfYears = input.nextInt();
		
			//呼叫Loan class的setNumberOfYears method 並傳值進去
			loan.setNumberOfYears(numberOfYears);
		}
		//抓出被丟出的IllegalArgumentException
		catch(IllegalArgumentException exNumberOfYears){
			System.out.println(exNumberOfYears);
			//end programming
			System.exit(1);
		}
		
		/*顯示出算完的monthly payment . total payment以及date*/
		System.out.println("The monthly payment is : " + loan.getMonthlyPayment());
		System.out.println("The total payment is : " + loan.getTotalPayment());
		System.out.println("The date is : " + loan.getLoanDate());
	}
}
