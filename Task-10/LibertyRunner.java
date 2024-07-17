class LibertyRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = Liberty.addShoeBrands("Adidas");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Bata Corporation");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Berluti");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Alexander McQueen");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Bearpaw");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Birkenstock");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Asics");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Ben Sherman");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Camper");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Cole Haan");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Crocs");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Fila");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("Columbia Sportswear");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Liberty.addShoeBrands("Converse");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Liberty.addShoeBrands("ECCO");
		System.out.println("is Appliance Added : " + isAdded);
		
		
		Liberty.getAllShoeBrands();
	boolean newShoeBrandUpdate=Liberty.updateShoeBrand("ECCO","Hi-Tec");
	Liberty.getAllShoeBrands();
	
	boolean shoeBrandsTobeDeleted=Liberty.deleteShoeBrands("Head Phone");
	Liberty.getAllShoeBrands();
	}


}