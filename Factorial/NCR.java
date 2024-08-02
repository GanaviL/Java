class NCR
{
	public static void main(String ncr[])
	{
		//nCr​=nPr​​ / r!= n!​ / (r! (n-r)!)
		int factNum = 20;
		int numOfThings = 28;
		
		int finalFactValue = Factorial.getFact(factNum);
		int finalNumOfThings = Factorial.getFact(numOfThings);
		
		int totalFactNumOfThings = Factorial.getFact(Factorial.totalNumberOfThings(factNum, numOfThings));
	    int finaResultOfNcr = finalFactValue /( finalNumOfThings * totalFactNumOfThings);
		
		System.out.println("Main Method stated");
		System.out.println("The final Result of NCR is : " + finaResultOfNcr);
		System.out.println("Main Method ended");
	
	}


}