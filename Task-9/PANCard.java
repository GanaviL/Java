class PANCard {
        static String appyTy;
	    static int mNo;
		static String cat;
		static String dB;
		static String tit;
		static String nam;
		static String eID; 
		 	 
public static boolean createPANCard(String applicationType, int mobileNumber, String category,String dOB,String title , String name , String  emailID  ){ 
         
		 boolean isPANCardDataCreated =false;
		 appyTy = applicationType;
		 mNo =mobileNumber;
		 cat =category;
		 dB =dOB;
		 tit= title;
		 nam = name;
		 eID = emailID;
		 return isPANCardDataCreated; 
}    
         public static void getPANCardDetails() {
         System.out.println("Application Type:" +appyTy);
		 System.out.println("Mobile Number:" +mNo);
		 System.out.println("Category :" +cat);
		 System.out.println("Date of Birth is :" +dB);
		 System.out.println("Title :" +tit);
		 System.out.println("Name:" +nam);
		 System.out.println("Email ID :" +eID);
		 }
		  }
		 
		 
		 
		 
		 
