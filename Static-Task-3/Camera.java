class Camera {
			static int price = 65489;
	  static String brandName = "SONY" ;
      static String color = "Black" ;
	  static String modelNumber = "ILCE-6400 APS-C";
	  static String modelName = "ILCE-6400";
	  static String series = "Alpha";
	  static String ports = "USB 2.0 Micro-B, HDMI D (Micro) Port, Microphone Port, Wired Remote Port" ;
	  static boolean isAutoFocus = true ;
    public static void main(String cameraData[]){
      System.out.println("------------------------------");
	  System.out.println("Model Name : " + modelName);
	  System.out.println("Model Number : " + modelNumber);
	  System.out.println("Price : " + price);
	  System.out.println("Brand Name : " + brandName);
      System.out.println("Color : " + color );
	  System.out.println("Series : " + series );
      System.out.println("Ports : " + ports);
	  System.out.println("Auto Focus : " + isAutoFocus);
      System.out.println("------------------------------");
     }
}



