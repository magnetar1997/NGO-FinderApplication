import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> subs=new ArrayList<String>();
		subs.add("samata");
		subs.add("uets");
		User u1=new User("1","koushik","874210",subs);
		User u2=new User("2","umesh","87420",subs);
		User u3=new User("3","kfe","870",subs);
		User u4=new User("4","kfdsf","7210",subs);
		System.out.println("Welcome to NGOFinder");
		System.out.println("Press 1 for Searching NGO");
		System.out.println("Press 2 for sending notification or requesting donation to users");
		System.out.println("Press 3 for making payment");
		Scanner sc=new Scanner(System.in);
		int inputNumber=sc.nextInt();
		switch(inputNumber) {
			case 1:
				searchNGO();
				break;
			case 2:
				RequestDonation();
				break;
			case 3:
				makePayment();
				break;
			default:
				break;
		}
		sc.close();
	}
	public static void searchNGO() {
		Scanner sc1=new Scanner(System.in);
		String name="",contact="",location,product,NGOname;
		ArrayList<String> subscriptions=new ArrayList<String>();
		Authentication a = new Authentication();
		System.out.println("Enter your Username and Password");
		String id=sc1.next();
		String pwd=sc1.next();
		Boolean lstatus;
		if(lstatus=a.verifyLogin(id, pwd)) {
			lstatus=true;
			a.promptUser(lstatus);
			User u=new User(id,name,contact,subscriptions);
			Search s=new Search();
			System.out.println("Please enter Location or Product or Name");
			String inp=sc1.next();
			ArrayList<String> list=new ArrayList<String>();
			if(inp.equals("Location")) {
				System.out.println("Enter the location name");
				location=sc1.next();
				list=s.searchByLocation(location);
			}
			else if(inp.equals("Product")) {
				System.out.println("Enter the Product name");
				product=sc1.next();
				list=s.searchByProduct(product);
			}
			else if(inp.equals("Name")) {
				System.out.println("Enter the NGO name");
				NGOname=sc1.next();
				list=s.searchByName(NGOname);
			}
		}
		else {
			lstatus=false;
			a.promptUser(lstatus);
			searchNGO();
		}
		sc1.close();
	}
	public static void RequestDonation() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your Username and Password");
		Authentication a = new Authentication();
		String id=sc2.next();
		String pwd=sc2.next();
		Boolean lstatus;
		if(lstatus=a.verifyLogin(id, pwd)) {
			a.promptUser(lstatus);
			ArrayList<String> a1 = new ArrayList<String>();
			a1.add("uets");a1.add("afaw");a1.add("avfsdd");
			ArrayList<String> prod=new ArrayList<String>();
			prod.add("Books");prod.add("Clothes");prod.add("Money");
			NGO n=new NGO("21","unbNGO","241124",a1,prod);
			n.sendNotification();
		}
		else {
			lstatus=false;
			a.promptUser(lstatus);
		}
		sc2.close();
	}
	public static void makePayment() throws IOException{
		searchNGO();
		//Scanner sc3=new Scanner(System.in);
		System.out.println("Select an NGO from this list");
		System.out.println("samata");
		String q="";
		//q=sc3.next();
		System.out.println("Enter the amount of money you want to donate");
		System.out.println(1500);
		//int mon=sc3.nextInt();
		Donation d=new Donation();
		d.donateMoney(1500,"samata");
		//sc3.close();
	}
}
