class Zamato{
public static double takeOrder(String foodName){
	
	
if (foodName == "High Protein"){
	return 99.00;
}
if (foodName == "Great Brit"){
	return 120.00;
}
if (foodName == "Full English Breakfast"){
	return 170.00;
}
if (foodName == "Smoked Sausage with Hashbrown"){
	return 116.00;
}
if (foodName == "Cheese French Toast"){
	return 100.00;
}
if (foodName == "Classic French Toast Combo"){
	return 120.00;
}
if (foodName == "Scrambled Egg Sausage"){
	return 180.00;
}
if (foodName == "Coach Breakfast"){
	return 200.00;
}
if (foodName == "Paneer Power Breakfast"){
	return 100.00;
}
if (foodName == "Masala omelette"){
	return 130.00;
}
if (foodName == "Meaty omelette"){
	return 108.00;
}
if (foodName == "High Protein Chicken Omelette"){
	return 145.00;
}
if (foodName == "Chicken Maryland"){
	return 179.00;
}
if (foodName == "Signature Roast Chicken Rice Bowl"){
	return 120.00;
}
if (foodName == "Paneer Tikka Rice BoWl"){
	return 195.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}