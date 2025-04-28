package Calcolatrice;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*loops the calculator while has next double so it can do operations */ 
		while(scan.hasNextDouble()){
			
			if(!scan.hasNextDouble()) break;
			double num = scan.nextDouble();
			
			if(!scan.hasNext()) break;
			String sign = scan.next();
			
			if(!scan.hasNextDouble()) break;
			double num2 = scan.nextDouble();
			
			/*it sets the value of the result only if num2 isn't 
			0 because the divition will return infinity insted of impossible*/
			double result = operation(num, sign, num2);
			System.out.println((num2 == 0)? "Impossible": result);
			
			/*it checks if the the next isn't a double and it starts with a sign so if the user wants
			 continue to calculate. */
			while(!scan.hasNextDouble()){
				if(!scan.hasNext()) break;
				String sign1 = scan.next();
				if(!scan.hasNextDouble()) break;
				double num3 = scan.nextDouble();
				result = operation(result, sign1, num3);
				System.out.println((num3 == 0)? "Impossible": result);
			}
			
		}
		
		scan.close();
	}
	// this is the method that makes and returns operations
	static double operation(double num, String sign, double num2) {
		
		switch(sign) {
		case "+" -> {return num + num2;}
		case "-" -> {return num - num2;}
		case "/" -> {
			if(num2 == 0) {
				break;
			}
			else 
				return num / num2;
		}
		case "*" -> {return num * num2;}
		case "^" -> {return Math.pow(num, num2);}
		default -> {break;}
		}
		return 0;
		
	}
	

}
