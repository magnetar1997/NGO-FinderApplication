import java.util.ArrayList;
public class User {
	public User(String id,String name,String contact,ArrayList<String> subscriptions){
		this.ID=id;
		this.Name=name;
		this.ContactDetails=contact;
		this.SubscriptionDetails=subscriptions;
		
	}
	public User() {
		
	}
	public void updateProfile(){
			
		}
	/*public User viewProfile(String id) {
			
		}*/
	public String ID;
	public String Name;
	public String ContactDetails;
	private ArrayList<String> SubscriptionDetails;
	
}
