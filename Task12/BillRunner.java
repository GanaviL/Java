class BillRunner
{
  public static void main(String[] generateBill)
  { 
 
    Bill bill = new Bill();
	bill.billId = 121;
	bill.billIssueDate = "23/03/2024";
	bill. billDueDate = "29/03/2024";
	System.out.println("The bill Id is:" +bill.billId);
	System.out.println("The bill issue date is:" +bill.billIssueDate);
	System.out.println("The bill due date is:" +bill.billDueDate);
	
	 
	 Bill bill1 = new Bill();
	 bill1.billId = 122;
	 bill1.billIssueDate = "23/04/2024";
	 bill1.billDueDate = "29/04/2024";
	 System.out.println("The bill Id is:" +bill1.billId);
	 System.out.println("The bill issue date is:" +bill1.billIssueDate);
	 System.out.println("The bill due date is:" +bill1.billDueDate);
	 }
	}