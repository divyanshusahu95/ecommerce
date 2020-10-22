package git;

import java.util.Scanner;

public class Testshoppingcart {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the shopping details");
		int shoppingcard= sc.nextInt();
		int productid = sc.nextInt();
		Shoppingcart s4 = new Shoppingcart();
		s4.showingdetails(shoppingcard, productid);
		

	}

}
