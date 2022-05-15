package classes;
import java.lang.*;
import interfaces.*;

public class Customer implements AccountOperations
{
	private String name;
	private int nid;
	private Account accounts[] = new Account [10];
	
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setNid(int nid)
	{
		this.nid = nid;
	}
	
 	public String getName()
	{
		return name;
	}

	public int getNid()
	{
		return nid;
	}
	
	public void insertAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
 	public Account getAccount(int accountNumber)
	{
		Account a = null;
		
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}

	public void showAllAccounts()
	{
		for(Account a : accounts)
		{
			if(a != null)
			{
				a.showInfo();
			}
		}
	}
}