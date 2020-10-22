package git;

import java.util.Scanner;

public class Testconfirmation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the confirmation details");
		int customerid=sc.nextInt();
		 String customerpassword=sc.next();
		 
		 Confirmation c=new Confirmation();
		 c.showdetails(customerid, customerpassword);

	}

}
