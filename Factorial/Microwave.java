class Microwave
{
	static boolean isConnected;
	static int currentMicrowaveTemperature;
	static int minMicrowaveTemperature;
	static int maxMicrowaveTemperature = 6; 
	
	public static void onOrOff()
	{
		System.out.println("onOrOff() started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Microwave Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Microwave Turned off");
		}
		System.out.println("onOrOff() ended"); 
		return;
	}
	
	public static void increaseMicrowaveTemperature()
	{
		System.out.println("increaseMicrowaveTemperature() started");
		if(isConnected == true)
		{
			if(currentMicrowaveTemperature < maxMicrowaveTemperature)
			{
				currentMicrowaveTemperature = currentMicrowaveTemperature + 1;
				System.out.println("The current Microwave Temperature is " + currentMicrowaveTemperature);
			}else
			{
				System.out.println("Microwave Max Temperature Reached");
			}
		}else
		{
			System.out.println("Gubee... Microwave na On Maadu...");
		}
		
		System.out.println("increaseMicrowaveTemperature() ended");
		return ;
		
	}


}