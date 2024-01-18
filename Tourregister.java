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
public class Tourregister extends Baseclass {

	//static WebDriver driver;
	
		static String maincurrentwindow;
		static String maincurrentwindow1;	
		 @SuppressWarnings("deprecation")
		 @Test
		               public static void cashgame()throws Throwable {
			 Baseclass.invoke();
			            	test = report.startTest("cashgame");			
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
              
                	 test.log(LogStatus.PASS,"rummy lobby verified ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	                    }
	                    catch(Exception f10)      
	                    {
	                        System.out.println("mainlobby successfully  Failed  ");
	                                          
	                        f10.getMessage();
	                        test.log(LogStatus.PASS,"mainlobby successfully  Failed", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");              
	                    } 
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
    			 test.log(LogStatus.PASS,"promotion popup opened ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         

	       }catch(Exception f10){
	                        System.out.println("Rummy tab");
	                                           
	                        f10.getMessage();
	                        test.log(LogStatus.FAIL ,"Rummy gametab Failed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	          }
                Thread.sleep(3000); 
                
             //tournament tab
	            try {
	            	driver.findElement(Config.tourtab).click();
		                System.out.println("Tour tab successfully!!");
		               Thread.sleep(2000);
		               driver.findElement(Config.tourconfirmpopup).click();
	               System.out.println("tourconfirmpopup  successfully!!");
	               Thread.sleep(5000);
	               driver.findElement(Config.tourok).click();
	               System.out.println("Tour Ok successfully!!");
	               Thread.sleep(5000);
	               driver.findElement(Config.tourregsiter).click();
	               System.out.println("Tournament register successfully!!");
        		
	   			 test.log(LogStatus.PASS,"tour Register ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	            }catch(Exception f10)				
        			{
        				System.out.println("Tour tab  failed");
        				f10.getMessage();
        				 test.log(LogStatus.FAIL,"tour regsiter failed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
        			}
	            
	        
	               //Practice tab
		            try {
	        			
	        			
	        			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div[3]")).click();
	        			System.out.println("practice tab  successfully");
	        			Thread.sleep(1500);
	        			 test.log(LogStatus.PASS,"Practice tab verified ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		            }catch(Exception f10)				
	        			{
	        				System.out.println("Tour tab  failed");
	        				f10.getMessage();
	        				 test.log(LogStatus.FAIL,"Practice tab failed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	        			}         
	            
	              
	                
		      
                /*      try {
		        			
		        			//driver.findElement(xpathpages.stakeamount).click();
		        			driver.findElement(By.xpath("//*[@id=\"notificationDialog\"]/div/div[2]/div/div/div[1]")).click();
		        			//System.out.println("Login successfully");
		        			Thread.sleep(1500);
		        			Newbase.takeSnapShot(driver, "D:\\automation screenshot\\tourreg.png") ;
		        			
		        			
		        			 test.log(LogStatus.PASS,"tour registered successfully", "To open Screenshots : <a href= 'file:///D:\\automation screenshot\\tourreg.png'target=\\\"_blank\\  >Click Here</a>");
		        			
		        			}
		        			catch(Exception f10)
						
		        			{
		        				System.out.println("login failed");
		        				Newbase.takeSnapShot(driver, "D:\\automation screenshot\\tourreg.png") ;
		        				
		        				f10.getMessage();
		        				test.log(LogStatus.FAIL,"tour reg   failed", "To open Screenshots : <a href= 'file:///D:/automation screenshot/tourreg.png'target=\\\"_blank\\  >Click Here</a>");
		        			}
	                  
	                 // withdrawal popup  close 
	             //   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/notification-dialog[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
	              //  System.out.println("Tour register ");
	                
	                
	                try {
	        			
	        			//driver.findElement(xpathpages.stakeamount).click();
	        			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/notification-dialog[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
	        			System.out.println("Login successfully");
	        			Thread.sleep(1500);
	        			Newbase.takeSnapShot(driver, "D:\\automation screenshot\\tourwithdraw.png") ;
	        			
	        			
	        			 test.log(LogStatus.PASS,"tour withdraw successfully", "To open Screenshots : <a href= 'file:///D:\\automation screenshot\\tourwithdraw.png'target=\\\"_blank\\  >Click Here</a>");
	        			
	        			}
	        			catch(Exception f10)
					
	        			{
	        				System.out.println("login failed");
	        				Newbase.takeSnapShot(driver, "D:\\automation screenshot\\tourwithdraw.png") ;
	        				
	        				f10.getMessage();
	        				test.log(LogStatus.FAIL,"tour withdraw failed", "To open Screenshots : <a href= 'file:///D:/automation screenshot/tourwithdraw.png'target=\\\"_blank\\  >Click Here</a>");
	        			}
	                
	                Thread.sleep(3000);
	                  
	                //tournament unregister
	                  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div[2]")).click(); 
                   driver.findElement(By.xpath("//*[@id=\"page-container-id\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[6]/div")).click();
              
                   
                   // register button
	               WebElement tip = driver.findElement(By.xpath("//*[@id=\"notificationDialog\"]/div/div[2]/div/div/div[1]"));		                		
                   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	                  js2.executeScript("arguments[0].click()", tip);
	                  System.out.println("tour unregister ");
                       Thread.sleep(1000);
	                  
	                 // withdrawal popup  close 
	                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/notification-dialog[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();*/
                            
	     
	                
//           //Low Tour filter
//	             boolean  x =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input")).isSelected();		                 
//	                   if (x==false) {
//                   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input")).click();                  
//	                 System.out.println("low checkbox selected  successfully  ");
//                  Thread.sleep(3000);
//	                  if (x!=true) {
//            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input")).click();
//            System.out.println("low checkbox unselected  successfully  ");}}
//            
//            
//	                //Medium filter
//	                    boolean  y =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/input")).isSelected();
//                      if (y==false) {
//                   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/input")).click();
//                    System.out.println("medium checkbox selected  successfully  ");
//	                       
//	               Thread.sleep(3000);
//                  if (y!=true) {
//	                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/input")).click();		                        
//	                System.out.println("medium checkbox unselected  successfully  ");   
//                  }}
//	          
//	                
//	                        //high filter
//		                 boolean  z =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input[1]")).isSelected();
//	                     if (z==false) {
//                  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input[1]")).click();
//	                    System.out.println("high checkbox selected  successfully  ");                     
//		                     Thread.sleep(3000);
//		                                   
//		                       if (z!=true) {
//		                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input[1]")).click();	                        
//		                System.out.println("high check box unselected  successfully  ");    
	 //                 }}
                  
	                 
}}