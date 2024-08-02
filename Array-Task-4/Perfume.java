class Perfume {
   public static void main(String PerfumeData[]) {
        int[] perfumeIds = {1, 2, 3, 4};
        String[] brandNames = {"Bella Vita Luxury", "plum", "fogg", "Plum"};
        String[] quantity = {"80ml", "100ml", "50ml", "30ml"};
		String[] expiryDate = {"Feb 2025", "Jun 2024", "May 2025", "Jul 2024"};
		String[] idealFor = {"universal", "women", "men"};
         for (int i = 0; i < perfumeIds.length; i++) {
         System.out.println("Perfume ID: " + perfumeIds[i] + ", Brand: " + brandNames[i] + ", Quantity: " + quantity[i] + ", Expiry Date: " + expiryDate[i] + ", Ideal For: " + idealFor[i]);
        }
		 
        }
    }
	
	