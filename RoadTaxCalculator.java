class RoadTaxCalculator{
	public static void main(String args[]){
	String stateName = "J&K";
	int vehiclePrice = 200;
	int tax;
	
switch(stateName){
	case "KA" : System.out.println("This vehicle belongs to karnataka");
	tax = vehiclePrice/18*100;	
	System.out.println("The tax for karnataka is " + tax);
	break;
	case "TL" : System.out.println("This vehicle belongs to Tamilnadu");
	tax = vehiclePrice/20*100;	
	System.out.println("The tax for karnataka is " + tax);
	break;
	case "AP" : System.out.println("This vehicle belongs to Andrapradesh");
	tax = vehiclePrice/22*100;	
	System.out.println("The tax for karnataka is " + tax);
	break;
	case "KL" : System.out.println("This vehicle belongs to Kerla");
	tax = vehiclePrice/25*100;	
	System.out.println("The tax for karnataka is " + tax);
		
	break;
	case "UP" : System.out.println("This vehicle belongs to UttarPradesh");
	tax = vehiclePrice/15*100;	
	System.out.println("The tax for karnataka is " + tax);
		
	break;
	case "MP" : System.out.println("This vehicle belongs to MadhyaPradesh");
	tax = vehiclePrice/10*100;	
	System.out.println("The tax for karnataka is " + tax);
		
	break;
	default: System.out.println("This vehicle doesnot belongs to Karnataka, Tamilnadu, Andrapradesh, Kerla, Uttarpradesh, Madhyapradesh");

}
}
}