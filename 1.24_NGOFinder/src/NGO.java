import java.util.*;
public class NGO extends User {
	
	public NGO(String id,String name,String contact,ArrayList<String> subscriptions,ArrayList<String> productsAccepted) {
		super(id,name,contact,subscriptions);
	}
	public ArrayList<String> productsAccepted,typeOfService,newsLetter,documents,activities,ongoingProjects,goals,Achievements;
	/*public void sendNotification(ArrayList<int> ids) {
		
	}*/
	public void updateNewsboard() {
		
	}
	public void receiveDonation(int money,String Name) {
		System.out.println(money+" Rs. is received from koushik");
		System.out.println("Payment receipt is sent to User koushik");
	}
	public void sendNotification() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the User to whom notification should be sent");
		String y=sc.nextLine();
		System.out.println("Enter the Message:");
		String d=sc.nextLine();
		Admin ad=new Admin();
		ad.sendNews(y,d);
		sc.close();
	}
}