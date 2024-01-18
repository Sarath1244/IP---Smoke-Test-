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


public class Practicegame extends Baseclass {

	static String maincurrentwindow;
	static String maincurrentwindow1;	
	 @SuppressWarnings("deprecation")
	 @Test
	               public static void cashgame()throws Throwable {
		 Baseclass.invoke();
		            	test = report.startTest("Practicegame");
		            	
			              //Username & Password login  
			                try {
			                	
			                	driver.findElement(Config.loginicon).click(); 
			                	Thread.sleep(4000);
			                	WebElement username = driver.findElement(Config.username);
				         		 username.sendKeys("iptejass");
				         		System.out.println(" Username entered !!");
			       	            WebElement password = driver.findElement(Config.password);
				         		Thread.sleep(2000);
				         		password.sendKeys("Test@123");
				        		System.out.println("Password Entered !!");
			      		        driver.findElement(Config.submit_Button).click();
			                	 System.out.println("Login successfully!!");		                	 
			                	 Thread.sleep(3000);
			                	 driver.findElement(Config.rummyicon).click();
			                	 System.out.println("rummy icon successfully!!");
			                	 driver.findElement(Config.takemelobby).click();	
			                	 System.out.println("rummy takeme lobby successfully!!");
	                      
			                	 test.log(LogStatus.PASS,"username and password  empty verified ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
				                    }
				                    catch(Exception f10)      
				                    {
				                        System.out.println("mainlobby successfully  Failed  ");
				                                          
				                        f10.getMessage();
				                        test.log(LogStatus.FAIL,"username and password Failed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
				                    } 
			                Thread.sleep(5000);
			                //promotion popup closed
	                         try {
	                        	 Thread.sleep(1000);
	             				String maincurrentwindow = driver.getWindowHandle();
	             				Set<String> mainallwindows = driver.getWindowHandles();		            
	             				for(String Pro : mainallwindows) {
	             					if (!(Pro.equals(maincurrentwindow)))    {		                
	             						driver.switchTo().window(Pro);
	             						driver.findElement(Config.gamelobby).click();
	             						
	       		                	 System.out.println("rummy gametab  lobby successfully!!");
	             					}
	             				}
	             			Thread.sleep(6000);
	             			String maincurrentwindow1 = driver.getWindowHandle();
	             			 Set<String> mainallwindows1 = driver.getWindowHandles();		            
	             			 for(String Pro1 : mainallwindows1) {
	             				  if (!(Pro1.equals(maincurrentwindow1))){
	             				    	 System.out.println("Sucessfully Closed Promotion Window");		                    
	             				    	 String Addvertisment = driver.getTitle();
	             				    	 System.out.println(Addvertisment);
	             						 if (!(Addvertisment.equals(null))) {
	             							 driver.close();		            
	             							 driver.switchTo().window(Pro1);           							 
	             							 System.out.println("advertisement if block executed"+ driver.getTitle());           							
	                  	}}}    
	             			 test.log(LogStatus.PASS,"Rummy gametab ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
         
				       }catch(Exception f10){
				                        System.out.println("Rummy gametab  successfully Failed");
				                                           
				                        f10.getMessage();
				                        test.log(LogStatus.FAIL ,"Rummy gametab Failed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
				          }
	                         
	                         //practice game tab 
	                         try {
	 						driver.findElement(Config.practicegame).click();
	 		                System.out.println("Practice tab successfully!!");
	 		               Thread.sleep(2000);
	 		               driver.findElement(Config.practicepools).click();
			               System.out.println("Practice pools tab successfully!!");
			               Thread.sleep(2000);
			               driver.findElement(Config.practicedeals).click();
			               System.out.println("Practice deals tab successfully!!");
			               Thread.sleep(2000);
			               driver.findElement(Config.practicepowerplay).click();
			               System.out.println("Practice powerplay tab successfully!!");
	 		              
			               test.log(LogStatus.PASS,"Practice Game Tab selected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	 			          
	 			                    }
	 			                    catch(Exception f10)      
	 			                    {
	 			                        System.out.println("Practice all game tab Failed  ");
	 			                                           
	 			                        f10.getMessage();
	 			                       test.log(LogStatus.FAIL,"Practice Game Tab Failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	 			                    }  
	                      //practice game take seat 
	                        try {
	 						driver.findElement(Config.practicepoints).click();
	 		                System.out.println("Practice points tab successfully!!");
	 		               Thread.sleep(2000);
	 		              driver.findElement(Config.takeseatpractice).click();
			               System.out.println("Practice takeseat successfully!!");
			               Thread.sleep(2000);
			               driver.findElement(Config.takeseatpracticein).click();
			               System.out.println("Practice takeseatin successfully!!");
			               test.log(LogStatus.PASS,"Practice Game  take seat ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	 		                 
	 			                   }
	 			                    catch(Exception f10)      
	 			                   {
	 			                       System.out.println("practice game take seat Failed  ");
	 			                                        
	 			                        f10.getMessage();
	 			           test.log(LogStatus.FAIL,"Practice Game  Failed   ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
}
	                        }}


