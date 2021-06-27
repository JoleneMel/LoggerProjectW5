package ProjectW05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a class named App that has a main method.
		
//		In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//		Test both methods on both instances, passing in Strings of your choice.
		Logger asteriskLogger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.error("Hello");
		asteriskLogger.log("Hello");
		
		asteriskLogger.error("Pandas and Ice Bears");
		asteriskLogger.log("Kittens");
		
		spacedLogger.error("Hello");
		spacedLogger.log("Hello");
		
		spacedLogger.error("Ramen");
		spacedLogger.log("Dragons");
		
		

	}

}
