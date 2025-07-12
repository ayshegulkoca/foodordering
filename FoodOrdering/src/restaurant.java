import java.util.Scanner;

public class restaurant {
    public void  restaurantselect() {
    	Scanner scan = new Scanner(System.in);
    	  System.err.println("Welcome to Foodpanda Ordering App!");
    	        System.out.print("Enter your name: ");
    	     String   customerName = scan.nextLine();
    	     System.out.print("Enter your address: ");
    	     String   customerAddress = scan.nextLine();
    	     System.out.println("Choose a menu:");
    	     System.out.println("1. Menu 1 European cuisine");
    	     System.out.println("2. Menu 2 Thai cuisine");
    	     System.out.println("3. Menu 3 Indian cuisine");
    	     System.out.println("4. Menu 4 Desserts");
    	     System.out.println("5. Menu 5 Drinks");
    	     System.out.println("6. Exit");
    	     System.err.println("Please use numbers to indicate what do you choose.      ");
    	     int menuPick = scan.nextInt();
    	switch(menuPick) {
    	case 1: Menu1 menus = new Menu1();
    	menus.menu(0,0,0,0,0,customerName,customerAddress);
    		
    		break;
    	case 2: menu2 menus2 = new menu2();
    	menus2.menu(0,0,0,0,0,customerName,customerAddress);
    	
		break;	
    	case 3 :menu3 menus3 = new menu3();
    	menus3.menu(0,0,0,0,0,customerName,customerAddress);
    	
    	
    		
		break;
    	case 4 :menu4 menus4 = new menu4();
    	 menus4.menu(0,0,0,0,0,customerName,customerAddress);
    		
		break; 
    	case 5: menu5 menus5 = new menu5();
    	 menus5.menu(0,0,0,0,0,customerName,customerAddress);
    	
		break;
    	case 6: 
		default: 
			
			
			 System.out.println("_______________________________________________________");
			 System.err.println("Thank you for choosing food panda hope to see you again");
			 return1();
    		break;
    	}
    	scan.close();	
    }
    public void return1() {
    	Scanner scan = new Scanner(System.in);
    	 System.out.println("__________________________________________________________");
		 	System.out.println("Enter any key to go to the main menu again             ");
			System.out.println("_______________________________________________________");
			
			scan.nextLine();
			restaurantselect();
			scan.close();
    }
    }
