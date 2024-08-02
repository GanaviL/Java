class  SportsMania {
   static String iplTeamNames[] = {"Chennai Super Kings (CSK)", "Delhi Capitals (DC)", "Gujarat Titans (GT)", "Kolkata Knight Riders (KKR)", "Lucknow Super Giants (LSG)", "Mumbai Indians", "Punjab Kings" , "Rajasthan Royals", "Royal Challengers Bengaluru", "Sunrisers Hyderabad"};
   
   static String top10BatsMen[] = {"Kane Williamson", "Joe Root", "Babar Azam", "Daryl Mitchell", "Steven Smith", "Rohit Sharma", "Yashasvi Jaiswal" , "Dimuth Karunaratne", "Virat Kohli", "Harry Brook"};
   
   static String top10Bowlers[] = {"Darren Tang", "Francois Lavoie", "Sean Rash", "Kyle Troup", "Jesper Svensson", "Kristopher Prather", "Anthony Simonsen" , "EJ Tackett", "Bill O’Neill", "Jason Belmonte"};
   
   static String top10lccTeamNames[] ={"Australia", "INDIA", "ENGLAND", "SOUTH AFRICA", "NEW ZEALAND", "WEST INDIES", "AFGHANISTAN" , "IRELAND", "AFGHANISTAN", "BANGLADESH"};
   
   public static void main(String[] collection) {
       System.out.println("The Avaiable IPL Team Names are:");
	   for (int index =0; index<=iplTeamNames.length-1 ; index++){
		   System.out.println(iplTeamNames[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Top 10 BatsMen are:");
	   for(String top10BatsMen :top10BatsMen ){
		   System.out.println(top10BatsMen);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Top 10 Bowlers are:");
       for (int index =0; index<=top10Bowlers.length-1 ; index++){
		   System.out.println(top10Bowlers[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Top 10 ICC TeamNames are:");
	 for(String top10lccTeamNames:top10lccTeamNames ){
		   System.out.println(top10lccTeamNames);
	   }  
 
        }
    }

	
	
	

	