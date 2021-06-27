package ProjectW05;


public class SpacedLogger implements Logger{
//	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//	If the log method received “Hello” as an argument, it should print H e l l o
	
//	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		for(int i = 0; i < error.length() - 1; i++) {
			System.out.print(error.charAt(i) + " ");
		}System.out.println(error.charAt(error.length() - 1));
	
	}

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		for(int i = 0; i < log.length() - 1; i++) {
			System.out.print(log.charAt(i) + " ");
		}System.out.println(log.charAt(log.length() - 1));
	}

}
