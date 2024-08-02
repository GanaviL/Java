class GymRunner{

public static void main(String gym[]){
    
	boolean addvalue = Gym.createGymEquipments("Dambbell");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("Barbell");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("Power rack");
	System.out.println(addvalue);
	addvalue = Gym.createGymEquipments("Weight plate");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("Smith machine");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("Leg press");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("Bench");
	System.out.println(addvalue);	
	addvalue = Gym.createGymEquipments("T-bar");
	System.out.println(addvalue);	
	Gym.getGymEquipments();
	}
	}