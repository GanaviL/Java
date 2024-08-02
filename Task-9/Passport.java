class Passport{
        static String cprLoc;
	    static int dcdrLoc;
	    static String givenNm;
		static String db;
		static String eml;
		static String surNm;
		static boolean login;
		static String logId;
		static String pw;
		static String hide;
		static String confirmPw;
		static String capt;
		 	 
public static boolean createPassport(String cprLocation, int dcdrLocation, 
String givenName,String dob, String email,String surName,boolean isEmailLoginSame,
String logInId,String pwd,String hideAns,String confirmPwd,String captcha ){ 
         
		 boolean isPassportDataCreated =false;
		 boolean isDcdrLocationValid=false;
		 boolean isEmailLoginSameValid=false;
		 boolean isGivenNameValid=false;
		 
		 
if(dcdrLocation > 0 ){
                   dcdrLoc       =  dcdrLocation ;
isDcdrLocationValid = true;
 }else{
 System.out.println("Please provide valid dcdrLocation");
 } 
if(surName != null){
surNm         =  surName ;
  isSurNameValid = true ;
 }else{
  System.out.println("Please provide valid Sur Name");
}
 if( isEmailLoginSame != false){
   isEmailLoginSm     = isEmailLoginSame;
  isEmailLoginSameValid = true ;
 }else{
  System.out.println("Please provide valid isEmailLoginSame value ");
}
  if( givenName != null){
    givenNm     = givenName;
   isGivenNameValid = true ;
  }else{
  System.out.println("Please provide valid isEmailLoginSame value ");
 }

 if(isDcdrLocationValid && isEmailLoginSameValid && isSurNameValid && isGivenNameValid){
  isPassportDataCreated  =true;
              
		 
}
		   
		 return isPassportDataCreated; 
}    


         public static void getPassportDetails(){
         System.out.println("The cpr Location is:"+cprLoc);
		 System.out.println("The dcdr Location is:"+dcdrLoc);
		 System.out.println("The given Name of Person is:"+givenNm);
		 System.out.println("The Person Date of Birth is:"+db);
		 System.out.println("The User Email is:"+eml);
		 System.out.println("The User Sur Name is:"+surNm);
		 System.out.println("The Email is Log in:"+login);
		 System.out.println("The Log in Id is:"+logId);
		 System.out.println("The Password is:"+pw);
		 System.out.println("The Hidden Answer is:"+hide);
		 System.out.println("The Confirm PassPort is:"+confirmPw);
		 System.out.println("The Captcha is:"+capt);
		  
		 }
		  }
		 
		 
		 
		 
		 
