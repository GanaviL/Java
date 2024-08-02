class AadhaarCard {
		static String nam;
		static String eID; 
		static String sta;
	    static int mNo;
		static String dist;
		static String d;
		static String t;
		static String verCo;
		 	 
public static boolean createAadhaarCard(String name, int mobileNumber, String emailID, String state, String district , String date , String  time, String verificationCode ){ 
         
		 boolean isAadhaarCardDataCreated =false;
		 nam = name;
		 mNo =mobileNumber;
		 sta =state;
		 t =time;
		 d=date;
		 eID = emailID;
		 verCo = verificationCode;
		 return isAadhaarCardDataCreated; 
}    
         public static void getAadhaarCardDetails() {
		 System.out.println("Mobile Number:" +mNo);
		 System.out.println("Time is  :" +t);
		 System.out.println("Date is :" +d);
		 System.out.println("State :" +sta);
		 System.out.println("Name:" +nam);
		 System.out.println("Email ID :" +eID);
		 System.out.println("Verification Code :" +verCo);
		 }
		  }
		 
		 
		 
		 
		 
