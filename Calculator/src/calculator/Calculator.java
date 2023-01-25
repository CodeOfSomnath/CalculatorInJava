package calculator;

import java.util.Scanner;

public class Calculator {
	// This Scanner class will be used in class methods only
	private Scanner scanner;
	
	Calculator(String prompt) {
		System.out.println(prompt);
	}
	
	// This function for checking condition of calculator
	void init(Scanner scanner) {
		this.scanner = scanner;
		String prompt = "Enter - 1.Add 2.Minus 3.Divide 4.Multiply 5.Exit ";
		while (true) {
			System.out.println(prompt);
			
			System.out.print("Enter your input: ");
			byte option = scanner.nextByte();
			if (option == 5) {
				System.out.println("Thank you for using.");
				System.exit(1);
			} else if (option == 1) {
				this.add();
			} else if (option == 2) {
				this.minus();
			} else if (option == 3) {
				this.divide();
			} else if (option == 4) {
				this.mul();
			} else {
				System.out.println("Please enter a valid input.");
			}
				
		}
	}
	
	// This is for getting user inputs
	double[] getNumbers() {
		Scanner sc = this.scanner;
		double a = 0;
		double b = 0;
		System.out.print("Enter first number: ");
		a = sc.nextDouble();
		System.out.print("Enter second number: ");
		b = sc.nextDouble();
		return new double[]{a, b};
	}
	
	// This is for addition
	void add() {
		System.out.println("Addition");
		double[] val = getNumbers();
		System.out.println("The sum of two numbers: " + (val[0] + val[1]));
	}
	
	// This for substraction
	void minus() {
		System.out.println("Minus");
		double[] val = getNumbers();
		System.out.println("The minus of two numbers: " + (val[0] - val[1]));
	}
	
	// This is for division
	void divide() {
		System.out.println("Divide");
		double[] val = getNumbers();
		System.out.println("The divide of two numbers: " + (val[0] / val[1]));
	}
	
	// This is for multiplication
	void mul() {
		System.out.println("Multiply");
		double[] val = getNumbers();
		System.out.println("The multiply of two numbers: " + (val[0] * val[1]));
	}
}