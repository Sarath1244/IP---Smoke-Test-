package Pages;

import org.openqa.selenium.By;

public class Config {
		
	            //public static final By Addagreeterms = null;
				//Login Form
				public static By loginicon          = By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[8]/a");
				public static By userpwsdempty       = By.xpath("//*[@id=\"a_class\"]/div");
            	public static By username            = By.id("username");
		        public static By password            = By.xpath("//*[@id=\"login-form\"]/div[2]/div[2]/input");
		        public static By submit_Button       = By.xpath("//*[@id=\"a_class\"]/div");
		        
		        //preloginheadermenu
		        public static By Howtoplay             =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[3]/a");
                public static By rummy                 =  By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[3]/ul/li[2]/a");
                public static By Toprummyvariations    =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[2]");
                public static By RummyRules            =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[3]");
                public static By RummySequence         =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[4]");
                public static By BestOnlineRummyTricks =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[5]");
                public static By IndianRummy           =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[6]");
                public static By RummyCalculator       =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[7]");
                public static By RummyStrategy         =  By.xpath("/html/body/div[12]/div[1]/div[2]/a[8]");
		        public static By promotions          =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[4]/a");
		        public static By rummypromotions     =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[4]/ul/li/a");
		       // public static By daily1leaderboard   =  By.xpath("/html/body/div[11]/div[1]/div[2]/a[2]");
		       public static By handchallenge       =  By.xpath(" /html/body/div[11]/div[1]/div[2]/a[2]");
		        
		        
		        public static By tournamnet          =  By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[5]/a");
                public static By Leaderboards        =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[6]/a");
	            public static By cashLeaderboards    =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[6]/ul/li[1]/a");
		        public static By dailyleaderboard    =  By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[6]/ul/li[1]/div/a[1]");	      
		        public static By handchallenge1      =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[6]/ul/li[1]/div/a");
		       
		        
		        public static By Leaderboardranking  =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[6]/ul/li[2]/a");
                public static By dailyleaderboard1   =  By.xpath("/html/body/div[9]/div/div/nav/div/div[2]/div/ul/li[6]/ul/li[2]/div/a[1]");   
                public static By popupclose          =  By.xpath("//*[@id=\"leaderboard_close\"]");           
                public static By handchallenge2      =  By.xpath("/html/body/div[10]/div/div/nav/div/div[2]/div/ul/li[6]/ul/li[2]/div");          
                public static By loginbutton         =  By.xpath("//*[@id=\"rummy_leaderboard_ok\"]"); 
                
                //postloginhamburgermenu
                public static By  postloginhamburger =  By.xpath("//*[@id=\"navbarDropdown\"]/img"); 
                public static By  Myprofile          =  By.xpath(" //*[@id=\"navbarNavDropdown\"]/ul/li[10]/div/p[1]/a"); 
          
                public static By  wallet             =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[1]/a"); 
             
                public static By  Rummywallet        =  By.linkText("Wallet");
                public static By  pokerwallet        =  By.linkText("Poker Wallet");
                public static By  fantasywallet      =  By.linkText("Fantasy Wallet");
                public static By  Gamewallet       =   By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[2]/a");
               // public static By  transferbutton     =  By.id(" /html/body/div[12]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[3]/div");
               public static By   Addcash           =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[2]/a");
           
                public static By   Addcashcontinue   =  By.xpath("/html/body/div[12]/div[7]/div/div[2]/div/div/div[2]/div/form/div/div[4]");
                 public static By   withdrawpage      =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[3]/a");  
          
                public static By   KYCClose          =  By.xpath("/html/body/div[12]/div[5]/div/div/div[1]"); 
                public static By   KYCmenu         =  By.xpath(" /html/body/div[12]/div[1]/div/div[1]/div/div[6]/a"); 
                
               
                public static By   KYCCompletion     =  By.xpath("/html/body/div[11]/div[6]/div/div/div[3]/input[1]");   
                public static By   KYCpan            =  By.xpath("//html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[1]/a"); 
                public static By   KYCaddress        =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a"); 
                public static By   KYCaddressupload  =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/form/div[9]/input"); 
                public static By   Rakeback          =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[8]/a"); 
                public static By   transcation       =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[7]/a");
                public static By   transcationselect =  By.xpath(" /html/body/div[12]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/select");
               
