package Action;

import java.io.File;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.Config;
import Sources.Baseclass;
public class Forgotpassword extends Baseclass {
	@Test
    public  void UserLogin()throws Throwable {
		Baseclass.invoke();
		test = report.startTest("forgot password");

		Thread.sleep(1000);

		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");
	
	//Forgot password 
	try {
		
		driver.findElement(Config.forgot).click();
		System.out.println("Forgot password redirected!!");
		Thread.sleep(1500);
		test.log(LogStatus.PASS, "Forgot passwored  success ", "To open Screenshots : <a href=' "
				+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
	} catch (Exception f10) {
		System.out.println("Forgot password  Failed ");
				f10.getMessage();
		test.log(LogStatus.FAIL, "Forgot Password   Failed  ", "To open Screenshots : <a href=' "
				+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	}
	

	//Forgot password -mobile no 
	try {
		
		driver.findElement(Config.forgotsubmit).click();
		test.log(LogStatus.PASS, "mobile number empty verified ", "To open Screenshots : <a href=' "
				+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
	} catch (Exception f10) {
		f10.getMessage();
		test.log(LogStatus.FAIL, "Mobile number empty  Failed  ", "To open Screenshots : <a href=' "
				+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	}	
	// Invalid Mobile no 
			try {

				WebElement forgot = driver.findElement(Config.forgotinpufiled);
				forgot.sendKeys("8056594182");
				System.out.println("Entered Invalid mobileno !!");
				driver.findElement(Config.forgotsubmit).click();
				Thread.sleep(2000);
			     forgot.clear();
//				

				test.log(LogStatus.PASS, "Invalid mobile no verified ", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			} catch (Exception f10) {
				System.out.println("Invalid mobile no verified");

				f10.getMessage();
				test.log(LogStatus.FAIL, "Invalid mobile no  Failed ", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			}
			// Valid Mobile no 
						try {

							WebElement forgot = driver.findElement(Config.forgotinpufiled);
							forgot.sendKeys("8056059418");
							System.out.println("Entered valid mobileno !!");
							driver.findElement(Config.forgotsubmit).click();
							Thread.sleep(2000);
							WebElement OTP = driver.findElement(Config.OTPBox);
							Thread.sleep(10000);
							driver.findElement(Config.OTPBox).click();
			
							System.out.println(" Entered valid OTP!");
							Thread.sleep(2000);

							test.log(LogStatus.PASS, "valid OTP", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {
							
							f10.getMessage();
							test.log(LogStatus.FAIL, "valid OTP  Failed ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						}		
						// Reset password   
						try {
							WebElement resetnew = driver.findElement(Config.NewPassword);
							resetnew.sendKeys("Test@123");
							WebElement Confirm = driver.findElement(Config.Confirmpassword);
							Confirm.sendKeys("Test@123");
							Thread.sleep(2000);
							driver.findElement(Config.Resetsubmit).click();
							System.out.println("Reset password redirected!!");
							Thread.sleep(1500);
							test.log(LogStatus.PASS, "reset passwored  success ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {
							System.out.println("Rest password  Failed ");
									f10.getMessage();
							test.log(LogStatus.FAIL, "Reset Password   Failed  ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
							}
							
							
	}}

//
//	


	
	
	

