
public class ConsoleApplication {
	
//	Check if there are any command line arguments passed to the application


	public static void main(String[] commandLineArguments) {
//		If there is, print the message “Arguments: <length>” - replacing length with the actual number of arguments
//		If there is, print the arguments to the screen
		if(commandLineArguments.length < 0) {
			System.out.println(commandLineArguments.length);
		}else {
//			If there is no arguments, display, “Hello World” to the screen. 
			
			System.out.println("Hello World");
		}
//		Create a string variable and display it to screen
		String x = "String";
		System.out.println(x);
//		Create an integer variable and display it to screen
		int y = 5;
		System.out.println(y);
//		Create a variable without assigning the value, then assign the value later and display it to screen
		int z;
		z = 8;
		System.out.println(z);
//		Overwrite an existing value and display it to screen
		x = "changed";
		y = 100;
		z = 400;
		System.out.println(x + (y + z));
		
//		Copy a variable and display it to screen
		x = "changed";
		y = 100;
		z = 400;
		System.out.println(x + (y + z));
//		Create a final variable (read only) and display it to screen
		final int f = 3;
		System.out.println(f);
//		Add a variable to another and display it to screen
		System.out.println(f + z);
//		Create a byte type and display it to screen
		byte a = 1;
		System.out.println(a);
//		Create a short type and display it to screen
		short b = 11;
		System.out.println(b);
//		Create an int type and display it to screen
		int c = 111;
		System.out.println(c);
//		Create a long type and display it to screen
		long d = 1111;
		System.out.println(d);
//		Create a float type and display it to screen
		float g = 11111;
		System.out.println(g);
//		Create a double type and display it to screen
		double h = 111111;
		System.out.println(h);
//		Create a boolean type and display it to screen
		boolean i = true;
		System.out.println(i);
//		Create a char type and display it to screen
		char j = 12345;
		System.out.println(j);
		
		
	}
	

}
