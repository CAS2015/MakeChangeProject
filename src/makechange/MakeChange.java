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
	
	private static void printOutput(int numOfCurrency, int remainingCurrency, String singular, String plural) {
		String printOutput = numOfCurrency + " ";
		printOutput += numOfCurrency == 1 ?	singular : plural;
		printOutput += remainingCurrency > 0 ?	", " : ".";
		System.out.print(printOutput);
		
	}

	private static void makeChange(double itemPrice, double payment) {
		// First step is to check if they have given enough money
		if (itemPrice > payment) {
			System.out.println("Error: You did not give enough money to pay for item.");
		} 
		else if (itemPrice == payment) {
			//If they have given exact change, print no change statement
			System.out.println("You gave the exact amount! No change for you.");
		}
		else {
			// If they have given enough money then subtract itemPrice from payment to get change in bills and coins

			double change = payment - itemPrice;
			int bills = (int) change;
			int coins = (int) Math.round((change- bills) * 100);

			// convert change into denominations and print statements for the change
			System.out.print("Your change is: ");
			if (bills >= 20) {
				int numOfBills = (int) bills / 20;
				bills %= 20;
				printOutput(numOfBills, bills, "twenty dollar bill", "twenty dollar bills");

			}
			if (bills >= 10) {
				int numOfBills = (int) bills / 10;
				bills %= 10;
				printOutput(numOfBills, bills, "ten dollar bill", "ten dollar bills");
			}
			if (bills >= 5) {
				int numOfBills = (int) bills / 5;
				bills %= 5;
				printOutput(numOfBills, bills, "five dollar bill", "five dollar bills");
			}
			if (bills >= 1) {
				int remainder = coins > 0 ? 1 : 0;
				printOutput(bills, remainder, "one dollar bill", "one dollar bills");
			}
			if (coins >= 25) {
				int numOfCoins = (int) coins / 25;
				coins %= 25;
				printOutput(numOfCoins, coins, "quarter", "quarters");
			}
			if (coins >= 10) {
				int numOfCoins = (int) coins / 10;
				coins %= 10;
				printOutput(numOfCoins, coins, "dime", "dimes");
			}
			if (coins >= 5) {
				int numOfCoins = (int) coins / 5;
				coins %= 5;
				printOutput(numOfCoins, coins, "nickel", "nickels");
			}
			if (coins >= 1) {
				int remainder = 0;
				printOutput(coins, remainder, "penny", "pennies");
			}
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
