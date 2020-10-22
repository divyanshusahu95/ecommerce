package git;

public class Productdetails {
	private int productid;
	private String name;
	private int modelnumber;
	private int quantity;

	public void showinformation(int productid,String name,int modelnumber,int quantity) {
		System.out.println("Productid = " + productid);
		System.out.println("Name = " + name);
		System.out.println("Modelnumber = " + modelnumber);
		System.out.println("Quantity = " + quantity);
	}

}
