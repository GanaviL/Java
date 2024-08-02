class Girias
{
	static String name = " ";
	static String ownerName = " ";
	
	static String homeAppliances[] = {null, null, null, null, null, null,null,null,null,null,null,null};
	static double chatPrices[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	static int priceIndex;
	static int homeApplianceIndex;
	public static boolean addHomeAppliance(String homeAppliance)
	{
		boolean isCreateHomeAppliance = false;
		System.out.println("addHomeAppliance started..!");
		if(homeAppliance != null)
		{
			homeAppliances[homeApplianceIndex++] = homeAppliance;
			isCreateHomeAppliance = true;
		}else System.out.println("Home Appliances is null, cannot be null");
		
		
		System.out.println("addHomeAppliance ended..!");
		return isCreateHomeAppliance;
		
	}
	public static boolean addHomeAppliancePrice(double homeAppliancePrice)
	{
		boolean isHomeApplianceAdded = false;
		System.out.println("addHomeAppliance started..!");
		if(homeAppliancePrice > 0.0)
		{
			homeAppliancePrices[priceIndex++] = homeAppliancePrice;
			isHomeAppliancePriceAdded = true;
		}else System.out.println("Home Appliance Price cannot be zero");
		
		
		System.out.println("addHomeAppliancePrice ended..!");
		return isHomeAppliancePriceAdded;
		
	}

	public static void getHomeAppliance(){
		
		System.out.println("Home Appliance Are : ");
		for(String homeAppliance : homeAppliances) System.out.println(homeAppliance);
		}
		
		public static void getHomeAppliancePrice(){
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Home Appliance Are : ");
		for(double homeAppliancePrice : homeAppliancePrices) System.out.println(homeAppliancePrice);
		
	}
	
}