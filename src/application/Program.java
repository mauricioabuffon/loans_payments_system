package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
//		System.out.print("1 - Brazil or 2 - Usa: ");
//		int opt = sc.nextInt();
//		if (opt == 1) {
//			InterestService is = new BrazilInterestService(2.0);
//		} else {
		InterestService is = new UsaInterestService(1.0);
//		}
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		sc.close();
	}
}