                public static By   transcationrummy  =  By.xpath("/html/body/div[12]/div[7]/div/div[1]/div//a");
                public static By   searchbutton      =  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[1]/div/div[2]/a/div");
                public static By   Deposittab        =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a");
                public static By   TDStab            =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[3]/a");
                public static By   withdrawtab       =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[4]/a"); 
                
               
                public static By   Gamehistory       =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[9]/a");
                public static By   Gamehistoryrummy  =  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[2]/div/select/option[2]");
                public static By   gamesearchbutton  =  By.xpath("html/body/div[11]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/div");
                
                public static By   tournament        =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/div/div[10]/a");
                public static By   tournamentrummy   =  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/select/option[2]");
                public static By   toursearch        =  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[1]/div/div[2]/a/div");
                
                public static By   changepassword    =  By.xpath("/html/body/div[12]/div[7]/div/div[1]/div/div[5]/a");
                public static By   changepsdbutton   =  By.xpath("/html/body/div[12]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/form/div[4]/span");

              
                //Post Login  hamburgermenu
             // public static By  postloginhamburger =  By.cssSelector("//*[@id=\"navbarDropdown\"]"); 
//                public static By  Myprofile          =  By.xpath("/html/body/div[10]/div/div/nav/div[2]/div/div/ul/li[10]/div/p[1]/a"); 
//                public static By  wallet             =  By.linkText("Wallet"); 
//                public static By  Rummywallet        =  By.xpath("/html/body/div[11]/div[1]/div/div[1]/div/div[1]/ul/a[3]");
//                public static By  pokerwallet        =  By.linkText("Poker Wallet");
//                public static By  fantasywallet      =  By.linkText("Fantasy Wallet");
//                public static By  transferbutton     =  By.id("rummy_cash_submit");
//                public static By  lessthanzero       =  By.xpath("rummy_amount-error");
//                public static By  enteramount        =  By.xpath("//*[@id=\"rummy_amount\"]");
//                public static By   Addcash           =  By.xpath("/html/body/div[11]/div[1]/div/div[1]/div/div[3]/a");
//                public static By   Addcashcontinue   =  By.xpath("//*[@id=\"add_cash_submit\"]");          
//                public static By   addcashinputfiled =  By.xpath("/html/body/div[11]/div[7]/div/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/input");
//                public static By   Addagreeterms     =  By.xpath("/html/body/div[11]/div[7]/div/div[2]/div/div/div[2]/div/form/div/div[3]/div/label/span");
//                
               
             
                
                
                public static By   gamewallet        =  By.xpath("/html/body/div[11]/div[1]/div/div[1]/div/div[2]/a");
                public static By   gamewallettransfer=  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[3]/div");
                public static By   gamewalletinput   =  By.xpath("/html/body/div[11]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div/div/input[1]");
                
               //site rummy icon
                public static By   rummyicon         =  By.xpath("/html/body/div[12]/div[1]/div[2]/div/div/div[2]/a/div/div[1]/img");
              
               
                public static By   rummymore         =  By.xpath("/html/body/div[11]/div[1]/div[2]/div/div/div[2]/a/div/div[2]/div/div/button");
                public static By   takemelobby       =  By.xpath("//*[@class='btn-solid download-btn hvr-sweep-to-right mr-2']");
                
