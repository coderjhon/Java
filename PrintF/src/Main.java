
public class Main 
{
	public static void main(String[] args) 
	{
		
		// printf() = an option method to control, format, and display text to the console window
		//			 two arguments = format string + (object/variable/value)
		//			 % [flag] [precision] [width] [conversion-character]
		//			%d = decimal numbers %b boolean
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Jhon";
		int myInt = 50;
		double myDouble = 1000;
	
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of charcters to be written as output
		//System.out.printf("Hello %10s", myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f", myDouble);
		
		//[flag]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : out put a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
	}
}