package git;

public class billing {
	private int paymentid;
	private String paymentmethod;

	public void display(int paymentid,String paymentmathod) {
		System.out.println(" Payment ID = " + paymentid);
		System.out.println("Payment Method = " + paymentmethod);
	}
}
