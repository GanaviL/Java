class Dmart {
   static String chocolates[] = {"kit kat", "Dairy Milk", "Snickers", "Milky bar"};
   static String perfumesName[] = {"Bella Vita Luxury", "Plum", "Fogg", "Plum"};
   static String fruits[] = {"Citrus Fruits", "Berries", "Mango", "Pineapple"};
   static String vegetables[] = {"Potato", "Tomato", "Radish", "Lady’s finger"};
   static String kitchenItems[] = {"Knives", "Cookware", "Dinnerware", "Kitchen Tools"};
   static String bags[] = {"carpet bag", "Duffel bag", "Hobo bag", "Kelly bag"};
      public static void main(String[] newCollection) {
	   System.out.println("The Avaiable Chocolates are:"+ chocolates.length);
	   for (int index =0; index<=chocolates.length-1 ; index++){
		   System.out.println(chocolates[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Perfumes are:");
	   for(String perfumesName :perfumesName ){
		   System.out.println(perfumesName);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Fruits are:");
       for (int index =0; index<=fruits.length-1; index++){
		   System.out.println(fruits[index]);
	   }
	   System.out.println("-------------------------------");
	   System.out.println("The Avaiable Vegetables are:");
	 for(String vegetables:vegetables ){
		   System.out.println(vegetables);
	   }
	 System.out.println("-------------------------------");
	 System.out.println("The Avaiable KitchenItems are:");
	 for (int index =0; index<=kitchenItems.length-1 ; index++){
		   System.out.println(kitchenItems[index]);
	 }
	 System.out.println("-------------------------------");
	 System.out.println("The Avaiable Bags are:");
	 for(String bags:bags ){
		   System.out.println(bags);
	 }
	 
	  }
}	  