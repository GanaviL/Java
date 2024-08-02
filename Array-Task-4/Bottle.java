class Bottle {
   public static void main(String[] args) {
		 int[] bottleIds = {1, 2, 3, 4};
         String[] brandNames = {"Aquafina", "Bisleri", "Kinley", "Evian"};
         String[] colors = {"Blue", "Green", "Clear", "Pink"};
	     String[] types = {"glass", "clay", "plastic", "aluminum"};
	     String[] storageCapacity = {"1-liters", "2-liters", "3-liters", "4-liters"};
		 for (int i = 0; i <=bottleIds.length; i++) {
         System.out.println("Bottle ID: " + bottleIds[i] + ", Brand: " + brandNames[i] + ", Color: " + colors[i] + ", Type: " + types[i] + ", Storage Capacity: " + storageCapacity[i]);
        }
		 
        }
    }
	
	