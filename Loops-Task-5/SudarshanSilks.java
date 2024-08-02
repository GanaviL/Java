class SudarshanSilks {
      static String silkSarees[] ={silkName, silkName1, silkName2};
      static String silkName = "Banaras Silks";
      static String silkName1 = "Mysore Silks";
      static String silkName2 = "kanchi Silks";
       public static void main(String []silks) {
       System.out.println("The Silks Sarees Available are :"+ silkSarees.length);
        for(String silkSareesName : silkSarees){
	    System.out.println(silkSareesName);
         }
       }
} 