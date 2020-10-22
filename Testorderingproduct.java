package git;

import java.util.Scanner;

public class Testorderingproduct {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the ordering details");
	    int	orderid= sc.nextInt();
	    String	orderday=sc.next();
		String orderstatus= sc.next();
		int customerid=sc.nextInt();
		
     Orderingofproduct c2 = new Orderingofproduct();
     c2.display(orderid, orderday, orderstatus, customerid);

	}

}
