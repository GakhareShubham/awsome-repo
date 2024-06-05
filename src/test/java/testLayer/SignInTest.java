package testLayer;

import org.testng.annotations.Test;

import com.amazon.pageLayer.HomePage;
import com.amazon.pageLayer.SignInPage;
import com.amazon.testBase.TestBase;

public class SignInTest extends TestBase {
	@Test
	public void checkLoginFunctionality()
	{
		HomePage home_obj =new HomePage(driver);
		SignInPage signin_obj = new SignInPage(driver);
		home_obj.clickOnSignInLink();
		signin_obj.enterUsername_textField("shubhamgakhare34@gmail.com");
		signin_obj.clickOnContinue_Button();
		signin_obj.enterPassword_TextField("Ansh@0000");
	}

}
