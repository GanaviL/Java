class GoldShopRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = GoldShop.addGoldShop("Ring");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Bracelet");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Bangle");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Earring");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Pendant");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Necklace");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = GoldShop.addGoldShop("Choker");
		System.out.println("is Appliance Added : " + isAdded);
		
		GoldShop.getAllGoldItems();
	boolean newGoldShopUpdate=GoldShop.updateGoldItem("Choker","Figurine");
	GoldShop.getAllGoldItems();
	
	boolean goldItemTobeDeleted=GoldShop.deleteGoldItem("Head Phone");
	GoldShop.getAllGoldItems();
	}


}