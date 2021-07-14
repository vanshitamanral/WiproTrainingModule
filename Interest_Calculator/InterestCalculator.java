package Interest_Calculator;

import java.util.Scanner;

class InvalidValueException extends Exception
{
	public void checkage(int age) throws InvalidValueException
	{
		if(age<0)
		{
			throw new InvalidValueException();
		}
	}
	
	public void checkamount(double amount) throws InvalidValueException
	{
		if(amount<0)
		{
			throw new InvalidValueException();
		}
	}
}

abstract class Account{
	double interestRate;
	double amount;
	abstract double calculateInterest(double amount);
}
class FDAccount extends Account{
	double interestRate;
	double General;
	double SeniorCitizen;
	double amount;
	int noOfDays;
	int AgeOfAccountHolder;
	Scanner s=new Scanner(System.in);
	double calculateInterest(double amount)
	{
		InvalidValueException ex= new InvalidValueException();
		this.amount=amount;
		System.out.println("Enter the no of Days");
		noOfDays=s.nextInt();
		try
		{
			System.out.println("Enter the Age of Account holder:");
			AgeOfAccountHolder=s.nextInt();
			ex.checkage(AgeOfAccountHolder);
			if(amount<10000000)
			{
				
				if(noOfDays>=7 && noOfDays<=14)
				{
					General=4.50;
					SeniorCitizen=5.00;
				}else if(noOfDays>=15 && noOfDays<=29)
				{
					General=4.75;
					SeniorCitizen=5.25;
				} else if(noOfDays>=30 && noOfDays<=45)
				{
					General=5.50;
					SeniorCitizen=6.00;
				}else if(noOfDays>=46 && noOfDays<60)
				{
					General=7;
					SeniorCitizen=7.50;
				}else if(noOfDays>=61 && noOfDays<=184)
				{
					General=7.50;
					SeniorCitizen=8.00;
				}else if(noOfDays>=185 && noOfDays<=365)
				{
					General=8.00;
					SeniorCitizen=8.50;
				}
				if(AgeOfAccountHolder>50)
				{
					interestRate=SeniorCitizen;
				}else
				{
					interestRate=General;
				}
			}else if(amount>10000000)
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					interestRate=6.50;
				}else if(noOfDays>=15 && noOfDays<=29)
				{
					interestRate=6.75;
				} else if(noOfDays>=30 && noOfDays<=45)
				{
					interestRate=6.75;
				}else if(noOfDays>=46 && noOfDays<60)
				{
					interestRate=8;
				}else if(noOfDays>=61 && noOfDays<=184)
				{
					interestRate=8.50;
				}else if(noOfDays>=185 && noOfDays<=365)
				{
					interestRate=10.00;
				}
				
			}
			return (int)((interestRate*amount)/100);
		}catch(InvalidValueException e)
		{
			System.out.println("Please enter a correct value and try again");
			return -1;
		}
		
		
	}
	
}

class SBAccount extends Account{
	double amount;
	double interestRate;
	String TypeOfAccount;
	double calculateInterest(double amount)
	{
		Scanner s= new Scanner(System.in);
		this.amount=amount;
		System.out.println("Enter the Type of Account:");
		TypeOfAccount=s.next();
		if(TypeOfAccount.equalsIgnoreCase("Normal"))
		{
			interestRate=4;
		}else if(TypeOfAccount.equalsIgnoreCase("NRI"))
		{
			interestRate=6;
		}
		return (int)((interestRate*amount)/100);
	}
	
	
}

class RDAccount extends Account{
	double amount;
	double interestRate;
	int noOfMonths;
	double monthlyAmount;
	int AgeOfAccountHolder;
	double calculateInterest(double amount){
		InvalidValueException ex= new InvalidValueException();
		Scanner s= new Scanner(System.in);
		this.amount=amount;
		System.out.println("Enter the Months");
		noOfMonths=s.nextInt();
		try {
			System.out.println("Enter the Age of Account holder:");
			AgeOfAccountHolder=s.nextInt();
			ex.checkage(AgeOfAccountHolder);
			if(AgeOfAccountHolder<50)
			{
				if(noOfMonths==6)
				{
					interestRate=7.50;
				}else if( noOfMonths>6 && noOfMonths<=9)
				{
					interestRate=7.75;
				}else if( noOfMonths>9 && noOfMonths<=12)
				{
					interestRate=8.00;
				}else if( noOfMonths>12 && noOfMonths<=15)
				{
					interestRate=8.25;
				}else if( noOfMonths>15 && noOfMonths<=18)
				{
					interestRate=8.50;
				}else if( noOfMonths>18 && noOfMonths<=21)
				{
					interestRate=8.75;
				}
			}else if(AgeOfAccountHolder>50)
			{
				if(noOfMonths==6)
				{
					interestRate=8.00;
				}else if( noOfMonths>6 && noOfMonths<=9)
				{
					interestRate=8.25;
				}else if( noOfMonths>9 && noOfMonths<=12)
				{
					interestRate=8.50;
				}else if( noOfMonths>12 && noOfMonths<=15)
				{
					interestRate=8.75;
				}else if( noOfMonths>15 && noOfMonths<=18)
				{
					interestRate=9.00;
				}else if( noOfMonths>18 && noOfMonths<=21)
				{
					interestRate=9.25;
				}
			}
			return (int)((interestRate*amount)/100);
			
		}catch(InvalidValueException e)
		{
			System.out.println("Please enter a correct value and try again");
			return -1;
		}
		
	}
	
}
public class InterestCalculator {

	public static void main(String[] args) throws InvalidValueException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Select the Options:");
		System.out.println("1. Interest Calculator- SB");
		System.out.println("2. Interest Calculator- FD");
		System.out.println("3. Interest Calculator- RD");
		System.out.println("4. Exit");
		Account fd= new FDAccount();
		Account sb= new SBAccount();
		Account rd= new RDAccount();
		InvalidValueException ex= new InvalidValueException();
		int option=s.nextInt();
		switch(option)
		{
		case 1:
			try
			{
				System.out.println("Enter the Average SB amount: ");
				double sbamount=s.nextDouble();
				ex.checkamount(sbamount);
				double interestGain=sb.calculateInterest(sbamount);
				if(interestGain!=-1)
				{
					System.out.println("Interest Gained: Rs."+interestGain);
				}
				break;
			}catch(InvalidValueException e)
			{
				System.out.println("Please enter correct value and try again");
			}
			break;
		case 2:
			try
			{
				System.out.println("Enter the FD amount: ");
				double fdamount=s.nextDouble();
				ex.checkamount(fdamount);
				double interestGain=fd.calculateInterest(fdamount);
				if(interestGain!=-1)
				{
					System.out.println("Interest Gained: Rs."+interestGain);
				}
			}
			catch(InvalidValueException e)
			{
				System.out.println("Please enter correct value and try again");
			}
			break;
		case 3:
			try
			{
				System.out.println("Enter the RD amount: ");
				double rdamount=s.nextDouble();
				ex.checkamount(rdamount);
				double interestGain=rd.calculateInterest(rdamount);
				if(interestGain!=-1)
				{
					System.out.println("Interest Gained: Rs."+interestGain);
				}
			}catch(InvalidValueException e)
			{
				System.out.println("Please enter correct value and try again");
			}
			break;
		case 4:
			System.out.println("Exit");
			break;
			
		}

	}

}
