class JobApplication
{
        static String nme;
	    static String db;
	    static String gnd;
		static String eml;
		static String ad;
		static int pne;
		
		 	 
      public static boolean createJobApplication(String name, String dob, String gender,String email, String address ,int phoneNum ) { 
         
		 boolean isJobApplicationDataCreated = false;
		 
		 nme = name;
		 db = dob;
		 gnd = gender;
		 eml = email;
		 ad = address;
		 pne = phoneNum;
		
		   
		 return isJobApplicationDataCreated; 
}    

         public static void getJobApplicationDetails()
		 {
         System.out.println("The user Name is:" + nme);
		 System.out.println("The date of birth is:" + db);
		 System.out.println("The Gender is:" + gnd);
		 System.out.println("The Email Id  is:" + eml);
		 System.out.println("The Address is:" +  ad);
		 System.out.println("The Phone Number is:"+ pne);
		 
		  
		 }
		  }