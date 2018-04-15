import java.util.*;
import java.io.*;
public class Authentication {

	public Authentication() {
		// TODO Auto-generated constructor stub
		users.put("koushik", "12334");
		users.put("umesh", "35534");

	}
	public Boolean verifyLogin(String id,String pwd) {
				if(pwd.equals(users.get(id))) {
			return true;
		}
		return false;
	}
	public void promptUser(Boolean lstatus) {
		if(lstatus) System.out.println("You are successfully logged in!");
		else System.out.println("Your Username or Password is wrong. Please enter correct details to continue");
	}
	public void enterCaptcha() {
		
	}
	private HashMap<String,String> users=new HashMap<String,String>();
	

}
