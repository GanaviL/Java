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
   
     System.out.println("The Top 10 Movies are: \n"+ top10Movies[0]+"\n"+ top10Movies[1]+"\n"+ top10Movies[2]+"\n"+ top10Movies[3]+"\n"+ top10Movies[4]+"\n"+ top10Movies[5]+"\n"+ top10Movies[6]+"\n"+ top10Movies[7]+"\n"+ top10Movies[8]+"\n"+ top10Movies[9]+"\n");
   
	 System.out.println("The English Movies are: \n"+ englishMovies[0]+"\n"+ englishMovies[1]+"\n"+ englishMovies[2]+"\n"+ englishMovies[3]+"\n"+ englishMovies[4]+"\n"+ englishMovies[5]+"\n"+ englishMovies[6]+"\n"+ englishMovies[7]+"\n"+ englishMovies[8]+"\n"+ englishMovies[9]+"\n"+ englishMovies[10]+"\n"+ englishMovies[11]+"\n"+ englishMovies[12]+"\n"+ englishMovies[13]+"\n"+ englishMovies[14]+"\n"+ englishMovies[15]+"\n"+ englishMovies[16]+"\n"+ englishMovies[17]+"\n"+ englishMovies[18]+"\n"+ englishMovies[19]+"\n"+ englishMovies[20]+"\n"+ englishMovies[21]+"\n"+ englishMovies[22]+"\n"+ englishMovies[23]+"\n"+ englishMovies[24]+"\n");
	 
	 System.out.println("The Kannada Movies are: \n"+ kannadaMovies[0]+"\n"+ kannadaMovies[1]+"\n"+ kannadaMovies[2]+"\n"+ kannadaMovies[3]+"\n"+ kannadaMovies[4]+"\n"+ kannadaMovies[5]+"\n"+ kannadaMovies[6]+"\n"+ kannadaMovies[7]+"\n"+ kannadaMovies[8]+"\n"+ kannadaMovies[9]+"\n"+ kannadaMovies[10]+"\n"+ kannadaMovies[11]+"\n"+ kannadaMovies[12]+"\n"+ kannadaMovies[13]+"\n"+ kannadaMovies[14]+"\n"+ kannadaMovies[15]+"\n"+ kannadaMovies[16]+"\n"+ kannadaMovies[17]+"\n"+ kannadaMovies[18]+"\n"+ kannadaMovies[19]+"\n"+ kannadaMovies[20]+"\n"+ kannadaMovies[21]+"\n"+ kannadaMovies[22]+"\n"+ kannadaMovies[23]+"\n"+ kannadaMovies[24]+"\n");
	 
	 System.out.println("The Hindi Movies are: \n"+ hindiMovies[0]+"\n"+ hindiMovies[1]+"\n"+ hindiMovies[2]+"\n"+ hindiMovies[3]+"\n"+ hindiMovies[4]+"\n"+ hindiMovies[5]+"\n"+ hindiMovies[6]+"\n"+ hindiMovies[7]+"\n"+ hindiMovies[8]+"\n"+ hindiMovies[9]+"\n"+ hindiMovies[10]+"\n"+ hindiMovies[11]+"\n"+ hindiMovies[12]+"\n"+ hindiMovies[13]+"\n"+ hindiMovies[14]+"\n"+ hindiMovies[15]+"\n"+ hindiMovies[16]+"\n"+ hindiMovies[17]+"\n"+ hindiMovies[18]+"\n"+ hindiMovies[19]+"\n"+ hindiMovies[20]+"\n"+ hindiMovies[21]+"\n"+ hindiMovies[22]+"\n"+ hindiMovies[23]+"\n"+ hindiMovies[24]+"\n");
	 
	 System.out.println("The Korean Shows are: \n"+ koreanShows[0]+"\n"+ koreanShows[1]+"\n"+ koreanShows[2]+"\n"+ koreanShows[3]+"\n"+ koreanShows[4]+"\n"+ koreanShows[5]+"\n"+ koreanShows[6]+"\n"+ koreanShows[7]+"\n"+ koreanShows[8]+"\n"+ koreanShows[9]+"\n"+ koreanShows[10]+"\n"+ koreanShows[11]+"\n"+ koreanShows[12]+"\n"+ koreanShows[13]+"\n"+ koreanShows[14]+"\n"+ koreanShows[15]+"\n"+ koreanShows[16]+"\n"+ koreanShows[17]+"\n"+ koreanShows[18]+"\n"+ koreanShows[19]+"\n");
	 
        }
    }

	
	
	

	