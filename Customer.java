package git;

public class Customer {

private int id;
private String name;
private String email;
private String address;
private int contactno;



 public void Showdetails(int id,String name, String email,String address,int contactno){
	 System.out.println("Id =" + id);
	 System.out.println("Name =" + name);
	 System.out.println("Email = " + email);
	 System.out.println("Address =" + address);
	 System.out.println("Contact number = " + contactno);
 }
}
