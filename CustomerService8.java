import java.util.Scanner;
public class CustomerService8 {
	public static void main(String[] args) {
	    
	    Scanner cs = new Scanner(System.in);
	    String NUMBER = "*123#";
	    
		System.out.println("ENTER NUMBER: ");
		String users = cs.nextLine();
				    if ( users.equals(NUMBER))
				    {
				        mainmenu();
				    }
				    else
				    {
				        System.out.println("INVALID NUMBER");
				    }
	}
	public static void mainmenu()
	{
	    Scanner cs = new Scanner(System.in);
	    
	    System.out.println("\n***********************************");
	    System.out.println("BAL:100.00");
	    System.out.println("GPT:0.00");
	    System.out.println("1. 1G VIDEO ARAW-ARAW, 7DAYS");
	    System.out.println("2. 1G STORIES ARAW-ARAW, 7DAYS");
	    System.out.println("3. GIGA ");
	    System.out.println("4. DOUBLE GIGA/DATA");
	    System.out.println("5. SURFSAYA");
	    System.out.println("6. ALL DATA");
	    System.out.println("7. ALLNET:OTH");
	    System.out.println("8. Bal:Svcs");
	    System.out.println("0.");
	    System.out.println("*********************************");
	    	    System.out.println("ENTER CODE: ");
	    	    int x = cs.nextInt();
	    	       cls();         
	    	                
	    	                if( x == 1)
	    	                {
	    	                    MENU1();
	    	                }
	    	                
	    	                else if(x == 2)
	    	                {
	    	                    MENU2();
	    	                }
	    	                
	    	                else if(x == 3)   
	    	                {
	    	                    MENU3();   
	    	                }
	    	                
	    	                else if( x == 4)
	    	                {
	    	                    MENU4();   
	    	                }
	    	                
	    	                else if( x == 5) 
	    	                {
	    	                    MENU5();   
	    	                }
	    	                
	    	                else if( x == 6)
	    	                {
	    	                    MENU6();
	    	                }
	    	                
	    	                else if( x == 7)
	    	                {
	    	                    MENU7();
	    	                }
	    	                
	    	                else if( x == 8)
	    	                {
	    	                    MENU8();
	    	                }
	    	                
	    	                else if (x == 0)
	    	                {
	    	                 System.out.println("THANK YOU!");
	    	                }
	    	                
	    	                else{
	    	                    System.out.println("INVALID CODE!");
	    	                }
	}
	public static void MENU1()
	{
	   Scanner cs = new Scanner(System.in);
	    
	    System.out.println("\n***********************************");
	 	System.out.println("1G VIDEO ARAW-ARAW, 7DAYS FOR YOUTUBE, NBA TV, GIGAPLAY, IWANT TFC, CIGNAL PLAY(7GB) + 2 GB, 7DAYS, P99");
	    System.out.println("1. SUBSCRIBE");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");   
	                    
	                    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                        cls();
	                        if( x == 1)
	                        {
	                            System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        else
	                        {
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void MENU2()
	{
	    Scanner cs = new Scanner(System.in);
	    System.out.println("\n***********************************");
	    System.out.println("1 GB STORIES ARAW-ARAW for TikTok, IG, FB, Twitter, Kumu (7 GB) + 2 GB, 7 Days, P99!");
	    System.out.println("1. SUBSCRIBE");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	    
	                    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                        cls();
	                        if( x == 1)
	                        {
	                            System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        else
	                        {
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void MENU3()
	{
	    Scanner cs = new Scanner(System.in);
	    
	    System.out.println("\n***********************************");
	    System.out.println("1.Get 1 GB VIDEO ARAW-ARAW, 7 DAYS");
	    System.out.println("2.Get 1 GB STORIES ARAW-ARAW, 7 DAYS");
	    System.out.println("3.VIDEO");
	    System.out.println("4.STORIES");
	    System.out.println("5.GAMES");
	    System.out.println("6.STUDY");
	    System.out.println("7.WORK");
	    System.out.println("8.K-VIDEO");
	    System.out.println("9.VIDEO+");
	    System.out.println("10.STORIES+");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	        if( x == 1)            
	        {
	        cls();
	        VIDEOARAWARAW1();
	        }
	        
	        if( x == 2)
	        {
	        cls();
	        STORIESARAWARAW2();    
	        }
	        
	        if( x == 3)
	        {
	        cls();
	        VIDEO3();
	        }
	        
	        if( x == 4)
	        {
	        cls();
	        STORIES4();
	        }
	        
	        if( x == 5)
	        {
	        cls();
	        GAMES5();
	        }
	        
	        if( x == 6)
	        {
	        cls();
	        STUDY6();
	        }
	        
	        if( x == 7) 
	        {
	        cls();
	        WORK7();
	        }
	        
	        if( x == 8)
	        {
	        cls();
	        KVIDEO8();
	        }
	        
	        if( x == 9)
	        {
	        cls();
	        VIDEOS9();
	        }
	        
	        if( x == 10)
	        {
	        cls();
	        STORIES10();
	        }
	        
	        if( x == 0)
	        {
	        cls();
	        mainmenu();
	        }
	        
	        else if( x == 11)
	        {
	        System.out.println("INVALID CODE");
	        }
	    }	        
	    public static void VIDEOARAWARAW1(){
	        
	    Scanner cs = new Scanner(System.in);
	       
	    System.out.println("\n***********************************");
	    System.out.println("Get 1 GB VIDEO ARAW-ARAW for Youtube, NBA TV, GigaPlay, iWantTFC, Cignal Play, (7 GB) + 2 GB, 7 Days, P99!");
	    System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
	                        if( x == 1)
	                        {
	                          cls();
	                            System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	    }
        public static void STORIESARAWARAW2(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Get 1 GB STORIES ARAW-ARAW for TikTok, IG, FB, Twitter, Kumu (7 GB) + 2 GB, 7 Days, P99!");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                        if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
            
        public static void VIDEO3(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.Get 1 GB VIDEO ARAW-ARAW PLUS:");
        System.out.println("2.Get 2 GB 7 Days P99");
        System.out.println("3.Get 4 GB 30 Days P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
            
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        GET1GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        GET2GB2();
	                        }
	                    
	                    if( x == 3)
	                        {
	                        cls();
	                        GET4GB3();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
            
        public static void GET1GB1(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Get 1 GB VIDEO ARAW-ARAW PLUS:");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	         
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GET2GB2(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("2.Get 2 GB 7 Days P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GET4GB3(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("3.Get 4 GB 30 Days P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES4(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.Buy 1 GB 3 DAYS P50");
        System.out.println("2.Buy 2 GB 7 DAYS P99");
        System.out.println("3.Buy 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        
        System.out.println("ENTER CODE: ");
        int x = cs.nextInt();
         cls();   
                        if( x == 1)
	                        {
	                        cls();  
	                        BUY1GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        BUY2GB2();
	                        }
	                    
	                    if( x == 3)
	                        {
	                        cls();
	                        BUY4GB3();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
        public static void BUY1GB1(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Buy 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void BUY2GB2(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Buy 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	                        
        }
        public static void BUY4GB3(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Buy 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GAMES5(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.CoC AoV Royale ML FB GAMING");
        System.out.println("2.WILD RIFT COD ML FB GAMING");
        System.out.println("0. BACK");
        System.out.println("*********************************");
            
        System.out.println("ENTER CODE: ");
                         int x = cs.nextInt();
                         cls();
                         
                         if( x == 1)
	                        {
	                        cls();  
	                        COCAOV1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        WILDRIFT2();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
            
        } 
        public static void COCAOV1(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("CoC AoV Royale ML FB GAMING");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GAMES5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void WILDRIFT2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("2.WILD RIFT COD ML FB GAMING");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GAMES5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STUDY6(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.Study 2GB 7 DAYS P99");
        System.out.println("2.Study 4GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        STUDY2GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        STUDY4GB2();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
	    public static void STUDY2GB1(){
	    Scanner cs = new Scanner(System.in); 
	    
	    
        System.out.println("\n***********************************");
        System.out.println("Study 2GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STUDY6();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	    } 
        public static void STUDY4GB2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Study 4GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STUDY6();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }  
        public static void WORK7(){
        Scanner cs = new Scanner(System.in);
         
        System.out.println("\n***********************************");
        System.out.println("1.Work 1 GB 3 DAYS P50");
        System.out.println("2.Work 2 GB 7 DAYS P99");
        System.out.println("3.Work 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
         
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        WORK1GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        WORK2GB2();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        WORK4GB3();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
         
        }
        public static void WORK1GB1(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Word 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void WORK2GB2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Work 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
        }
        public static void WORK4GB3(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("3.Work 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        } 
        }
        public static void KVIDEO8(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.kVIDEO 1 GB 3 DAYS P50");
        System.out.println("2.KVIDEO 2 GB 7 DAYS P99");
        System.out.println("3.KVIDEO 4 GB 30 DAYS P299");
        System.out.println("0. BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        KVIDEO1GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        KVIDEO2GB2();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        KVIDEO4GB3();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
        public static void KVIDEO1GB1(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("kVIDEO 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void KVIDEO2GB2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("KVIDEO 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void KVIDEO4GB3(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("KVIDEO 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                          
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void VIDEOS9(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.VIDEO 1 GB 3 DAYS P75");
        System.out.println("2.VIDEO 2 GB 7 DAYS P149");
        System.out.println("3.VIDEO 4 GB 30 DAYS P449");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        VIDEO1GB1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        VIDEO2GB2();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        VIDEO4GB3();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
        
        }
        public static void VIDEO1GB1(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 1 GB 3 DAYS P75");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
        }
        public static void VIDEO2GB2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 2 GB 7 DAYS P149");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	               int x = cs.nextInt();
                   cls();
	               if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void VIDEO4GB3(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 4 GB 30 DAYS P449");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES10(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.STORIES 1 GB 3 DAYS P50");
        System.out.println("2.STORIES 2 GB 7 DAYS P99");
        System.out.println("3.STORIES 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    if( x == 1)
	                        {
	                        cls();  
	                        STORIES1GB();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        STORIES2GB2();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        STORIES4GB3();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
        }
        public static void STORIES1GB(){
        Scanner cs = new Scanner(System.in);
        
        
        System.out.println("\n***********************************");
        System.out.println("STORIES 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES10();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES2GB2(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("STORIES 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES10();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES4GB3(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("3.STORIES 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES10();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
    }
    public static void MENU4()
    {
    
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.DOUBLE GIGA");
    System.out.println("2.DOUBLE DATA");
    System.out.println("3.FREE GIGA");
    System.out.println("0.BACK");
    System.out.println("*********************************");
    
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
	                        {
	                        cls();  
	                        DOUBLE1();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        DOUBLE2();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        DOUBLE3();
	                        }
	                    else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
    }
    public static void DOUBLE1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("GIGA VIDEO");
    System.out.println("GIGA STORIES");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        GIGAVIDEOS1();
	                        }
	                        
	                     if( x == 2)
	                        {
	                        cls();
	                        GIGASTORIES2();
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGAVIDEOS1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.GIGA VIDEO 2 GB 7 DAYS P99");
    System.out.println("2.GIGA VIDEO 4 GB 30 DAYS P299");
    System.out.println("0.BACK");
    System.out.println("*********************************");
    
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        if( x == 1)
	                        {
	                        cls();  
	                        GIGAVIDEO1();
	                        }
	                        
	                     if( x == 2)
	                        {
	                        cls();
	                        GIGAVIDEOS2();
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
    }
    public static void GIGAVIDEO1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("GIGA VIDEO 2 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGAVIDEOS2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("GIGA VIDEO 4 GB 30 DAYS P299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGASTORIES2(){
    Scanner cs = new Scanner(System.in);
    System.out.println("\n***********************************");
    System.out.println("1.GIGA STORIES 2 GB 7 DAYS P99");
    System.out.println("2.GIGA STORIES 4 GB 30 DAYS P299 ");
    System.out.println("0.BACk");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        if( x == 1)
	                        {
	                        cls();  
	                        GIGASTORIES2GB1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        GIGASTORIES4GB2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGASTORIES2GB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("GIGA STORIES 2 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GIGASTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGASTORIES4GB2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("2.GIGA STORIES 4 GB 30 DAYS P299 ");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GIGASTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
    } 
    public static void DOUBLE2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.DATA VIDEO");
    System.out.println("2.DATA STORIES");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        DATAVIDEO1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        DATASTORIES2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }                    
    public static void DATAVIDEO1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.DATA 4 GB 7 DAYS P99");
    System.out.println("2.DATA 8 GB 30 DAYS P299");
    System.out.println("0.BACK");
    System.out.println("*********************************");
    
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        DATA4GB1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        DATA8GB2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void DATA4GB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("DATA 4 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        DATAVIDEO1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void DATA8GB2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("2.DATA 8 GB 30 DAYS P299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        DATAVIDEO1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void DATASTORIES2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.DATA STORIES 4 GB 7 DAYS P99");
    System.out.println("2.DATA STORIES 8 GB 30 DAYS P299");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                         if( x == 1)
	                        {
	                        cls();  
	                        DATASTORIES4GB1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        DATASTORIES8GB2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        DOUBLE2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void DATASTORIES4GB1(){
    Scanner cs = new Scanner(System.in); 
    
    System.out.println("\n***********************************");
    System.out.println("1DATA STORIES 4 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        DATASTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void DATASTORIES8GB2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("DATA STORIES 8 GB 30 DAYS P299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        DATASTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
    }
    public static void DOUBLE3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.FREE VIDEO");
    System.out.println("2.FREE STORIES");
    System.out.println("0.BACk");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
	                        {
	                        cls();  
	                        FREEVIDEO1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        FREESTORIES2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void FREEVIDEO1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.FREE VIDEO 2 GB 7 DAYS P99");
    System.out.println("2.FREE VIDEO 4 GB 30 DAYS P299");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                       
                        if( x == 1)
	                        {
	                        cls();  
	                        FREE2GB1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        FREE4GB2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        DOUBLE3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void FREE2GB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("FREE VIDEO 2 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FREEVIDEO1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void FREE4GB2(){
    
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("FREE VIDEO 4 GB 30 DAYS P299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FREEVIDEO1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void FREESTORIES2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.FREE STORIES 2 GB 7 DAYS P99");
    System.out.println("2.FREE STORIES 4 GB 30 DAYS P299");
    System.out.println("0.BACk");
    System.out.println("*********************************");
    
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        if( x == 1)
	                        {
	                        cls();  
	                        FREESTORIES2GB1();
	                        }
	                    if( x == 2)
	                        {
	                        cls();
	                        FREESTORIES4GB2();
	                        }
	               
	                        else if( x == 0)
	                        {
	                        MENU4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void FREESTORIES2GB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("FREE STORIES 2 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FREESTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }                    
	public static void  FREESTORIES4GB2(){
	Scanner cs = new Scanner(System.in);
	System.out.println("\n***********************************");
	System.out.println("FREE STORIES 4 GB 30 DAYS P299");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FREESTORIES2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void MENU5()
	{
	    
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("1.SURFSAYA Get 1 GB VIDEO ARAW ARAW 7 DAYS");
	System.out.println("2.SURFSAYA Get 1 GB STORIES ARAW ARAW 7 DAYS");
	System.out.println("3.SURFSAYA FB");
	System.out.println("4.SURFSAYA ML");
	System.out.println("5.SURFSAYA ALLNEt");
	System.out.println("0.BACK");
	System.out.println("*********************************");
	
	System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                          {
                          cls();
                          SURFSAYAGET1GB1();
                          }
                        
                        if( x == 2)
                          {
                          cls();
                          SURFSAYAGET1GB2();
                          }
                        
                        if( x == 3)
                          {
                          cls();
                          SURFSAYAFB3();
                          }
                         
                         if(x == 4) 
                          {
                          cls();
                          SURFSAYAML4();
                          }
                          
                          if( x == 5)
                          {
                          cls();
                          SURFSAYAALLNET5();
                          }
                          
                          else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void SURFSAYAGET1GB1(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("SURFSAYA Get 1 GB VIDEO ARAW ARAW 7 DAYS");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void SURFSAYAGET1GB2(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("2.SURFSAYA Get 1 GB STORIES ARAW ARAW 7 DAYS");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void SURFSAYAFB3(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("1.FB 2 DAYS 100 MB P20");
	System.out.println("2.FB 3 DAYS 300 MB P30");
	System.out.println("3.FB 7 DAYS 500 MB P49");
	System.out.println("4.FB 7 DAYS 1500 MB P99");
	System.out.println("5.FB 30 DAYS 2 GB P199");
	System.out.println("0.BACK");
	System.out.println("*********************************");
	
	System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                          {
                          cls();
                          FB2DAYS100MB1();
                          }
                        
                        if( x == 2)
                          {
                          cls();
                          FB3DAYS300MB2();
                          }
                        
                        if( x == 3)
                          {
                          cls();
                          FB7DAYS500MB3();
                          }
                         
                         if(x == 4) 
                          {
                          cls();
                          FB7DAYS1500MB4();
                          }
                          
                          if( x == 5)
                          {
                          cls();
                          FB30DAYS2GB5();
                          }
                          
                          else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void FB2DAYS100MB1(){
    
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
	System.out.println("1.FB 2 DAYS 100 MB P20");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAFB3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void FB3DAYS300MB2(){
	
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("FB 3 DAYS 300 MB P30");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAFB3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void FB7DAYS500MB3(){
	
	Scanner cs = new Scanner(System.in);
	
    System.out.println("\n***********************************");
	System.out.println("3.FB 7 DAYS 500 MB P49");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAFB3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
    public static void FB7DAYS1500MB4(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("4.FB 7 DAYS 1500 MB P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAFB3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void FB30DAYS2GB5(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("5.FB 30 DAYS 2 GB P199");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAFB3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void SURFSAYAML4(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.ML 2 DAYS 100 MB P20");
    System.out.println("2.ML 3 DAys 300 MB P30");
    System.out.println("3.ML 7 DAYS 1500 MB P99");
    System.out.println("4.ML 30 DAYS 2 GB P199");
    System.out.println("0.BACk");
    System.out.println("*********************************");
    
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                         cls();
                         ML2DAYS100MB1();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            ML3DAYS300MB2();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            ML7DAYS1500MB3();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            ML30DAYS2GB4();
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	                        
    } 
	public static void  ML2DAYS100MB1(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("ML 2 DAYS 100 MB P20");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAML4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void ML3DAYS300MB2(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("ML 3 DAys 300 MB P30");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAML4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void ML7DAYS1500MB3(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");    
	System.out.println("3.ML 7 DAYS 1500 MB P99");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAML4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }     
	}  
	public static void ML30DAYS2GB4(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("4.ML 30 DAYS 2 GB P199");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAML4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}
	public static void SURFSAYAALLNET5(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("Get Fb ARAW ARAW Plus Unli ALLnet Calls & Texts PLUS:");
	System.out.println("1.ALLNET 2 DAYS 100 MB P40");
	System.out.println("2.ALLNET 3 DAYS 300 MB P55");
	System.out.println("3.ALLNET 7 DAYS 1500 MB P149");
	System.out.println("4.ALLNET 30 DAYS 2 GB P319");
	System.out.println("0.BACK");
	System.out.println("*********************************");
	
	System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                         cls();
                         ALLNET2DAYS100MB1();
                        }
                        
                        if( x == 2)
                        {
                        cls();
                        ALLNET3DAYS300MB2();                        
                        }
                        
                        if( x == 3)
                        {
                        cls();
                        ALLNET7DAYS1500MB();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            ALLNET30DAYS2GB4();
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }

	    
	}
	public static void ALLNET2DAYS100MB1(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("ALLNET 2 DAYS 100 MB P40");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAALLNET5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	
	    
	} 
    public static void ALLNET3DAYS300MB2(){
    Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("ALLNET 3 DAYS 300 MB P55");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAALLNET5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void ALLNET7DAYS1500MB(){  
    Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("ALLNET 7 DAYS 1500 MB P149");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAALLNET5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void ALLNET30DAYS2GB4(){
    Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
	System.out.println("4.ALLNET 30 DAYS 2 GB P319");
	System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SURFSAYAALLNET5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void MENU6()
    {
        
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.ALLDATA");
    System.out.println("2.ALLDATA PLUS");
    System.out.println("3.MAGIC DATA (NO EXPIRY)");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                         cls();
                         ALLDATA1();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            ALLDATAPLUS2();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            MAGICDATANOEXPIRY3();
                        }
                        
                        else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                     else{
	                       System.out.println("INVALID CODE!");
	                     }
                        
    }
    public static void ALLDATA1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY DATA FOR ALL SITES (SHAREABLE)");
    System.out.println("1.ALLDATA 2 GB 3 DAYS P50");
    System.out.println("2.ALLDATA 6 GB 7 DAYS P99");
    System.out.println("3.ALLDATA 24 GB 30 DAYS P299");
    System.out.println("0.BACK");
    System.out.println("*********************************");
    
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                        cls();
                        ALLDATA2GB3DAYS1();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                        ALLDATA6GB7DAYS2();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                        ALLDATA24GB30DAYS3();    
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU6();
	                        }
	                        
	                     else{
	                       System.out.println("INVALID CODE!");
	                     }
	                     
    } 
    public static void ALLDATA2GB3DAYS1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLDATA 2 GB 3 DAYS P50");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATA1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }     
    public static void ALLDATA6GB7DAYS2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLDATA 6 GB 7 DAYS P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATA1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void ALLDATA24GB30DAYS3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLDATA 24 GB 30 DAYS P299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATA1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
        
    }  
    public static void ALLDATAPLUS2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY DATA FOR ALL SITES (SHAREABLE) PLUS UNLI ALL NET CALLS & TEXTS");
    System.out.println("1.ALLNET 2 GB 3 DAYS P75");
    System.out.println("2.ALLNET 6 GB 7 DAYS P149");
    System.out.println("3.ALLNET 24 GB 30 DAYS P499");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                        cls();
                        ALLNET2GB3DAYS1();
                        }
                        
                        if( x == 2)
                        {
                        cls();
                        ALLNET6GB7DAYS2();
                        }
                        
                        if( x == 3)
                        {
                        cls();
                        ALLNET24GB30DAYS3();
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU6();
	                        }
	                        
	                     else{
	                       System.out.println("INVALID CODE!");
	                     }
    }
    public static void ALLNET2GB3DAYS1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLNET 2 GB 3 DAYS P75");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATAPLUS2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }                  
    public static void ALLNET6GB7DAYS2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("2.ALLNET 6 GB 7 DAYS P149");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATAPLUS2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }                     
    public static void ALLNET24GB30DAYS3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLNET 24 GB 30 DAYS P499");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        ALLDATAPLUS2();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
	public static void MAGICDATANOEXPIRY3(){                  
	Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY MAGIC DATA FOR ALL SITES (NO EXPIRY)");
    System.out.println("1.MAGIC DATA 2 GB P99");
    System.out.println("2.MAGIC DATA 6 GB P199");
    System.out.println("3.MAGIC DATA 24 GB P399");
    System.out.println("0.BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                        cls();
                        MAGICDATA2GB1();
                        }
                        
                        if( x == 2)
                        {
                        cls();
                        MAGICDATA6GB2();
                        }
                        
                        if( x == 3)
                        {
                        cls();
                        MAGICDATA24GB3();
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU6();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
                        
	}
    public static void MAGICDATA2GB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY MAGIC DATA FOR ALL SITES (NO EXPIRY)");
    System.out.println("MAGIC DATA 2 GB P99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MAGICDATANOEXPIRY3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void  MAGICDATA6GB2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY MAGIC DATA FOR ALL SITES (NO EXPIRY)");
    System.out.println("MAGIC DATA 6 GB P199");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MAGICDATANOEXPIRY3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
    }
    public static void MAGICDATA24GB3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ENJOY MAGIC DATA FOR ALL SITES (NO EXPIRY)");
    System.out.println("MAGIC DATA 24 GB P399");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MAGICDATANOEXPIRY3();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
	public static void MENU7()
	{
	
	Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.ALLNET GET 1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("2.ALLNET GET 1 GB STORIES ARAW ARAW 7 DAYS");
    System.out.println("3.GIGA");
    System.out.println("4.Allnet");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls(); 
                        
                        if( x == 1)
                        {
                        cls();
                        ALLNETGET1GBARAWARAW7DAYS1();
                        }
                        
                        if( x == 2)
                        {
                        cls();    
                        ALLNETGET1GBSTORIESARAWRAW7DAYS2();    
                        }
                        
                        if( x == 3)
                        {
                        cls();
                        GIGA3();
                        }
                        
                        if( x == 4)
                        {
                        cls();
                        Allnet4();
                        }
                        
                        else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}                        
	public static void ALLNETGET1GBARAWARAW7DAYS1(){
	Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("ALLNET GET 1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	}                         
    public static void ALLNETGET1GBSTORIESARAWRAW7DAYS2(){                 
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("2.ALLNET GET 1 GB STORIES ARAW ARAW 7 DAYS");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void GIGA3(){
    Scanner cs = new Scanner(System.in);
    
        System.out.println("\n***********************************");
	    System.out.println("1.Get 1 GB VIDEO ARAW-ARAW, 7 DAYS");
	    System.out.println("2.Get 1 GB STORIES ARAW-ARAW, 7 DAYS");
	    System.out.println("3.VIDEO");
	    System.out.println("4.STORIES");
	    System.out.println("5.GAMES");
	    System.out.println("6.STUDY");
	    System.out.println("7.WORK");
	    System.out.println("8.K-VIDEO");
	    System.out.println("9.VIDEO+");
	    System.out.println("10.STORIES+");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	        if( x == 1)            
	        {
	        cls();
	        VIDEOARAWARAW111();
	        }
	        
	        if( x == 2)
	        {
	        cls();
	        STORIESARAWARAW22();    
	        }
	        
	        if( x == 3)
	        {
	        cls();
	        VIDEO33();
	        }
	        
	        if( x == 4)
	        {
	        cls();
	        STORIES90();
	        }
	        
	        if( x == 5)
	        {
	        cls();
	        GAMES89();
	        }
	        
	        if( x == 6)
	        {
	        cls();
	        STUDY79();
	        }
	        
	        if( x == 7) 
	        {
	        cls();
	        WORK9();
	        }
	        
	        if( x == 8)
	        {
	        cls();
	        KVIDEO888();
	        }
	        
	        if( x == 9)
	        {
	        cls();
	        VIDEOS99();
	        }
	        
	        if( x == 10)
	        {
	        cls();
	        STORIES798();
	        }
	        
	        if( x == 0)
	        {
	        cls();
	        MENU7();
	        }
	        
	        else if( x == 11)
	        {
	        System.out.println("INVALID CODE");
	        }
	    }	        
	    public static void VIDEOARAWARAW111(){
	        
	    Scanner cs = new Scanner(System.in);
	       
	    System.out.println("\n***********************************");
	    System.out.println("Get 1 GB VIDEO ARAW-ARAW for Youtube, NBA TV, GigaPlay, iWantTFC, Cignal Play, (7 GB) + 2 GB, 7 Days, P99!");
	    System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
	                        if( x == 1)
	                        {
	                          cls();
	                            System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	    }
        public static void STORIESARAWARAW22(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Get 1 GB STORIES ARAW-ARAW for TikTok, IG, FB, Twitter, Kumu (7 GB) + 2 GB, 7 Days, P99!");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                        if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
            
        public static void VIDEO33(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.Get 1 GB VIDEO ARAW-ARAW PLUS:");
        System.out.println("2.Get 2 GB 7 Days P99");
        System.out.println("3.Get 4 GB 30 Days P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
            
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        GET1GBVIDEOARAWARAWPLUS112();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        GET2GB223();
	                        }
	                    
	                    if( x == 3)
	                        {
	                        cls();
	                        GET4GB334();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
            
        public static void GET1GBVIDEOARAWARAWPLUS112(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Get 1 GB VIDEO ARAW-ARAW PLUS:");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	         
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO33();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GET2GB223(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("2.Get 2 GB 7 Days P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO33();
	                        }
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GET4GB334(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("3.Get 4 GB 30 Days P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
	    System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        VIDEO33();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES90(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.Buy 1 GB 3 DAYS P50");
        System.out.println("2.Buy 2 GB 7 DAYS P99");
        System.out.println("3.Buy 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        
        System.out.println("ENTER CODE: ");
        int x = cs.nextInt();
         cls();   
                        if( x == 1)
	                        {
	                        cls();  
	                        BUY1GB5671();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        BUY2GB2456();
	                        }
	                    
	                    if( x == 3)
	                        {
	                        cls();
	                        BUY4GB37445();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
        public static void BUY1GB5671(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Buy 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                          cls();  
	                           System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES90();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void BUY2GB2456(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("Buy 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES90();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	                        
        }
        public static void BUY4GB37445(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Buy 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        else if( x == 0)
	                        {
	                        STORIES90();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void GAMES89(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("1.CoC AoV Royale ML FB GAMING");
        System.out.println("2.WILD RIFT COD ML FB GAMING");
        System.out.println("0. BACK");
        System.out.println("*********************************");
            
        System.out.println("ENTER CODE: ");
                         int x = cs.nextInt();
                         cls();
                         
                         if( x == 1)
	                        {
	                        cls();  
	                        COCAOV1324();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        WILDRIFT212();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
            
        } 
        public static void COCAOV1324(){
        Scanner cs = new Scanner(System.in);
            
        System.out.println("\n***********************************");
        System.out.println("CoC AoV Royale ML FB GAMING");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GAMES89();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void WILDRIFT212(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("2.WILD RIFT COD ML FB GAMING");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GAMES89();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STUDY79(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.Study 2GB 7 DAYS P99");
        System.out.println("2.Study 4GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        STUDY2GB7DAYS112();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        STUDY4GB254();
	                        }
	                    
	                    else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
	    public static void STUDY2GB7DAYS112(){
	    Scanner cs = new Scanner(System.in); 
	    
	    
        System.out.println("\n***********************************");
        System.out.println("Study 2GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STUDY79();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	    } 
        public static void STUDY4GB254(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Study 4GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STUDY79();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }  
        public static void WORK9(){
        Scanner cs = new Scanner(System.in);
         
        System.out.println("\n***********************************");
        System.out.println("1.Work 1 GB 3 DAYS P50");
        System.out.println("2.Work 2 GB 7 DAYS P99");
        System.out.println("3.Work 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
         
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                       WORK1GB123();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        WORK2GB2456();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        WORK4GB3523();
	                        }
	                    else if( x == 0)
	                        {
	                        GIGA3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
         
        }
        public static void WORK1GB123(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Word 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void WORK2GB2456(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("Work 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
        }
        public static void WORK4GB3523(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("3.Work 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
	    System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        WORK9();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        } 
        }
        public static void KVIDEO888(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.kVIDEO 1 GB 3 DAYS P50");
        System.out.println("2.KVIDEO 2 GB 7 DAYS P99");
        System.out.println("3.KVIDEO 4 GB 30 DAYS P299");
        System.out.println("0. BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        KVIDEO1GB11214();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        KVIDEO2GB2152();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        KVIDEO4GB3235();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
        }
        public static void KVIDEO1GB11214(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("kVIDEO 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO888();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void KVIDEO2GB2152(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("KVIDEO 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO888();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void KVIDEO4GB3235(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("KVIDEO 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                          
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        KVIDEO888();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void VIDEOS99(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.VIDEO 1 GB 3 DAYS P75");
        System.out.println("2.VIDEO 2 GB 7 DAYS P149");
        System.out.println("3.VIDEO 4 GB 30 DAYS P449");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    
	                    if( x == 1)
	                        {
	                        cls();  
	                        VIDEO1GB1356();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        VIDEO2GB2256();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        VIDEO4GB312();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
        
        }
        public static void VIDEO1GB1356(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 1 GB 3 DAYS P75");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS99();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
        }
        public static void VIDEO2GB2256(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 2 GB 7 DAYS P149");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	               int x = cs.nextInt();
                   cls();
	               if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS99();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void VIDEO4GB312(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("VIDEO 4 GB 30 DAYS P449");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        VIDEOS99();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES798(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("1.STORIES 1 GB 3 DAYS P50");
        System.out.println("2.STORIES 2 GB 7 DAYS P99");
        System.out.println("3.STORIES 4 GB 30 DAYS P299");
        System.out.println("0.BACK");
        System.out.println("*********************************");
        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
	                    cls();
	                    if( x == 1)
	                        {
	                        cls();  
	                        STORIES1GB156();
	                        }
	                    
	                    if( x == 2)
	                        {
	                        cls();
	                        STORIES2GB2980();
	                        }
	                   
	                    if( x == 3)
	                        {
	                        cls();
	                        STORIES4GB3175();
	                        }
	                    else if( x == 0)
	                        {
	                        MENU3();
	                        }
	                        
	                        else{
	                        System.out.println("INVALID CODE!");    
	                        }
	                    
        }
        public static void STORIES1GB156(){
        Scanner cs = new Scanner(System.in);
        
        
        System.out.println("\n***********************************");
        System.out.println("STORIES 1 GB 3 DAYS P50");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES798();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES2GB2980(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("STORIES 2 GB 7 DAYS P99");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES798();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        }
        public static void STORIES4GB3175(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("\n***********************************");
        System.out.println("3.STORIES 4 GB 30 DAYS P299");
        System.out.println("1. REGISTER");
        System.out.println("0. BACK");
	    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        STORIES798();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void Allnet4(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("1.AllNet 20");
    System.out.println("2.AllNet 50");
    System.out.println("3.AllNet 99");
    System.out.println("4.AllNet 299");
    System.out.println("5.AllNet 499");
    System.out.println("6.AllNet 599");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                            cls();
                            AllNet201();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            AllNet502();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            AllNet993();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            AllNet2994();
                        }
                        
                        if( x == 5)
                        {
                            cls();
                            AllNet4995();
                        }
                        
                        if( x == 6)
                        {
                            cls();
                            AllNet5996();
                        }
                        
                        else if( x == 0)
	                        {
	                        MENU7();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
                        
                        
    }  
    public static void AllNet201(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("AllNet 20");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }     
    public static void AllNet502(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("Allnet 50");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void AllNet993(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("AllNet 99");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void AllNet2994(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("AllNet 299");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void AllNet4995(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("AllNet 499");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
    } 
    public static void AllNet5996(){
    Scanner cs = new Scanner(System.in);
        
    System.out.println("\n***********************************");    
    System.out.println("AllNet");
    System.out.println("AllNet 599");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        Allnet4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void MENU8()
    {
    
    Scanner cs = new Scanner(System.in);
    System.out.println("\n***********************************");
    System.out.println("BAL: P100.00");
    System.out.println("GPT: 0.00");
    System.out.println("1. 1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("2. 1 GB STORIES ARAW ARAW 7 DAYS");
    System.out.println("3. BALANCE");
    System.out.println("4. GIGA POINTS");
    System.out.println("5. SMART CREDIT");
    System.out.println("6. INTERNATIONAL");
    System.out.println("0. BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                        cls();
                        GBVIDEOARAWARAW12412();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            GBSTORIESARAWARAW12412();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            BALANCE3();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            GIGAPOINTS();
                        }
                        
                        if( x == 5)
                        {
                            cls();
                            SMARTCREDIT5();
                        }
                        
                        if( x == 6)
                        {
                            cls();
                            INTERNATIONAL6();
                        }
                        
                        else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
        
    }
    public static void GBVIDEOARAWARAW12412(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void GBSTORIESARAWARAW12412(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1 GB STORIES ARAW ARAW 7 DAYS");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }
    public static void BALANCE3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("099941241412"); 
    System.out.println("Regular Load: P100.00 EXP: 30Jan2022 09:30PM");
    System.out.println("SHAREABLE DATA MB: 100 EXP: N/A");
    System.out.println("10. MORE");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                            cls();
                            MORE1();
                        }
                        
                        else{
	                            System.out.println("INVALID CODE!");
                        }
    
    }
    public static void MORE1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("17 nov 2021 12:46 PM");
    System.out.println("VIDEO  EVERY MB: 1024 Exp: 16 Nov 2021");
    System.out.println("12:00 AM");
    System.out.println("*********************************");

    }
    public static void GIGAPOINTS(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************"); 
    System.out.println("You Have 0.00 GigaPoints.");
    System.out.println("1 GigaPoint = 1 Peso");
    System.out.println("Download the giga life app for more points for MORE rewards!");
    System.out.println("1.Download Now");
    System.out.println("2.Get 1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                            cls();
                            DOWNLOADNOW1();
                        }
                        
                        if( x == 2)
                        {
                             cls();
                             GBVIDEOARAWARAW12321();
                        }
                        
                        else if( x == 0)
                        {
                         cls();
                         MENU8();
                        }
                        
                        else{
	                            System.out.println("INVALID CODE!");
                        }
    
    } 
    public static void DOWNLOADNOW1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("Thank you! A text message with the Download link will be Sent Shortly");
    System.out.println("Simple. Easy. Rewarding! That's the GigaLife App!");
    
        
    }
    public static void GBVIDEOARAWARAW12321(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************"); 
    System.out.println("Get 1 GB VIDEO ARAW ARAW 7 DAYS");
    System.out.println("1. REGISTER");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        GIGAPOINTS();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void SMARTCREDIT5(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************"); 
    System.out.println("Kulang sa Load? SAKTOLOAD Load at P8!");
    System.out.println("1.AllNET 30MB");
    System.out.println("2.8 AllNet Texts");
    System.out.println("3.2 AllNet Mins");
    System.out.println("4.Other Offers");
    System.out.println("0.MORE EXCITING PROMOS");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        ALLNET30MB1();
	                        }
	                        
	                    if( x == 2)
	                    {
	                     cls();
	                     AllNETTEXTS2();
	                    }
	                    
	                    if( x == 3)
	                    {
	                        cls();
	                        ALLNETTEXTS3();
	                    }
	                    
	                    if( x == 4)
	                    {
	                        cls();
	                        OTHEROFFERS4();
	                    }
	                    
	                    else if( x == 0)
	                        {
	                        mainmenu();
	                        }
	                    
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void ALLNET30MB1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************"); 
    System.out.println("5 Pesos wil be Deducted to your balance on your Next Load");
    System.out.println("1.30MB");
    System.out.println("1. CONTINUE");
    System.out.println("0. BACK");
	System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SMARTCREDIT5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void AllNETTEXTS2(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("Get 8 AllNet Texts for 1 DAY? P8 will be duducted on your Next load");
    System.out.println("1.CONTINUE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SMARTCREDIT5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	                        
    } 
    public static void ALLNETTEXTS3(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("Get 8 AllNet Texts for 1 DAY? P8 will be duducted on your Next load");    
    System.out.println("1.Subscribe");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        SMARTCREDIT5();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void OTHEROFFERS4(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.4 TriNet Texts P4");
    System.out.println("2.5 AllNet Texts P5");
    System.out.println("3.1 TriNet Min P6.5");
    System.out.println("4.9 TriNet Texts P7");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                            cls();
                            TRINETTEXTSP41();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            ALLNETTEXTSP52();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            TRINETMINP63();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            TRINETTEXTSP74();
                        }
                        
                        else{
	                            System.out.println("INVALID CODE!");
	                        }
                        
    } 
    public static void TRINETTEXTSP41(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("4 TriNet Texts P4");
    System.out.println("1.CONTINUE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        OTHEROFFERS4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void ALLNETTEXTSP52(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("5 AllNet Texts P5");
    System.out.println("1.CONTINUE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        OTHEROFFERS4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
        
        
        
    }
    public static void TRINETMINP63(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1 TriNet Min P6.5");
    System.out.println("1.CONTINUE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        OTHEROFFERS4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
    }     
    public static void TRINETTEXTSP74(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("9 TriNet Texts P7");
    System.out.println("1.CONTINUE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        OTHEROFFERS4();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }      
    public static void INTERNATIONAL6(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("1.Flexi Call & Text Abroad");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
	                    if( x == 1)
	                        {
	                        cls();  
	                        FLEXICALL1();
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        MENU8();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void FLEXICALL1(){
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("Flexi Call & Text Abroad");
    System.out.println("1.Flexi Call 30");
    System.out.println("2.Flexi Call 50");
    System.out.println("3.Flexi Call 100");
    System.out.println("4.Flexi Call 300");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
                        
                        if( x == 1)
                        {
                        cls();
                        FLEXICALL301();
                        }
                        
                        if( x == 2)
                        {
                            cls();
                            FLEXICALL502();
                        }
                        
                        if( x == 3)
                        {
                            cls();
                            FLEXICALL1003();
                        }
                        
                        if( x == 4)
                        {
                            cls();
                            FLEXICALL3004();
                        }
                        
                        else if( x == 0)
	                        {
	                        INTERNATIONAL6();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    } 
    public static void FLEXICALL301(){ 
    Scanner cs = new Scanner(System.in);
    
    System.out.println("\n***********************************");
    System.out.println("Enjoy Discounted calls or Texts to loved ones abroad");
    System.out.println("for 3 DAYS P30!");
    System.out.println("1.SUBSCRIBE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
    
                        if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FLEXICALL1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    
                            
    }
	public static void FLEXICALL502(){
	Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("Enjoy Discounted calls or Texts to loved ones abroad");
    System.out.println("for 5 DAYS P50!");
    System.out.println("1.SUBSCRIBE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
    
                        if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FLEXICALL1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
	} 
    public static void FLEXICALL1003(){
    Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("Enjoy Discounted calls or Texts to loved ones abroad");
    System.out.println("for 9 DAYS P100!");
    System.out.println("1.SUBSCRIBE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
    
                        if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FLEXICALL1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
    }     
    public static void FLEXICALL3004(){
    Scanner cs = new Scanner(System.in);
	
	System.out.println("\n***********************************");
    System.out.println("Enjoy Discounted calls or Texts to loved ones abroad");
    System.out.println("for 30 DAYS P300!");
    System.out.println("1.SUBSCRIBE");
    System.out.println("0.BACK");
    System.out.println("*********************************");
	        
        System.out.println("ENTER CODE: ");
	                    int x = cs.nextInt();
                        cls();
    
                        if( x == 1)
	                        {
	                        cls();  
	                        System.out.println("SUCCESS!");
	                        }
	                        
	                        else if( x == 0)
	                        {
	                        FLEXICALL1();
	                        }
	                        
	                        else{
	                            System.out.println("INVALID CODE!");
	                        }
         
        
    }
    public static void cls()
    {
    
         
	System.out.print("\033[H\033[2J");
    System.out.flush();
	}
}

