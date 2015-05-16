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
		catch(IllegalArgumentException exLoanAmount){
			System.out.println(exLoanAmount);
			System.exit(1);
		}
		
		try{
			System.out.println("Please enter the annual interest rate :");
			double annualInterestRate = input.nextDouble();
			
			loan.setAnnualInterestRate(annualInterestRate);
		}
		catch(IllegalArgumentException exAnnualInterestRate){
			System.out.println(exAnnualInterestRate);
			System.exit(1);
		}
		
		try{
			System.out.println("Please enter the number of years :");
			int numberOfYears = input.nextInt();
		
			loan.setNumberOfYears(numberOfYears);
		}
		catch(IllegalArgumentException exNumberOfYears){
			System.out.println(exNumberOfYears);
			System.exit(1);
		}
		
		System.out.println("The monthly payment is : " + loan.getMonthlyPayment());
		System.out.println("The total payment is : " + loan.getTotalPayment());
		System.out.println("The date is : " + loan.getLoanDate());
	}
}
