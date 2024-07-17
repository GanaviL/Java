class Bar
{
	
	static String wineBrands[] = {null, null, null, null, null, null, null, null,null, null, null, null,null,null,null};
	static int Index;
	public static boolean addWineBrands(String wineBrand)
	{
		boolean isWineBrandsCreated = false;
		System.out.println("addWineBrands started..!");
		if(wineBrand != null)
		{
			wineBrands[Index++] = wineBrand;
			isWineBrandsCreated = true;
		}else System.out.println("Wine Brands Name is null, cannot be null");
		
		
		System.out.println("addWineBrands ended..!");
		return isWineBrandsCreated;
		
	}
	
	public static void getAllBrands(){
		
		System.out.println("---------------------");
		
		System.out.println("Wine Brand Names Are : ");
		for(String wineBrand : wineBrands) 
			System.out.println(wineBrands);
		
	}
public static boolean updateWineBrand(String oldwineBrand , String newWineBrand)
{
	System.out.println("updateWineBrand Started");
	boolean isWineBrandUpdated = false;
	for(int index=0; index <wineBrands.length;index++){
		if(oldwineBrand == wineBrands[index]){
			wineBrands[index]=newWineBrand;
			isWineBrandUpdated=true;
		}
	}
	if(isWineBrandUpdated==false){
		System.out.println(oldwineBrand+"not found");
	}
	System.out.println("updateWineBrand ended");
	return isWineBrandUpdated;
}
public static boolean deleteWineBrands(String wineBrandsTobeDeleted){
	System.out.println("Delete Wine Brands Started");	
	boolean isWineBrandsDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <wineBrands.length;oldIndex++ ){
		if (wineBrands[oldIndex] != wineBrandsTobeDeleted){
			wineBrands[newIndex]=wineBrands[oldIndex];
			newIndex++;
			isWineBrandsDeleted=true;
		}
	}
	if(isWineBrandsDeleted==false){
		System.out.println(wineBrandsTobeDeleted +"not found");
	}
	System.out.println("Delete Wine Brands ended");
	return isWineBrandsDeleted;
}

}