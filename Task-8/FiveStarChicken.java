class FiveStarChicken{
public static double takeOrder(String foodName){
if (foodName == "Chilli Parma Chicken Popcorn"){
	return 99.00;
}
if (foodName == "Nashville Chicken"){
	return 100.00;
}
if (foodName == "Lemongrass Chicken"){
	return 150.00;
}
if (foodName == "Shaking Chicken"){
	return 116.00;
}
if (foodName == "Pio Pio Chicken"){
	return 100.00;
}
if (foodName == "Parmesan Chicken Sticks"){
	return 120.00;
}
if (foodName == "Black Pepper Chicken"){
	return 180.00;
}
if (foodName == "Singapore Chilli Chicken"){
	return 200.00;
}
if (foodName == "Honey Chicken Pepper"){
	return 100.00;
}
if (foodName == "Sesame Chicken Bites"){
	return 130.00;
}
if (foodName == "Classic Chicken Burger"){
	return 108.00;
}
if (foodName == "Chicken Tikka Club Sandwich"){
	return 145.00;
}
if (foodName == "Grilled Chicken n Cheese Multigrain Sub"){
	return 79.00;
}
if (foodName == "Greek Chicken SubWich"){
	return 120.00;
}
if (foodName == "Chicken Sausage"){
	return 95.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}