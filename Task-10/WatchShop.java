class WatchShop
{
	
	static String watchBrandNames[] = {null, null, null, null, null, null, null, null,null, null, null, null};
	static int Index;
	public static boolean addWatchBrandNames(String watchBrandName)
	{
		boolean isWatchBrandNamesCreated = false;
		System.out.println("addWatchBrandName started..!");
		if(watchBrandName != null)
		{
			watchBrandNames[Index++] = watchBrandName;
			isWatchBrandNamesCreated = true;
		}else System.out.println("Equipment Name is null, cannot be null");
		
		
		System.out.println("addwatchBrandNames ended..!");
		return isWatchBrandNamesCreated;
		
	}
	
	public static void getAllWatchBrands(){
		
		System.out.println("---------------------");
		
		System.out.println("Watch Brand Names Are : ");
		for(String watchBrandName : watchBrandNames) 
			System.out.println(watchBrandName);
		
	}
public static boolean updateWatchBrands(String oldWatchBrandName , String newWatchBrandName)
{
	System.out.println("updateWatchBrands Started");
	boolean isWatchBrandsUpdated = false;
	for(int index=0; index <watchBrandNames.length;index++){
		if(oldWatchBrandName == watchBrandNames[index]){
			watchBrandNames[index]=newWatchBrandName;
			isWatchBrandsUpdated=true;
		}
	}
	if(isWatchBrandsUpdated==false){
		System.out.println(oldWatchBrandName+"not found");
	}
	System.out.println("updateWatchBrands ended");
	return isWatchBrandsUpdated;
}
public static boolean deleteWatchBrandNames(String watchBrandNamesTobeDeleted){
	System.out.println("Delete Watch Brand Names Started");	
	boolean isWatchBrandNamesDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <watchBrandNames.length;oldIndex++ ){
		if (watchBrandNames[oldIndex] != watchBrandNamesTobeDeleted){
			watchBrandNames[newIndex]=watchBrandNames[oldIndex];
			newIndex++;
			isWatchBrandNamesDeleted=true;
		}
	}
	if(isWatchBrandNamesDeleted==false){
		System.out.println(watchBrandNamesTobeDeleted +"not found");
	}
	System.out.println("Delete watch Brand Names ended");
	return isWatchBrandNamesDeleted;
}
}