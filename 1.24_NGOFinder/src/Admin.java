import java.util.*;

public class Admin extends User{

	public Admin() {
		// TODO Auto-generated constructor stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("uets");a1.add("afaw");a1.add("dhdbf");
		Donor d1 = new Donor("26","Aravind","48947812",a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("samata");a2.add("afaw");a2.add("sdasd");
		Donor d2= new Donor("30","Anish","4454362",a2);
		donorList.add(d1);donorList.add(d2);
	}
	private ArrayList<String> listofRequests;
	public ArrayList<Donor> donorList=new ArrayList<Donor>();
	public void manageAccounts() {
		
	}
	
	public void sendOTP(int id) {
		
	}
	public void deleteProfile(int id) {
		
	}
	public void sendNews(String name,String d) {
		for(int i=0;i<donorList.size();i++) {
			if(donorList.get(i).Name.equals(name)) {
				System.out.println("Notification is sent to User "+name);
				donorList.get(i).receiveNotification(d);
			}
		}
	}
}
