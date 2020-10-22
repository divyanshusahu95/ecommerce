package git;

import java.util.Scanner;

public class Testbilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the payment details");
		int paymentid= sc.nextInt();
		String paymentmethod=sc.next();
		billing b1 = new billing ();
		b1.display(paymentid, paymentmethod);

	}

}
