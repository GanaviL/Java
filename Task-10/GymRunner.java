class GymRunner
{

	public static void main(String gym[])
	{
	
		boolean isAdded = Gym.addEquipmentName("Dumbbells");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("TreadMill");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("Bikes");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("Elliptical");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("Pull-up bars");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("chest press");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Gym.addEquipmentName("Biceps curl");
		System.out.println("is Appliance Added : " + isAdded);
		
		Gym.getEquipmentName();
	boolean newEquipmentNameUpdate=Gym.updateEquipmentName("Bikes","Free Weights");
	Gym.getEquipmentName();
	
	boolean equipmentNameTobeDeleted=Gym.deleteEquipmentName("Pull-up bars");
	Gym.getEquipmentName();
	}


}