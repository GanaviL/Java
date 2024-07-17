class Liberty
{
	
	static String shoeBrands[] = {null, null, null, null, null, null, null, null,null, null, null, null,null,null,null};
	static int Index;
	public static boolean addShoeBrands(String shoeBrand)
	{
		boolean isShoeBrandsCreated = false;
		System.out.println("addshoeBrand started..!");
		if(shoeBrand != null)
		{
			shoeBrands[Index++] = shoeBrand;
			isShoeBrandsCreated = true;
		}else System.out.println("shoe Brands Name is null, cannot be null");
		
		
		System.out.println("add Shoe Brands ended..!");
		return isShoeBrandsCreated;
		
	}
	
	public static void getAllShoeBrands(){
		
		System.out.println("---------------------");
		
		System.out.println("Shoe Brands Names Are : ");
		for(String shoeBrand : shoeBrands) 
			System.out.println(shoeBrand);
		
	}
public static boolean updateShoeBrand(String oldShoeBrand , String newShoeBrand)
{
	System.out.println("updateShoeBrand Started");
	boolean isShoeBrandUpdated = false;
	for(int index=0; index <shoeBrands.length;index++){
		if(oldShoeBrand  == shoeBrands[index]){
			shoeBrands[index]=newShoeBrand;
			isShoeBrandUpdated=true;
		}
	}
	if(isShoeBrandUpdated==false){
		System.out.println(oldShoeBrand +"not found");
	}
	System.out.println("updateShoeBrand ended");
	return isShoeBrandUpdated;
}
public static boolean deleteShoeBrands(String shoeBrandsTobeDeleted){
	System.out.println("Delete Shoe Brands Started");	
	boolean isShoeBrandsDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <shoeBrands.length;oldIndex++ ){
		if (shoeBrands[oldIndex] != shoeBrandsTobeDeleted){
			shoeBrands[newIndex]=shoeBrands[oldIndex];
			newIndex++;
			isShoeBrandsDeleted=true;
		}
	}
	if(isShoeBrandsDeleted==false){
		System.out.println(shoeBrandsTobeDeleted +"not found");
	}
	System.out.println("Delete Shoe Brands ended");
	return isShoeBrandsDeleted;
}
}