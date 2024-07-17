class TextilesRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = Textiles.addMaterials("Cotton");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Linen");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Silk");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Wool");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Polyester");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Rayon");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Hemp");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Acetate");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Bamboo Fabric");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Boucle");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Faux Fur");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Gabardine Fabrin");
		System.out.println("is Textiles Added : " + isAdded);
		
		isAdded = Textiles.addMaterials("Georgette");
		System.out.println("is Textiles Added : " + isAdded);
		
		 isAdded = Textiles.addMaterials("Hessian");
		System.out.println("is Textiles Added : " + isAdded);
		
		
		
		Textiles.getAllMaterialInfo();
	boolean newMaterialUpdate=Textiles.updateMaterial("Hessian","Jute");
	Textiles.getAllMaterialInfo();
	
	boolean materialTobeDeleted=Textiles.deleteMaterial("Georgette");
	Textiles.getAllMaterialInfo();
	}


}