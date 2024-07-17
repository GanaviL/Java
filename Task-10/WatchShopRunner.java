class WatchShopRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = WatchShop.addWatchBrandNames("Rolex");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("Longines");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("Gucci");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("Patek Philippe");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("Tissot");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("Apple Inc");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = WatchShop.addWatchBrandNames("TAG Heuer");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = WatchShop.addWatchBrandNames("Audemars Piguet");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = WatchShop.addWatchBrandNames("Omega");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = WatchShop.addWatchBrandNames("Montblanc");
		System.out.println("is Appliance Added : " + isAdded);
		
		WatchShop.getAllWatchBrands();
		
	boolean newWatchBrandNameUpdate=WatchShop.updateWatchBrands("Montblanc","Audemars Piguet");
	WatchShop.getAllWatchBrands();
	
	boolean watchBrandNamesTobeDeleted=WatchShop.deleteWatchBrandNames("Head Phone");
	WatchShop.getAllWatchBrands();
	}


}