import java.util.*;

/**Loan class的測試程式
 * 讓使用者輸入loan amount . annual interest rate . number of years
 * 如果數值小於或等於0就會跑出IllegalArgumentException
 * 重新讓使用者輸入新的值，直到輸入值大於0為止
 * 才繼續執行下面的程式碼
 */
public class TestLoan{
	//Main method
	public static void main(String[] args){
		//new object
		Loan loan = new Loan();
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//set a boolean initializes in true
		boolean again = true;
		
		//重複執行直到傳入的值大於0
		do{
			//測試是否有IllegalArgumentException被丟出
			try{
				//Prompt the user to enter the loan amount
				System.out.print("Please enter the loan amount : ");
				double loanAmount = input.nextDouble();
		
				//呼叫Loan class的setLoanAmount method 並傳值進去
				loan.setLoanAmount(loanAmount);
				
				//reset again into false
				again = false;
			}
			//抓出被丟出的IllegalArgumentException
			catch(IllegalArgumentException exLoanAmount){
				System.out.println(exLoanAmount);
				//start from next line
				System.out.println();
			}
		}while(again);
		
		//reset again into true
		again = true;
		
		//重複執行直到傳入的值大於0
		do{
			//測試是否有IllegalArgumentException被丟出
			try{
				//Prompt the user to enter the annual interest rate
				System.out.print("Please enter the annual interest rate : ");
				double annualInterestRate = input.nextDouble();
			
				//呼叫Loan class的setAnnualInterestRate method 並傳值進去
				loan.setAnnualInterestRate(annualInterestRate);
				
				//reset again into false
				again = false;
			}
			//抓出被丟出的IllegalArgumentException
			catch(IllegalArgumentException exAnnualInterestRate){
				System.out.println(exAnnualInterestRate);
				//start from next line
				System.out.println();
			}
		}while(again);
		
		//reset again into true
		again = true;
		
		//重複執行直到傳入的值大於0
		do{
			//測試是否有IllegalArgumentException被丟出
			try{
				//Prompt the user to enter the number of years
				System.out.print("Please enter the number of years : ");
				int numberOfYears = input.nextInt();
		
				//呼叫Loan class的setNumberOfYears method 並傳值進去
				loan.setNumberOfYears(numberOfYears);
				
				//reset again into false
				again = false;
			}
			//抓出被丟出的IllegalArgumentException
			catch(IllegalArgumentException exNumberOfYears){
				System.out.println(exNumberOfYears);
				//start from next line
				System.out.println();
			}
		}while(again);
		
		/*顯示出算完的monthly payment . total payment以及date*/
		System.out.println("The monthly payment is : " + loan.getMonthlyPayment());
		System.out.println("The total payment is : " + loan.getTotalPayment());
		System.out.println("The date is : " + loan.getLoanDate());
	}
}
