import org.testng.annotations.Test;

public class facebookk {
   @Test
public void loginwithvalidcredentials() {
	System.out.println("hi, I am successfully logged in");
}
	@Test
	
	public void loginwithinvalidcredentials() {
		System.out.println("hi, I am unable to log in");
	}

	@Test
	public void loginwithinvaliduser() {
		System.out.println("hi, I am unable to log in due to wrong username");
	}
   
}
