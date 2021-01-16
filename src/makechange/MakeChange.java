package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double itemPrice = getItemPrice(sc);
		double payment = getPayment(sc);
		makeChange(itemPrice, payment);
		
		sc.close();
	}

	private static void makeChange(double itemPrice, double payment) {
		// First step is to check if they have given enough money
		if (itemPrice > payment) {
			System.out.println("Error: You did not give enough money to pay for item.");
		}
		
		// If they have given enough money then subtract itemPrice from payment to get change
		
		double change = payment - itemPrice;
		int bills = (int) change;
		int coins = (int) (change * 100 - bills * 100);
		
		// convert change into denominations
		System.out.print("Your change is: ");
		if (bills >= 20) {
			int denomination = (int) bills/20;
			System.out.print(denomination + "-$20  ");
			bills %= 20;
		}
		if (bills >= 10) {
			int denomination = (int) bills/10;
			System.out.print(denomination + "-$10  ");
			bills %= 10;
		}
		if (bills >= 5) {
			int denomination = (int) bills/5;
			System.out.print(denomination + "-$5  ");
			bills %= 5;
		}
		if (bills >= 1) {
			System.out.print(bills + "-$1  ");
		}
		if (coins >= 25) {
			int denomination = (int) coins/25;
			System.out.print(denomination + "-25c  ");
			coins %= 25;
		}
		if (coins >= 10 ) {
			int denomination = (int) coins/10;
			System.out.print(denomination + "-10c  ");
			coins %= 10;
		}
		if (coins >= 5) {
			int denomination = (int) coins/5;
			System.out.print(denomination + "-5c  ");
			coins %= 5;
		}
		if (coins >= 1) {
			System.out.print(coins + "-1c  ");
		}

		
	}

	private static double getPayment(Scanner sc) {
		// This asks user how much money they are giving in payment and returns a double

		System.out.print("How much money are you giving clerk to pay for item? ");
		double payment = sc.nextDouble();
		sc.nextLine();
		
		return payment;
	}

	private static double getItemPrice(Scanner sc) {
		// This asks user for the price of their item and returns it as a double
		
		System.out.print("What is the price of the item you're buying today? ");
		double itemPrice = sc.nextDouble();
		
		return itemPrice;
	}
	
	
	
}
