class GoldShop
{
	
	static String goldItem[] = {null, null, null, null, null, null, null};
	static int Index;
	public static boolean addGoldItem(String goldItem)
	{
		boolean isGoldItemCreated = false;
		System.out.println("addGoldItem started..!");
		if(goldItem != null)
		{
			goldItems[Index++] = goldItem;
			isGoldItemCreated = true;
		}else System.out.println("Gold Item Name is null, cannot be null");
		
		
		System.out.println("addGoldItem ended..!");
		return isGoldItemCreated;
		
	}
	
	public static void getAllGoldItems(){
		
		System.out.println("---------------------");
		
		System.out.println("Gold Item Name Are : ");
		for(String goldItem : goldItems) 
			System.out.println(goldItem);
		
	}
public static boolean updateGoldItem(String oldGoldItem , String newGoldItem)
{
	System.out.println("updateGoldItem Started");
	boolean isGoldItemUpdated = false;
	for(int index=0; index <goldItems.length;index++){
		if(oldGoldItem == goldItems[index]){
			goldItems[index]=newGoldItem;
			isGoldItemUpdated=true;
		}
	}
	if(isGoldItemUpdated==false){
		System.out.println(oldGoldItem+"not found");
	}
	System.out.println("updateGoldItem ended");
	return isGoldItemUpdated;
}
public static boolean deleteGoldItem(String goldItemTobeDeleted){
	System.out.println("Delete Gold Item Started");	
	boolean isGoldItemDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <goldItem.length;oldIndex++ ){
		if (goldItem[oldIndex] != goldItemTobeDeleted){
			goldItem[newIndex]=goldItem[oldIndex];
			newIndex++;
			isGoldItemDeleted=true;
		}
	}
	if(isGoldItemDeleted==false){
		System.out.println(goldItemTobeDeleted +"not found");
	}
	System.out.println("Delete Gold Item ended");
	return isGoldItemDeleted;
}
}