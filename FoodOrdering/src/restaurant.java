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
        }
    }
}