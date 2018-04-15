import java.util.*;

public class Donor extends User{
	
	public Donor(String id,String name,String contact,ArrayList<String> subscriptions) {
		super(id,name,contact,subscriptions);
	}
	public void receiveNotification(String message) {
		System.out.println("Received Notification from NGO "+"uets with message: "+message);
	}
	public ArrayList<String> ListofDonations,favouriteNGOs,MostdonatedProducts,receivedMessages;
	
}
