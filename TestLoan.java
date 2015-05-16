import java.util.*;

public class TestLoan{
	public static void main(String[] args){
		Loan loan = new Loan();
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Please enter the loan amount :");
			double loanAmount = input.nextDouble();
		
			loan.setLoanAmount(loanAmount);
		}
		catch(IllegalArgumentException ex1){
			System.out.println(ex1);
			System.exit(1);
		}
		
		try{
			System.out.println("Please enter the annual interest rate :");
			double annualInterestRate = input.nextDouble();
			
			loan.setAnnualInterestRate(annualInterestRate);
		}
		catch(IllegalArgumentException ex2){
			System.out.println(ex2);
			System.exit(1);
		}
		
		try{
			System.out.println("Please enter the number of years :");
			int numberOfYears = input.nextInt();
		
			loan.setNumberOfYears(numberOfYears);
		}
		catch(IllegalArgumentException ex3){
			System.out.println(ex3);
			System.exit(1);
		}
		
		System.out.println("The monthly payment is : " + loan.getMonthlyPayment());
		System.out.println("The total payment is : " + loan.getTotalPayment());
		System.out.println("The date is : " + loan.getLoanDate());
	}
}
