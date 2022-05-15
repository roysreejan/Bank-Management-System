import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		Bank b = new Bank();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("What do you want to do?");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Customer Account Management");
			System.out.println("4. Account Transactions");
			System.out.println("5. Exit");
			
			System.out.print("Your Option: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Employee Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Employee");
				 	System.out.println("2. Get Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Go Back");
					
					System.out.print("Your Option: ");
					int c1 = sc.nextInt();
					
					switch(c1)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Employee");
							
							Employee e = new Employee();

							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							e.setName(name1);

					 	 	System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							e.setEmpId(empId1);
							
						 	System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							e.setSalary(salary1);
							
						 	b.insertEmployee(e);
							
							System.out.println("-----------------------------------------");
							break;
							
					 	case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Get Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = b.getEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee ID is: "+e2.getEmpId());
								System.out.println("Employee Name is: "+e2.getName());
								System.out.println("Employee Salary is: "+e2.getSalary());
							}
							else
							{
								System.out.println("Employee Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Employees");
							
							b.showAllEmployees();
							
							System.out.println("-----------------------------------------");
							break;
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
					
					break;
				
				case 2:
				
					
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Customer Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Customer");
				 	System.out.println("2. Get Existing Customer");
					System.out.println("3. Show All Customers");
					System.out.println("4. Go Back");
					
					System.out.print("Your Option: ");
					int c2 = sc.nextInt();
					
					switch(c2)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Customer");
							
							Customer cust1 = new Customer();
						  
							String name1;
							System.out.print("Enter Customer Name: ");
							try
							{
								name1 = bfr.readLine();
							}
							catch(IOException ioe)
							{
								name1 = "defaultName";
							}
							cust1.setName(name1);

							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							cust1.setNid(nid1);
							
							b.insertCustomer(cust1);
							
							System.out.println("-----------------------------------------");
							break;
							
					 	case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Get Existing Customer");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer cust2 = b.getCustomer(nid2);
							
							if(cust2 != null)
							{
								System.out.println("Customer NID: "+cust2.getNid());
								System.out.println("Customer Name: "+cust2.getName());
								cust2.showAllAccounts();
							}
							else
							{
								System.out.println("Customer Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Customers");
							
							b.showAllCustomers();
							
							System.out.println("-----------------------------------------");
							break;
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}

					
					break;
					
				case 3:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Customer Account Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Account for a Customer");
				 	System.out.println("2. Get Existing Account of a Customer");
					System.out.println("3. Show All Accounts of a Customer");
					System.out.println("4. Go Back");
					
					System.out.print("Your Option: ");
					int c3 = sc.nextInt();
					
					switch(c3)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Account for a Customer\n");
							System.out.println("Which Type of Account do you want?");
							System.out.println("1. Savings Account");
							System.out.println("2. Fixed Account");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							Account a = null;
							
							if(type == 1)
							{
								System.out.print("Enter Account Number : ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance : ");
								double balance1 = sc.nextDouble();
								System.out.print("Enter Interest Rate : ");
								double ir1 = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount();
								sa.setAccountNumber(an1);
								sa.setBalance(balance1);
								sa.setInterestRate(ir1);
								
								a = sa;
								
							}
							else if(type == 2)
							{
								System.out.print("Enter Account Number : ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance : ");
								double balance1 = sc.nextDouble();
								System.out.print("Enter Tenure Year : ");
								int ty1 = sc.nextInt();
								
								FixedAccount fa = new FixedAccount();
								fa.setAccountNumber(an1);
								fa.setBalance(balance1);
								fa.setTenureYear(ty1);
								
								a = fa;
							}
							else if(type == 3)
							{
								System.out.println("Going Back ...");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(a!=null)
							{
								System.out.print("Enter Customer NID: ");
								int nid1 = sc.nextInt();
								
								b.getCustomer(nid1).insertAccount(a);
							}
						
							System.out.println("-----------------------------------------");
							break;
							
					 	case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Get Existing Customer Account");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							
							Account a2 = b.getCustomer(nid2).getAccount(an2);
							
							if(a2 != null)
							{
								a2.showInfo();
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Accounts");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
						
							b.getCustomer(nid3).showAllAccounts();
							
							System.out.println("-----------------------------------------");
							break;
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}

					
					break;
					
				case 4:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Account Transactions");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?\n");
					System.out.println("1. Deposit Money");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Transfer Money");
					System.out.println("4. Show Transaction History");
				 	System.out.println("5. Go Back");
 
					System.out.print("Your Option: ");
					int c4 = sc.nextInt();
					
					switch(c4)
					{
						case 1:
						
							System.out.println("-----------------------------------------");
							System.out.println("Deposit Money");
							
							System.out.print("Enter Customer Nid: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an1 = sc.nextInt();
							System.out.print("Enter Amount: ");
							double amount1 = sc.nextDouble();
							
							if(amount1>0)
							{
							 	Customer cc = b.getCustomer(nid1);
								Account aa = cc.getAccount(an1);
								aa.deposit(amount1);
								
							 	frwd.writeInFile("Deposit : $"+ amount1 +" in Account Number "+an1);
								
							}
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
						
							System.out.println("-----------------------------------------");
							System.out.println("Withdraw Money");
							
							System.out.print("Enter Customer Nid: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							System.out.print("Enter Amount: ");
							double amount2 = sc.nextDouble();
							
							
							if(amount2>0 && amount2 <= b.getCustomer(nid2).getAccount(an2).getBalance())
							{
							 	Customer cc = b.getCustomer(nid2);
								Account aa = cc.getAccount(an2);
								aa.withdraw(amount2);
							 
								frwd.writeInFile("Withdraw : $"+ amount2 +" from Account Number "+an2);
								
							}
							
							System.out.println("-----------------------------------------");
							break;
							
						case 3:
						
							System.out.println("-----------------------------------------");
					 		System.out.println("Transfer Money");
							
							System.out.print("Enter From Customer Nid: ");
							int fromNid = sc.nextInt();
							System.out.print("Enter From Account Number: ");
							int fromAN = sc.nextInt();
							System.out.print("Enter Amount: ");
							double amount3 = sc.nextDouble();
							
							System.out.print("Enter To Customer Nid: ");
							int toNid = sc.nextInt();
							System.out.print("Enter To Account Number: ");
							int toAN = sc.nextInt();
							
							
							Customer fromCustomer = b.getCustomer(fromNid);
							Customer toCustomer = b.getCustomer(toNid);
							
							Account fromAccount = fromCustomer.getAccount(fromAN);
							Account toAccount = toCustomer.getAccount(toAN);
							
							if(amount3 >0 && amount3 <= fromAccount.getBalance())
							{
								fromAccount.transfer(toAccount, amount3);
								
								frwd.writeInFile("Transfer: $"+amount3+ " from Account Number "+ fromAN +" to Account Number "+toAN);
							}
							
							System.out.println("-----------------------------------------");
							break;
					 
					 	case 4:
						
							System.out.println("-----------------------------------------");
							System.out.println("Show Transactions History");
							frwd.readFromFile();
							System.out.println("-----------------------------------------");
							break;

						case 5:
			 		
							System.out.println("-----------------------------------------");
							System.out.println("Going back....");
							System.out.println("-----------------------------------------");
							break;
							
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
					
					break;
					
				case 5:
					
					System.out.println("You have choosen to exit");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Option");
					break;
			}
		}
	}
}