                //Game Lobby 
                public static By   gamelobby         =  By.id("rummyLink");
                public static By   practicegame      =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div[3]");   
                public static By   practicepoints    =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]");
                public static By   practicepools     =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]");
                public static By   practicedeals     =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]");
                public static By   practicepowerplay =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[4]");
                public static By   takeseatpractice  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[8]/div");	
                public static By   takeseatpracticein=  By.xpath("//html/body/div[1]/div[1]/div[3]/div/div[4]/div[2]");
              
                //Cash game take seat &  Tab selected
                public static By   pointstab         =  By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");         
                public static By   pointsjoin        =  By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[8]/div[1]");
                public static By   pointtakeseat     =  By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[2]");  
                public static By   poolstab          =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]");
                public static By   dealstab          =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]");
                public static By   powerplaytab      =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[4]");
                
                //cash game filter 
                public static By   lowfilterchecked  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input");
                public static By  lowfilterunchecked =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input");
                public static By   midfilterchecked  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/input");
                public static By  midfilterunchecked =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/input");
                public static By   highfilterchecked =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[4]/div[1]/input");
                public static By highfilterunchecked =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[4]/div[1]/input");
                
               //Tour tab &  Regsiter 
                public static By   tourtab           =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div[2]");
                public static By   tourconfirmpopup  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[6]/div");
                public static By   tourok            =  By.xpath("/html/body/div[1]/notification-dialog/div/div/div[2]/div/div/div");                
                public static By   tourregsiter      =  By.xpath("/html/body/div[1]/notification-dialog/div/div/div[2]/div/div/div[1]");
                public static By   tourunregsiter    =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[6]/div");
                
                // Tournament filter 
                public static By   tourlowchecked    =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input");
                public static By   tourlowunchecked  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input"); 
                public static By   tourmidchecked    =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/input");
                public static By   tourmidunchecked  =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/input");           
                public static By   tourhighchecked   =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input");
                public static By   tourhighunchecked =  By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input");    
              
              // Rummy Lobby Hamburger menu
                public static By   closeiconlobby      =  By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]");
                public static By   lobbyhamburger      =  By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[3]");
                public static By   walletlobby         =  By.xpath("/html/body/div[1]/div[1]/div[9]/div/div/div/p[1]");
                public static By   profilelobby        =  By.xpath("/html/body/div[1]/div[1]/div[9]/div/div/div/p[2]");
                public static By   addcashlobby        =  By.xpath("//*[@id=\"hamburgerMenu\"]/div/div/p[3]");
            
                public static By   Withdrawlobby       =  By.xpath("/html/body/div[1]/div[1]/div[9]/div/div/div/p[4]");
                public static By   promotionlobby      =  By.xpath("/html/body/div[1]/div[1]/div[9]/div/div/div/p[5]");
                public static By   DBlobby             =  By.xpath(" /html/body/div[1]/div[1]/div[9]/div/div/div/p[6]");
                public static By   handchallengelobby  =  By.xpath("/html/body/div[1]/div[1]/div[9]/div/div/div/p[7]");
                public static By   howtoplaylobby      =  By.xpath(" /html/body/div[1]/div[1]/div[9]/div/div/div/p[8]");
                public static By   contactuslobby      =  By.xpath("//*[@id=\"hamburgerMenu\"]/div/div/p[8]");
              
                //Forgot pswd
                public static By   forgot              =  By.xpath("/html/body/div[12]/div[1]/div/div/form/div[2]/div[3]/div/a");
                public static By   forgotsubmit        =  By.xpath("/html/body/div[12]/div[1]/div/div/form/div/a/div");
                public static By   forgotinpufiled     =  By.xpath("/html/body/div[12]/div[1]/div/div/form/div/div[1]/input[1]");
                public static By   OTPBox              =  By.xpath("/html/body/div[12]/div[2]/div/div/form/div[6]");
                
                
                //Reset  password 
                public static By   NewPassword          =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/form/div[1]/div[2]/input");
                public static By   Confirmpassword      =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/form/div[2]/div[2]/input");
                public static By   Resetsubmit         =  By.xpath("/html/body/div[12]/div[1]/div/div[1]/form/a/div/span");
               
                
                
//		public static By accountView = By.xpath("/html/body/div[4]/div/nav");
//		public static By loginVerify = By.xpath("//div[@class='header_welcome_postlogin postlogin_box22']");
//		
	}

 