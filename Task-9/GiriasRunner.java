class GiriasRunner
{

	public static void main(String giri[])
	{
	
		boolean isAdded = Girias.addHomeAppliance("Washing Machine");
		System.out.println("is Home Appliance Added : " + isAdded);
		boolean isPriceAdded = Girias.addHomeAppliancePrice(1000.0);
		System.out.println("is Home Appliance Price Added : " + isPriceAdded);
		
		isAdded = Girias.addHomeAppliance("Celling Fan");
		System.out.println("is Home Appliance Added : " + isAdded);
		isPriceAdded = Girias.addHomeAppliancePrice(800.0);
		System.out.println("is Home Appliance Added : " + isPriceAdded);
		
		
		isAdded = Girias.addHomeAppliance("Cutting board");
		System.out.println("is Home Appliance Added : " + isAdded);
		isPriceAdded = Girias.addHomeAppliancePrice(450.0);
		System.out.println("is Home Appliance Price Added : " + isPriceAdded);
		
		
		isAdded = Girias.addHomeAppliance("Space Headter");
		System.out.println("is Home Appliance : " + isAdded);
		isPriceAdded = Girias.addHomeAppliancePrice(500.0);
		System.out.println("is Home Appliance Price Added : " + isPriceAdded);
		
		
		isAdded = Girias.addHomeAppliance("Slow Cooker");
		System.out.println("is Home Appliance : " + isAdded);
		isPriceAdded = Girias.addHomeAppliancePrice(600.0);
		System.out.println("is Home Appliance Added : " + isPriceAdded);
		
		isAdded = Girias.addHomeAppliance("Desk Lamp");
		System.out.println("is Home Appliance Added : " + isAdded);
		isPriceAdded = Girias.addHomeAppliancePrice(600.0);
		System.out.println("is Home Appliance Added : " + isPriceAdded);
		
		Girias.getHomeAppliance();
		Girias.getHomeAppliancePrice();
	
	}


}