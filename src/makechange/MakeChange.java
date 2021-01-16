package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double itemPrice = getItemPrice(sc);
		double payment = getPayment(sc);
		System.out.println(itemPrice + " : " + payment);
		
		sc.close();
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
