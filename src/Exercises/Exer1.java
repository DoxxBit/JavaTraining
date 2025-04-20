package Exercises;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextDouble()){
			
			if(!scan.hasNextDouble()) break;
			double num = scan.nextDouble();
			
			if(!scan.hasNext()) break;
			String sign = scan.next();
			
			if(!scan.hasNextDouble()) break;
			double num2 = scan.nextDouble();
			
			double result = operation(num, sign, num2);
			System.out.println((num2 == 0)? "Impossible": result);
			
			
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
