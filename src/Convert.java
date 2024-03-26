import java.util.Scanner;

public class Convert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Binary2Decimal Converter!");
		System.out.println("Rules: --> Only 0 and 1 are valid characters to enter. Maximum input length is 8.");
		System.out.println("Enter your binary string here:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		//return true if the input string contains character other than '0' and '1'
		if (!input.matches("[01]*")){
			throw new Exception ("Error! Binary input value may only contains '0' and/or '1'");
		}else if(input.length() > 8){
			throw new Exception ("Error! Only input with maximum length of 8 characters are allowed");
		}//check blank input case
		else if (input.isBlank()) {
			throw new Exception ("Error! Cannot convert a blank value!");
		}
		//converting
		String decimalValue = convert(input);
		
		System.out.println("Converting...");
		System.out.println("Result: " + decimalValue);
	}
	
	private static String convert(String input) {
		String output = null;
		//built in java method
		int value = Integer.parseInt(input, 2);
		output = Integer.toString(value);
		return output;
	};

}
