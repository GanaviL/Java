class Textiles
{
	
	static String materials[] = {null, null, null, null, null, null, null, null,null, null, null, null,null,null};
	static int Index;
	public static boolean addMaterials(String material)
	{
		boolean isMaterialsCreated = false;
		System.out.println("add Materials started..!");
		if(material != null)
		{
			materials[Index++] = material;
			isMaterialsCreated = true;
		}else System.out.println("materials Name is null, cannot be null");
		
		
		System.out.println("add Materials ended..!");
		return isMaterialsCreated;
		
	}
	
	public static void getAllMaterialInfo(){
		
		System.out.println("---------------------");
		
		System.out.println("materials Names Are : ");
		for(String material : materials) 
			System.out.println(material);
		
	}
public static boolean updateMaterial(String oldMaterial , String newMaterial)
{
	System.out.println("update Material Started");
	boolean isMaterialUpdated = false;
	for(int index=0; index <materials.length;index++){
		if(oldMaterial  == materials[index]){
			materials[index]=newMaterial;
			isMaterialUpdated=true;
		}
	}
	if(isMaterialUpdated==false){
		System.out.println(oldMaterial +"not found");
	}
	System.out.println("update Material ended");
	return isMaterialUpdated;
}
public static boolean deleteMaterial(String materialTobeDeleted){
	System.out.println("Delete Material Started");	
	boolean isMaterialDeleted = false;
	int newIndex , oldIndex;
	for(oldIndex=0, newIndex=0; oldIndex <materials.length;oldIndex++ ){
		if (materials[oldIndex] != materialTobeDeleted){
			materials[newIndex]=materials[oldIndex];
			newIndex++;
			isMaterialDeleted=true;
		}
	}
	if(isMaterialDeleted==false){
		System.out.println(materialTobeDeleted +"not found");
	}
	System.out.println("Delete Material ended");
	return isMaterialDeleted;
}






}