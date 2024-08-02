class  Netflix {
   static String top10Movies[] = {"Atlas", "Colors of Evil: Red", "Crew", "Ice Age: Collision Course", "Dawn of the Dinosaurs", "Godzilla Minus One", "Bionic" , "Transformers: Rise of the Beasts", "Mother of the Bride", "In Good Hands 2"};
   
   static String englishMovies[] = {"Bridgerton", "Apollo 13", "The Breakfast Club", "Dumb and Dumber", "The Flintstones", "Monty Python's Life of Brian", "Monty Python and the Holy Grail", "Richard Pryor: Live in Concert", "Rocky", "Rocky II", 
   "Rocky IV", "Silverado", "L.A.Confidential", "Starship Troopers", "The Matrix", "Love & Basketball", "Steel Magnolias", "Jurassic Park", "The Lost World: Jurassic Park", "Jurassic Park III", "Alice Doesn't Live Here Anymore", "Jackie Brown", "Shrek",
   "The Fast and the Furious", "Black Hawk Down"}; 
   
   static String kannadaMovies[] = {"Govinda Govinda", "Minchu Murali", "Nathicharami", "U-Turn", "Mundina Nildana", "Ayana", "Nathicharami", "Thithi", "Ondu Motteya Kathe", "Avane Srimannarayana", 
   "Kavalu Daari ", "Katheyondu Shuruvagide", "Dia", "Love Mocktail", "Gantumoote", "Katha Sangama", "KGF", "Yajamana", "Humble Politician Nograj", "Chambal", "Sarkari Hi Pra Shaale Kasaragodu", "Mungaru Male", "Blink",
   "Ondu Sarala Premakathe", "kerebete"}; 
   
   static String hindiMovies[] ={"The Lunchbox", "Zindagi Na Milegi Dobara", "Yeh Jawaani Hai Deewani", "Taare Zameen Par", "Barfi", "Swades", "Wake Up Sid", "Special 26", "Queen", "Drishyam", 
   "Pink", "Baahubali", "Baahubali2", "PK", "Masaan", "Sanju", "No One Killed Jessica", "Mimi", "Bareilly ki Barfi", "Pad Man", "Mom", "Udta Punjab", "Dear Zindagi",
   "Madras Cafe", "Margarita With A Straw"};
   
   static String koreanShows[] = {"Crash Landing on You", "Extraordinary Attorney Woo", "Squid Game", "Kingdom", "Hellbound", "Our Beloved Summer", "Boys Over Flowers", 
   "A Killer Paradox", "Parasyte: The Grey", "Business Proposal", "All of Us Are Dead", "D.P.", "Physical: 100", "Twenty-Five Twenty-One", "It's Okay to Not Be Okay", "Hometown Cha-Cha-Cha", "Little Women", "Mr. Sunshine", "Sweet Home", "A Time Called You"};
   
   public static void main(String[] collection) {
	   System.out.println("The Avaiable Top 10 Movies are:");
	   for (int index =0; index<=top10Movies.length-1 ; index++){
		   System.out.println(top10Movies[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable English Movies are:");
	   for(String englishMovies :englishMovies ){
		   System.out.println(englishMovies);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Kannada Movies are:");
       for (int index =0; index<=kannadaMovies.length-1 ; index++){
		   System.out.println(kannadaMovies[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable HindiMovies are:");
	 for(String hindiMovies:hindiMovies ){
		   System.out.println(hindiMovies);
	   }
	 System.out.println("-------------------------------");
	 System.out.println("The Avaiable Korean Shows are:");
	 for (int index =0; index<=koreanShows.length-1 ; index++){
		   System.out.println(koreanShows[index]);
	 }
     
        }
    }

	
	
	

	