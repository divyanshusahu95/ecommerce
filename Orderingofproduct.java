package git;

public class Orderingofproduct {
	private int orderid;
	private String orderday;
	private String orderstatus;
	private int customerid;


	public void display(int orderid,String orderday,String orderstatus,int customerid) {
		
		System.out.println("Orderid = " + orderid);
		System.out.println("Orderday = " + orderday);
		System.out.println("Orderstatus = " + orderstatus);
		System.out.println("customerid = " + customerid);
}
}