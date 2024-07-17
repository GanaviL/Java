class Girias
{
	
	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null,null, null, null};
	static int Index;
	public static boolean addHomeAppliance(String homeAppliance)
	{
		boolean isHomeApplianceCreated = false;
		System.out.println("addHomeAppliance started..!");
		if(homeAppliance != null)
		{
			homeAppliances[Index++] = homeAppliance;
			isHomeApplianceCreated = true;
		}else System.out.println("Home Appliance is null, cannot be null");
		
		
		System.out.println("addHomeAppliance ended..!");
		return isHomeApplianceCreated;
		
	}
	
	public static void getHomeAppliance(){
		
		System.out.println("---------------------");
		
		System.out.println("Home Appliance Are : ");
		for(String homeAppliance : homeAppliances) 
			System.out.println(homeAppliance);
		
	}
public static boolean updateHomeAppliance(String oldHomeAppliance , String newHomeAppliance)
{
	System.out.println("updateHomeAppliance Started");
	boolean isHomeApplianceUpdated = false;
	for(int index=0; index <homeAppliances.length;index++){
		if(oldHomeAppliance == homeAppliances[index]){
			homeAppliances[index]=newHomeAppliance;
			isHomeApplianceUpdated=true;
		}
	}
	if(isHomeApplianceUpdated==false){
		System.out.println(oldHomeAppliance+"not found");
	}
	System.out.println("updateHomeAppliance ended");
	return isHomeApplianceUpdated;
}
public static boolean deleteHomeAppliance(String homeAppliancesTobeDeleted){
	System.out.println("Delete Home Appliance Started");	
	boolean isHomeApplianceDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <homeAppliances.length;oldIndex++ ){
		if (homeAppliances[oldIndex] != homeAppliancesTobeDeleted){
			homeAppliances[newIndex]=homeAppliances[oldIndex];
			newIndex++;
			isHomeApplianceDeleted=true;
		}
	}
	if(isHomeApplianceDeleted==false){
		System.out.println(homeAppliancesTobeDeleted +"not found");
	}
	System.out.println("Delete Home Appliance ended");
	return isHomeApplianceDeleted;
}
}