package classes;
import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}

	public int getTenureYear()
	{
		return tenureYear;
	}
	
	public void showInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Tenure Year: "+ tenureYear);
		System.out.println();
	}
}