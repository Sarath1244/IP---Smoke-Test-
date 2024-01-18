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
public class Lobbyhamburgermenu extends Baseclass {

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
	                
	              //Pools Tab
                    try {
                   	 driver.findElement(Config.poolstab).click();
	 		                System.out.println("pools tab successfully!!");
		        			Thread.sleep(1500);	                        		
            			
		        			 test.log(LogStatus.PASS ,"Pools tab Selected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
            			}
            			catch(Exception f10)
            			{
            				System.out.println("Pools Tab trigger  failed");
            								
            				f10.getMessage();
            				 test.log(LogStatus.FAIL ,"Pools Tab  unselected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
            			}            
                   //Deals  Tab
                    try {
                   	 driver.findElement(Config.dealstab).click();
	 		                System.out.println("pools tab successfully!!");
		        			Thread.sleep(1500);	
            			
		        			 test.log(LogStatus.PASS ,"Deals Tab  selected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");           			
            			}
            			catch(Exception f10)
            			{
            				System.out.println("Deals Tab trigger failed");
            					
            				f10.getMessage();
            				 test.log(LogStatus.FAIL ,"deals Tab  unselected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
            			}        
                    //Powerplay Tab
                    try {
                   	 driver.findElement(Config.powerplaytab).click();
	 		                System.out.println("pools tab successfully!!");
		        			Thread.sleep(1500);	
            			
		        			 test.log(LogStatus.PASS ,"Powerplay Tab  selected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
            			}
            			catch(Exception f10)
            			{
            				System.out.println("Powerplay Tab failed");
            				
            				f10.getMessage();
            				 test.log(LogStatus.FAIL ,"Poweplay Tab  unselected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
            			}   
                      System.out.println("cash all tab trigger successfully"); 
                      
                      
                ///Cash game low filter       
                      try {
                       	 driver.findElement(Config.lowfilterchecked).click();
		 		                System.out.println("cash low checked successfully!!");
	 		        			Thread.sleep(1500);	
	 		        			 driver.findElement(Config.lowfilterunchecked).click();
			 		                System.out.println("cash tour lowunchecked successfully!!");
		 		        			Thread.sleep(1500);	
                			
		 		        			 test.log(LogStatus.PASS ,"Low stake filter selected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
                			}
                			catch(Exception f10)
                			{
                				System.out.println("cash lowfiltercheck & uncheck failed");
                				
                				f10.getMessage();
                				 test.log(LogStatus.FAIL ,"Low stake filter  unselected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
                			}   
                          System.out.println("cash low filtercheck & uncheck successfully");   
                          
                          
                          ///Cash game Medium filter  
                          Thread.sleep(1500);	
                          try {
	                        	 driver.findElement(Config.midfilterchecked).click();
			 		                System.out.println("cash midchecked successfully!!");
		 		        			Thread.sleep(1500);	
		 		        			 driver.findElement(Config.midfilterunchecked).click();
				 		                System.out.println("cash midunchecked successfully!!");
			 		        			Thread.sleep(1500);	
	                 			
			 		        			 test.log(LogStatus.PASS ,"Mid stake filter selected ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");                 			
	                 			}
	                 			catch(Exception f10)
	                 			{
	                 				System.out.println("tour mid filtercheck & uncheck failed");
	                 					
	                 				f10.getMessage();
	                 				 test.log(LogStatus.FAIL ,"Mid stake filter unselected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
	                 			}
	                           System.out.println("cash mid filtercheck & uncheck successfully");            
                          
	                           ///Cash game high filter 
	                           Thread.sleep(1500);	
	                           try {
		                        	 driver.findElement(Config.highfilterchecked).click();
				 		                System.out.println("cash high checked successfully!!");
			 		        			Thread.sleep(1500);	
			 		        			 driver.findElement(Config.highfilterunchecked).click();
					 		                System.out.println("cash high unchecked successfully!!");
				 		        			Thread.sleep(1500);	
				 		        			 test.log(LogStatus.PASS ,"High stake filter unselected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		             			
		                 			}
		                 			catch(Exception f10)
		                 			{
		                 				System.out.println("cash high filtercheck & uncheck failed");
		                 				
		                 				f10.getMessage();
		                 				 test.log(LogStatus.FAIL ,"High stake filter unselected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                 			}   
		                           System.out.println("cash high  filtercheck & uncheck successfully");  
		                           
		                           Thread.sleep(3000);        
		                           //Rummy Lobby hamburger menu tab 
		                             try { 
		                            	 driver.findElement(Config.lobbyhamburger).click();
					 		                System.out.println(" Hamburger menu successfully!!");
		                            	 
		                     			Thread.sleep(1500);
		                     			
		                     			 test.log(LogStatus.PASS ,"Hamburger menu selected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("Rummy Lobby hamburger menu not clicked ");
		                     				
		                     				
		                     				f10.getMessage();
		                     				 test.log(LogStatus.FAIL ,"Hamburger menu  unselected  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}  
		                             Thread.sleep(1500); 
		                             
		                             
		                             // My wallet  
		                             try {  
		                            	 driver.findElement(Config.walletlobby).click();							 		               
		                     			System.out.println("Mywallet successfully");				                   			
		                     			Thread.sleep(1500);		                     		
		                     			Thread.sleep(3000);
		                     			driver.findElement(Config.closeiconlobby).click();
		                     		
		                     			 test.log(LogStatus.PASS ,"My wallet click", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         		
		                             }
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("My wallet failed");
		        				
		                     				f10.getMessage();
		                     				 test.log(LogStatus.FAIL ,"My wallet unclickfailed ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}                    
		                             // My Profile
		                             try {
		                  	 
		                            	 driver.findElement(Config.profilelobby).click();	
		                     			System.out.println("My Profile successfully");			                     			
		                     			Thread.sleep(1500);
		                     						                     			
		                     			Thread.sleep(3000);
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			 test.log(LogStatus.PASS ,"My profile clicked  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("My Profile failed");
		                     				  				
		                     				f10.getMessage();
		                     				 test.log(LogStatus.FAIL ,"My wallet failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}     
		                                
		                          //Add Cash 
		                             try {
		                            	 driver.findElement(Config.addcashlobby).click();				                        
		                     			System.out.println("Addcash successfully");				                     			
		                     			Thread.sleep(3000);
		                     			
		                     			Thread.sleep(5000);
		                     			
		                     			 test.log(LogStatus.PASS ,"Add cash clicked ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("Addcash  failed");
		                     							                     				
		                     				f10.getMessage();
		                     				 test.log(LogStatus.FAIL ,"Add cash failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}
		                             //Withdraw menu successfully"
		                             try {
		                          	   
		                            	 driver.findElement(Config.Withdrawlobby).click();				                        
			                     			System.out.println("withdraw successfully");					                     			
			                     			Thread.sleep(1500);		                     			
		                     			Thread.sleep(3000);
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			
		                     			 test.log(LogStatus.PASS ,"My withdrawal clicked  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("Withdraw   failed");
		                     				
		                     			f10.getMessage();
		                     			 test.log(LogStatus.FAIL ,"My withdrawal failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}  
		                             //Promotion menu
		                             try {
		                            	 driver.findElement(Config.promotionlobby).click();				                        
			                     			System.out.println("promotion successfully");
			                     			Thread.sleep(1500);		                     			
		                     			Thread.sleep(3000);
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			
		                     			 test.log(LogStatus.PASS ,"Promotion Menu clicked ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("promotion  failed");
		                     				f10.getMessage();
		                     				 test.log(LogStatus.FAIL ,"Promotion  menu failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");         
		                     			}  
		                            
		                             //Handschallenge menu
		                             try {
		                           
		                            	 driver.findElement(Config.handchallengelobby).click();				                        
			                     			System.out.println("Hand Challenge successfully");
			                     			Thread.sleep(1500);					                     			
		                     			
		                     			Thread.sleep(3000);
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			
		                     			 test.log(LogStatus.PASS ,"Hand Challenge  clicked ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");       
		                     			
		                             }catch(Exception f10)
		                     			{
		                     				System.out.println("Handschalenge  failed");
	                     				f10.getMessage();
	                     				 test.log(LogStatus.FAIL ,"Hand Challenge  Failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");       
		                     			}
		                             //How to Play menu 
		                             try {
		                            	 driver.findElement(Config.howtoplaylobby).click();	
		                     			System.out.println("How to Play menu successfully");
		                     			Thread.sleep(1500);		                     		
		                     			
		                     			Thread.sleep(3000);	
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			
		                     			test.log(LogStatus.PASS ,"how to play   clicked  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");     
 }
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("How to Play  failed");	                     			
		                     				f10.getMessage();
		                     				test.log(LogStatus.FAIL ,"howtoplaylobby  Failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");       
		                     			}   
		                             //contact us menu 
		                             try {
		                            	 driver.findElement(Config.contactuslobby).click();
		                     			System.out.println("contact us successfully");
		                     			Thread.sleep(1500);		
		                     			
		                     			Thread.sleep(3000);	
		                     			driver.findElement(Config.closeiconlobby).click();
		                     			test.log(LogStatus.PASS ,"contactuslobby clicked   ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");       
		                     			
		                     			}
		                     			catch(Exception f10)
		                     			{
		                     				System.out.println("contact us   failed");
		                     				
		                     				
		                     				f10.getMessage();
		                     				test.log(LogStatus.FAIL ,"contactuslobby  Failed  ", "To open Screenshots : <a href=' "+ Baseclass.takeSnapShot()+ " ' target=\\\"_blank\\  >Click Here</a>");       
		                     			}
                           
	                
	                
	                
			 }}