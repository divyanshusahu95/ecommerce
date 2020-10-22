package git;

import java.util.Scanner;

public class Testproductdetail {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the product details");
	    int	productid= sc.nextInt();
	    String	name=sc.next();
		int modelnumber= sc.nextInt();
		int quantity=sc.nextInt();
		
     Productdetails c3 = new Productdetails();
     c3.showinformation(productid, name, modelnumber, quantity);
	}

}
