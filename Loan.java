import java.util.*;

/**透過使用者傳入的loan amount . number of years . annual interest rate
 * 來計算monthly payment . total payment
 * 如果輸入的值小於或等於0的話
 * 此程式會抓IllegalArgumentException
 * 並顯示出來，然後讓使用者重新輸入一次
 */
class Loan{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	//no-args constructor
	public Loan(){
		this(2.5 , 1 , 1000);
	}
	
	//constructor
	public Loan(double annualInterestRate , int numberOfYears , double loanAmount){
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}
	
	//return annualInterestRate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	/*Set a new annualInterestRate
	 *if annualInterestRate is less than or equal to 0, 
	 *this method will throw IllegalArgumentException
	 */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
		if(annualInterestRate > 0)
			this.annualInterestRate = annualInterestRate;
		else 
			throw new IllegalArgumentException("\nAnnual Interest Rate can't not be less than or equal to zero");
	}
	
	//return numberOfYears
	public int getNumberOfYears(){
		return numberOfYears;
	}
	
	/*Set a new numberOfYears
	 *if numberOfYears is less than or equal to 0, 
	 *this method will throw IllegalArgumentException
	 */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException{
		if(numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException("\nNumber of years can't not be less than or equal to zero");
	}
	
	//return loanAmount
	public double getLoanAmount(){
		return loanAmount;
	}
	
	/*Set a new loanAmount
	 *if loanAmount is less than or equal to 0, 
	 *this method will throw IllegalArgumentException
	 */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException{
		if(loanAmount > 0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException("\nLoan amount can't not be less than or equal to zero");
	}
	
	//return monthlyPayment
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / 
			(1 - (1 / Math.pow(1 + monthlyInterestRate , numberOfYears *12)));
		return monthlyPayment;
	}
	
	//return totalPayment
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	//return loanDate
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}
