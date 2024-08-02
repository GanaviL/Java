class BankAccount
{
 static double balance;
public static void debit(double amount)
  {
  balance = balance - amount;
	  balance=balance-amount;
	  if (amount<=balance)
	  {
	  }else {
		System.out.println("Insufficient funds");
  return;
		  
  }  
  
  System.out.println("Insufficient funds");
  return;
  }
  public static void credit( double amount)
  {
  balance = balance + amount;
  System.out.println("Account can't be Zero balance");
  return;
  }
  public static double getbalance(){
  return balance;
  }
  }