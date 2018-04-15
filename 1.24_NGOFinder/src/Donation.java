import java.util.*;
public class Donation {
	public Donation() {
		
	}
	public HashMap<String,String> listOfProducts;
	public Boolean isAnonymous;
	public String paymentStatus;
	public void donateProducts(HashMap<String,String> list) {
		
	}
	public void donateMoney(int amount,String name) {
		Search se=new Search();
		for(int i=0;i<se.ngoList.size();i++) {
		if(se.ngoList.get(i).Name.equals(name)) {
			System.out.println(amount+" Rs. is successfully transferred to NGO "+name);
			ArrayList<String> a2=new ArrayList<String>();
			a2.add("samata");a2.add("afaw");a2.add("sdasd");
			ArrayList<String> prod2=new ArrayList<String>();
			prod2.add("Food");prod2.add("Books");prod2.add("Clothes");
			NGO n3= new NGO("13","afaw","134698",a2,prod2);
			n3.receiveDonation(amount,name);
		}
		}
	}
	public void donateAnonymously(int amount) {
		
	}
	public void sendReceipt() {
		
	}
}
