class BankAccountRunner
{
public static void main( String[] bank )
{
	BankAccount.debit(4000.0);
	double totalamount = BankAccount.getbalance();
	System.out.println("Balance is :"+ totalamount );
	BankAccount.credit(00.0);
}

}