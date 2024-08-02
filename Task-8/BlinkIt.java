class BlinkIt{
public static double takeOrder(String foodName){
if (foodName == "Smoke that SuperBowl"){
	return 99.00;
}
if (foodName == "Summer Glow SuperBowl"){
	return 100.00;
}
if (foodName == "Soboro Don SuperBowl"){
	return 150.00;
}
if (foodName == "Chicken Cafe De Paris"){
	return 116.00;
}
if (foodName == "Paneer Makhani Thali"){
	return 100.00;
}
if (foodName == "Butter Chicken"){
	return 120.00;
}
if (foodName == "Chicken Tikka Masala Thali"){
	return 180.00;
}
if (foodName == "Chicken Pasta AI Limone"){
	return 200.00;
}
if (foodName == "Chicken Spaghetti AI Forno"){
	return 100.00;
}
if (foodName == "Espagnole Spaghetti"){
	return 130.00;
}
if (foodName == "Cheesy Peri Peri Chicken Spaghetti"){
	return 108.00;
}
if (foodName == "Classic Spaghetti Meatballs"){
	return 145.00;
}
if (foodName == "Mafias Meal"){
	return 79.00;
}
if (foodName == "Penne Arrabbiata"){
	return 120.00;
}
if (foodName == "Mac and Cheese Platter"){
	return 95.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}