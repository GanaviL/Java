class AeroPlane {
   public static void main(String aeroPlaneData[]) {
        int[] aeroPlaneIds = {101,102, 103};
        String[] source =  {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        String[] destination = {"London", "Paris", "Tokyo", "Beijing", "Delhi"};
		String[] airLineName = {"Air India", "SpiceJet", "IndiGo", "Vistara", "GoAir"};
		String[] pilotName = {"Check pilot", "Private pilot"};
		int[] noOfSeats = {180, 150, 200};
         for (int i = 0; i < aeroPlaneIds.length; i++) {
         System.out.println("AeroPlane ID: " + aeroPlaneIds[i] + ", Source: " + source[i] + ", Destination: " + destination[i] + ", Air Line Name: " + airLineName[i] + ", Pilot Name: " + pilotName[i] + ",  No Of Seats: " +  noOfSeats[i]);
        }
		 
        }
    }
	
	