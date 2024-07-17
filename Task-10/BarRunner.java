class BarRunner
{

	public static void main(String shop[])
	{
	
	    boolean isAdded = Bar.addWineBrands("King Estate Winery");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Giant Steps");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Naveran");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Inniskillin");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("G. B. Burlotto");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Krone");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("J Vineyards & Winery");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Alta Alella");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Tooth & Nail");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Jax");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Trig Point");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Bar.addWineBrands("Château Eugénie");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Frescobaldi");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Tatomer");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Montes");
		System.out.println("is Appliance Added : " + isAdded);
		
		Bar.getAllBrands();
		
	boolean isWineBrandUpdated=Bar.updateWineBrand("Montes","Baca");
	Bar.getAllBrands();
	
	boolean wineBrandsTobeDeleted=Bar.deleteWineBrands("Château Eugénie");
	Bar.getAllBrands();
	}


}