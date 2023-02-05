package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;
import paginas.paginaLogin;


public class LoginTest  extends TestBase {
	
	paginaLogin login;
	@Test
    public void init() throws Exception {
		
  
		login= new paginaLogin(driver);
    
        login.setEmail("tutorial");
        login.setPassword("tutorial"); 
        login.clickOnNextButton();
        Assert.assertEquals(login.getTitle(),"Login Successfully"
        		+ "");
    }
	
}
	
