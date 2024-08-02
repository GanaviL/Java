class Dominos{
public static double takeOrder(String foodName){
if (foodName == "Pizza"){
	price =99.00;
	return price;
}
if (foodName == "Burger"){
	price= 100.00;
	return price;
}
if (foodName == "Desserts"){
	price= 150.00;
	return price;
}
if (foodName == "Pasta"){
	price =116.00;
	return price;
}
if (foodName == "Garlic Breadsticks"){
	price= 100.00;
	else System.out.println(foodName+"Not Found");
	return price;
}
if (foodName == "Stuffed Garlic Bread"){
	price= 120.00;
	return price;
}
if (foodName == "Paneer Tikka"){
	price= 180.00;
	return price;
}
if (foodName == "Chicken Pepperoni"){
	price= 200.00;
	return price;
}
if (foodName == "Veg Toppings"){
	price= 100.00;
	return price;
}
if (foodName == "Extra Cheese"){
	price= 130.00;
	return price;
}
if (foodName == "Chicken Wings"){
	price= 108.00;
	return price;
}
if (foodName == "Fresh Veggie"){
	price= 145.00;
	return price;
}
public static double takeOrder(String foodName,int quantity){
	double price=0.0;
if (foodName == "Cheese N corn"){
	price= 79.00 * quantity;
	return price;
}
}
}