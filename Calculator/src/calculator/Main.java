package calculator;

import java.util.Scanner;

// This is simple calculator project
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cu = new Calculator("Welcome to The Somnath\'s Calculator");
		cu.init(sc);
		sc.close();
	}
}