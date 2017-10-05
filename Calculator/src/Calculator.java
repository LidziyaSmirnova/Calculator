import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner (System.in);
		double FN, SN;
		String operator;

		System.out.println("Enter the first value");
		FN = Input.nextDouble();

		System.out.println("Enter + or - or * or /");
		operator = Input.next();

		System.out.println("Enter second value");
		SN = Input.nextDouble();

		if (operator.equals("*")){
		    System.out.println("= " + (FN * SN));
		}
		if (operator.equals("/")){
		    System.out.println("= " + (FN / SN));
		}
		if (operator.equals("+")){
		    System.out.println("= " + (FN + SN));
		}
		if (operator.equals("-")){
		    System.out.println("= " + (FN - SN));
		}
		}
	}

