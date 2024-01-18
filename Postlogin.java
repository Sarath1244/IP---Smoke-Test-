package Action;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.Config;
import Sources.Baseclass;

public class Postlogin extends Baseclass {
	@Test
    public  void UserLogin()throws Throwable {
		Baseclass.invoke();
		test = report.startTest("Post Login");

		Thread.sleep(1000);

		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");
		
		// valid credentails
				try {
					WebElement username = driver.findElement(Config.username);
					username.sendKeys("iptejass");
					System.out.println(" Username entered !!");
					WebElement password = driver.findElement(Config.password);
					Thread.sleep(2000);
					password.sendKeys("Test@123");
					System.out.println("Password Entered !!");
					driver.findElement(Config.submit_Button).click();
					System.out.println("Login successfully!!");
					Thread.sleep(1500);

					test.log(LogStatus.PASS, "Valid username and password  ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Login successfully  Failed  ");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Login  successfuly FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}

				  //Hamburger menu site &  My profile click  
		  	       try {	  	    
		  	    	 driver.findElement(Config.postloginhamburger).click(); 
		  	    	 System.out.println("Post Hamburger Menu clicked!!");
		  	    	 driver.findElement(Config.Myprofile).click(); 	    			
		             System.out.println("Post My Profile Menu");
		    			Thread.sleep(1500);
						test.log(LogStatus.PASS, "My profile Verified", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    			
		    			}
		    			catch(Exception f10) 
		    			{
		    				System.out.println(" MyProfile failed");
		    				f10.getMessage();
		    				test.log(LogStatus.PASS, "My profile Verified", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    				
		    			}
		  	   //Mywallet  
		  	       try {	  	    
		  	    	 driver.findElement(Config.wallet).click(); 
		  	    	 System.out.println("My wallet menu  clicked!!");	  	    	     	        
		             test.log(LogStatus.PASS, "My wallet Verified", "To open Screenshots : <a href=' "	+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		    			}
		    			catch(Exception f10)
		    			{
		    				System.out.println("My wallet failed");
		    						    				
		    				f10.getMessage();
		    				test.log(LogStatus.FAIL, "My wallet Failed ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		    			}
  
		  	     
				  	  //add cash 
				  	     try {	  	      	    
				  	    	     driver.findElement(Config.Addcash).click();
				  	    	 //  driver.findElement(Config.Addcashcontinue).click();	  	    	
					            System.out.println("add cash   Verified !!");
					            test.log(LogStatus.PASS, "Add cash  Verified ", "To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("add cash transfer  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Add cash  FAILEd ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
  	     
	  	   //add cash less than zero
	  	  /*   try {	  	    
		  	    	 driver.findElement(Config.wallet).click(); 
		  	    	 System.out.println("My wallet menu  clicked!!");
	  	    	     driver.findElement(Config.Addcash).click();
		             System.out.println("Post add cash  Menu clicked!!");		             
		             driver.findElement(Config.Addcashcontinue).click();
		             System.out.println("Empty add cash  Verified !!");		             
		             Thread.sleep(5000);
	             WebElement addcashinputfiled1 = driver.findElement(Config.addcashinputfiled);
		             addcashinputfiled1.sendKeys("0");
		             System.out.println("less than zero add cash  Verified !!");
		             Thread.sleep(5000);
		             driver.findElement(Config.Addagreeterms).click();
		             driver.findElement(Config.Addcashcontinue).click();	            
		             System.out.println("add cash   Verified !!");
	 Newbase.takeSnapShot(driver, "D:\\automation screenshot\\less than zero add cash.png") ;
		    			 test.log(LogStatus.PASS,"less than zero add cash clicked", "To open Screenshots : <a href= 'file:///D:\\automation screenshot\\less than zero add cash.png'target=\\\"_blank\\  >Click Here</a>");
		    			}
		    			catch(Exception f10)
		    			{
		    				System.out.println("less than zero add cash failed");
		    				Newbase.takeSnapShot(driver, "D:\\automation screenshot\\less than zero add cash.png") ;
		    				
		    				f10.getMessage();
		    				test.log(LogStatus.FAIL," less than zero add cash clicked", "To open Screenshots : <a href= 'file:///D:/automation screenshot/less than zero add cash.png'target=\\\"_blank\\  >Click Here</a>");
		    			}*/
				  	   Thread.sleep(5000);
				  	     //withdrawal &  KYC
				  	   try {	  	    
				  	    	 driver.findElement(Config.withdrawpage).click(); 
				  	    	 System.out.println("My withdrawal  clicked!!");
				  	    	Thread.sleep(5000);
				  	    	 driver.findElement(Config.KYCClose).click();  
			  	    	 System.out.println("My KYCCompletion   clicked!!");
//				  	    //	 driver.findElement(Config.KYCpan).click(); 
//				  	    	 System.out.println("My KYCpan empty  clicked!!");
//				  	    	 driver.findElement(Config.KYCaddress).click(); 
//				  	    	 System.out.println("My KYCaddress  clicked!!");	  	    	 
//				  	    	 driver.findElement(Config.KYCaddressupload).click(); 
//				  	    	 System.out.println("My KYCaddressupload empty  clicked!!");
			          
				  	    	test.log(LogStatus.PASS, "withdrawal & KYC verified ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			}
				    			catch(Exception f10)
				    			{
				    				System.out.println("withdrawal & kyc  failed");
				    				f10.getMessage();
				    				test.log(LogStatus.FAIL, "withdrawal &  KYC failed ", "To open Screenshots : <a href=' "
				    						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			} 
				  	 Thread.sleep(5000);
			  	 
	  	 //Change password 
				  	   try {	  	    
				  	    	 driver.findElement(Config.changepassword).click(); 
				  	    	 driver.findElement(Config.changepsdbutton).click(); 
			  	    	     System.out.println("My changepsdbutton  clicked!!");
		       
			  	    		test.log(LogStatus.FAIL, " Change password  Verified ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			}
				    			catch(Exception f10)
				    			{
				    				System.out.println("Change password failed");
				    				f10.getMessage();
				    				test.log(LogStatus.FAIL, "Change password Failed ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			} 
				  	 Thread.sleep(5000);

				     //  KYC
				  	   try {	  	    
				  	    	 driver.findElement(Config.KYCmenu).click(); 
				  	    	 System.out.println("My KYC  clicked!!");
				  	    	test.log(LogStatus.PASS, "KYC verified ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			}
				    			catch(Exception f10)
				    			{
				    				System.out.println("kyc  Failed");
				    				f10.getMessage();
				    				test.log(LogStatus.FAIL, "KYC failed ", "To open Screenshots : <a href=' "
				    						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			} 
				  	 Thread.sleep(4000);
			  	 //Transcation
				  	   try {	  	    
				  	    	 driver.findElement(Config.transcation).click(); 
				  	    	 System.out.println("My transcation  clicked!!");
				  	    	/*driver.findElement(Config.transcationselect).click(); 
				  	    	 System.out.println("My transcationselect  clicked!!");
				  	    	 driver.findElement(Config.transcationrummy).click(); 
				  	    	 System.out.println("My transcationrummy  clicked!!");
				  	    	 driver.findElement(Config.searchbutton).click(); 
				  	    	 System.out.println("My searchbutton  clicked!!");*/
				  	    	Thread.sleep(5000);
				  	    	 driver.findElement(Config.Deposittab).click(); 
				  	    	 System.out.println("My Deposittab  clicked!!");
				  	    	Thread.sleep(5000);
				  	    	 driver.findElement(Config.TDStab).click(); 
				  	    	 System.out.println("My TDStab  clicked!!");
				  	    	Thread.sleep(5000);
				  	    	 driver.findElement(Config.withdrawtab).click(); 
				  	    	 System.out.println("My withdrawtab  clicked!!");
			  	    	test.log(LogStatus.PASS, "My transcation all sub menu verified ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			}
				    			catch(Exception f10)
				    			{
				    				System.out.println("transcation  failed");
				    			f10.getMessage();
				    			test.log(LogStatus.FAIL, "My transcation all sub menu Failed ", "To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");		
				    			} 	
				  	 Thread.sleep(5000);
  	 //Rakeback
	  	   try {	  	    
	  	    	 driver.findElement(Config.Rakeback).click(); 
	  	    	 System.out.println("My Rakeback  clicked!!"); 	    	          
	  	    	test.log(LogStatus.PASS, "Rakeback verified ", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
	    			}
	    			catch(Exception f10)
	    			{
	    				System.out.println("Rakeback  failed");
    				f10.getMessage();
    				test.log(LogStatus.FAIL, "Rakeback FAILEd ", "To open Screenshots : <a href=' "
    						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	    			} 
	  	
	  	 //GameHistory
	  	   try {	  	    
	  	    	 driver.findElement(Config.Gamehistory).click(); 
	  	    	 System.out.println("My Gamehistory  clicked!!");
//	  	 	Thread.sleep(5000);
//	  	    	 driver.findElement(Config.Gamehistoryrummy).click(); 
//	  	    	 System.out.println("My Gamehistoryrummy  clicked!!");
//	  	   	Thread.sleep(5000);
//	  	    	 driver.findElement(Config.gamesearchbutton).click(); 
//	  	    	 System.out.println("My game history searchbutton  clicked!!"); 	    	
	  	    	// System.out.println("My Game history record  clicked!!");
	  	    	test.log(LogStatus.PASS, "Game History menu Verified ", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	    			}
	    			catch(Exception f10)
	    			{
	    				System.out.println("Gamehistory  failed");
    				f10.getMessage();
    				test.log(LogStatus.FAIL, " Game history Failed ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	    			}
	  	 Thread.sleep(5000);
		  	   //Tournament History
			  	   try {	  	    
			  	    	 driver.findElement(Config.tournament).click(); 
			  	    	 System.out.println("My tournament  clicked!!");
			  	   	Thread.sleep(5000);
			  	  driver.findElement(Config.tournamentrummy).click(); 
		  	    	 System.out.println("My tournament  clicked!!");
		  	   	Thread.sleep(5000);
			  	  driver.findElement(Config.toursearch).click(); 
		  	    	 System.out.println("My tournament  clicked!!");	    	
			  	    	 System.out.println("My tournament record  clicked!!");
			  	    	 
		  	    	test.log(LogStatus.PASS, " Tournament  history Verified ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
			    			}
			    			catch(Exception f10)
			    			{
			    				System.out.println("tournament  failed");
			    				f10.getMessage();
			    				test.log(LogStatus.FAIL, " Tournament history Failed ", "To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
			    			}
			  	
	}}

	  	   

			
				
				
				
				
				






