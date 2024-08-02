class BankApplication
  {
        static String nme;
	    static String eml;
	    static String add;
		static int phne;
static String acTy;

		 	 
      public static boolean createBankApplication(String name, String emailId, String address, int phoneNumber,String accountType)
	  
	  { 
         
		 boolean isBankApplicationDataCreated = false;
		 
		 nme = name;
		 eml = emailId;
		 add = address;
		 phne = phoneNumber;
		 acTy = accountType;

		 
   return isBankApplicationDataCreated; 
}    

         public static void getBankApplicationDetails()
    {
         System.out.println("The Name  is:" + nme);
		 System.out.println("The  Email Id is:" + eml);
		 System.out.println("The Address is:" + add);
		 System.out.println("The Phone number is:" + phne);
		 System.out.println("The Account Type is:" + acTy);
		 
		 
		 }
		  }