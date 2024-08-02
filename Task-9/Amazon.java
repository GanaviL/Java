class Amazon
{
        static String lgn;
	    static String eml;
	    static String pwd;
		static int phne;
		static int op;
		 	 
      public static boolean createAmazon(String login, String emailId, String password, int phoneNumber, int otp )
	  
	  { 
         
		 boolean isAmazonDataCreated =false;
		 lgn = login;
		 eml = emailId;
		 pwd = password;
		 phne = phoneNumber;
		 op = otp;
		 
   return isAmazonDataCreated; 
}    

         public static void getAmazonDetails()
    {
         System.out.println("The login id  is:" + lgn);
		 System.out.println("The  Email Id is:" + eml);
		 System.out.println("The password is is:" + pwd);
		 System.out.println("The Phone number is:" + phne);
		 System.out.println("The given OTP is:" + op);
		 
		 
		 }
		  }