import java.util.*;
public class Search {

	public Search() {
		// TODO Auto-generated constructor stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("samata");a.add("afaw");a.add("sdasd");
		ArrayList<String> prod=new ArrayList<String>();
		prod.add("Books");prod.add("Clothes");prod.add("Money");
		NGO n1= new NGO("11","uets","61741298",a,prod);
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("uets");a1.add("afaw");a1.add("dhdbf");
		ArrayList<String> prod1=new ArrayList<String>();
		prod1.add("Money");prod1.add("Books");prod1.add("Food");
		NGO n2= new NGO("12","samata","5441298",a1,prod1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("samata");a2.add("afaw");a2.add("sdasd");
		ArrayList<String> prod2=new ArrayList<String>();
		prod2.add("Food");prod2.add("Books");prod2.add("Clothes");
		NGO n3= new NGO("13","afaw","134698",a2,prod2);
		ngoList.add(n1); ngoList.add(n2);ngoList.add(n3);
		ArrayList<String> loc1=new ArrayList<String>();
		loc1.add("uets");loc1.add("samata");
		locNGO.put("Gandhinagar", a);locNGO.put("Hyderabad", a1);
		prodNGO.put("Books", a1);prodNGO.put("Clothes", a);prodNGO.put("Money", a);
	}
	public String location,product,NGOname,searchStatus;
	public HashMap<String,ArrayList<String>> locNGO=new HashMap<String,ArrayList<String>>();
	public HashMap<String,ArrayList<String>> prodNGO=new HashMap<String,ArrayList<String>>();
	public ArrayList<NGO> ngoList = new ArrayList<NGO>();
	
	public ArrayList<String> searchByLocation(String loc){
		
		ArrayList<String> ans=new ArrayList<String>();
		for(Map.Entry<String,ArrayList<String>> entry:locNGO.entrySet()){
			if((entry.getKey()).equals(loc)) {
				//ans.add(entry.getValue());
				ans=entry.getValue();
			}
		}
		System.out.println("Your Location has following NGOs:");
		displayList(ans);
		return ans;
	}
	public ArrayList<String> searchByProduct(String prod){
		ArrayList<String> ans=new ArrayList<String>();
		for(Map.Entry<String,ArrayList<String>> entry:prodNGO.entrySet()){
			if((entry.getKey()).equals(prod)) {
				ans=entry.getValue();
			}
		}
		displayList(ans);
		return ans;
	}
	public ArrayList<String> searchByName(String name){
		ArrayList<String> ans=new ArrayList<String>();
		ans.add(name);
		displayList(ans);
		return ans;
	}
	public void displayList(ArrayList<String> li) {
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<ngoList.size();j++) {
				
				if(ngoList.get(j).Name.equals(li.get(i))) {
					System.out.println(i+1+" -> ID: "+ngoList.get(j).ID);
					System.out.println("Name: "+ngoList.get(j).Name);
					System.out.println("Contact Details: "+ngoList.get(j).ContactDetails);
				}
			}
		}
	}
	public void promptUser(String ID) {
		System.out.println(ID);
	}
}
