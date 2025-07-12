import java.util.Random;
import java.util.Scanner;
      public class menu4 {
	
		 public void  menu(int dish1,int dish2,int dish3,int dish4,int dish5,String customerName,String customerAddress) {
		    	Scanner scan = new Scanner(System.in);
		    	System.out.println("Menu 4 Desserts ");
		    	 System.out.println("1. Apple Pie  - $5.99");
		    	    System.out.println("2. Baklava  - $8.99");
		    	    System.out.println("3. Brownies - $6.99");
		    	    System.out.println("4. Cupcake - $3.99");
		    	    System.out.println("5. Thai Sticky Rice - $2.99");
		    	    System.out.println("6. Complete Order");
		    	    System.out.println("Enter the item number you want to order (or 6 to complete order and get receipt): ");
		    	    int result = scan.nextInt();
		    	    switch(result) {
		    	    case 1:
		    	    	calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,1);
		    	    	break;
		    	    case 2:
		    	    	calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,2);
		    	    	break;
		    	    case 3:
		    	    	calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,3);
		    	    	break;
		    	    case 4:
		    	    	calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,4);
		    	    	break;
		    	    case 5:
		    	    	calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,5);
		    	    	break;
		    	    case 6:
		    	    	reciept(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);
		    	    	break;
		    	    	default:calc(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress,7);
		    	    		break;
		    	    }scan.close();

		    }
		    public void  calc(int dish1,int dish2,int dish3,int dish4,int dish5,String customerName,String customerAddress,int calcu) {
		    	Scanner scan = new Scanner(System.in);
		    	System.out.println("____________________________________________");
		    	String item=" ";
		    	switch(calcu) {
		    	case 1:
		    		item = "Apple Pie";
		    		break;
		    	case 2:
		    		item = "Baklava";
		    		break;
		    	case 3:
		    		item = "Brownies";
		    		break;
		    	case 4:
		    		item = "Cupcake";
		    		break;
		    	case 5:
		    		item = "Thai Sticky Rice";
		    		break;
		    	default: menu(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);
		    	break;
		    	}
		    	System.out.println("The item you order is "+item+" how many "+item+" do you want to add to your cart?");
		    	System.out.println("____________________________________________");
		    	int added = scan.nextInt();
		    	switch(calcu) {
		    	case 1:
		    		dish1 = dish1+added;
		    		break;
		    	case 2:
		    		dish2= dish2+added;
		    		break;
		    	case 3:
		    		dish3= dish3+added;
		    		break;
		    	case 4:
		    		dish4= dish4 + added;
		    		break;
		    	case 5:
		    		dish5= dish5 +added;
		    		break;
		    		default:menu(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);
		    		break;
		    	}
		    	System.out.println(added+" "+item+" has been sucessfully added to the cart");
		    	 menu(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);System.out.println(added+" "+item+" has been sucessfully added to the cart");
		     	System.out.println("would you like to add more item. if yes pick 1 if no pick 2");
		    	int gorecipet = scan.nextInt();
		    	if(gorecipet ==2) {
		    		reciept(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);
		    	}
		    	 menu(dish1,dish2,dish3,dish4,dish5,customerName,customerAddress);
		    	 scan.close();
		    }
		    public void  reciept(int dish1,int dish2,int dish3,int dish4,int dish5,String customerName,String customerAddress) {
		Random ran = new Random();
		    	Scanner scan = new Scanner(System.in);
		    	System.out.println("****************************************************************");
		    	System.out.println("Order summary for "+customerName+":                             ");
		    	System.out.println("Order ID "+ran.nextInt(999999999)+":                            ");
		    	System.out.println("****************************************************************");
		    	if(dish1>=1) { 
		    		System.out.println("Apple Pie    "+dish1);
		    	}
		    	if(dish2>=1) { 
		    		System.out.println("Baklava     "+dish2);
		    	}
		    	if(dish3>=1) { 
		    		System.out.println("Brownies     "+dish3);
		    	}
		    	if(dish4>=1) { 
		    		System.out.println("Cupcake     "+dish4);
		    	}
		    	if(dish5>=1) { 
		    		System.out.println("Thai Mango Sticky Rice "+dish5);
		    	}
		    	double total,tax,tip;
		    	
		    	total=((dish1*5.99)+(dish2*8.99)+(dish3*6.99)+(dish4*3.99)+(dish5*2.99));
		  	    float totalFloat = (float) total;
		  	    System.out.println("   Subtotal: $"+totalFloat                                       );
		  	    tax= total*0.08;
		  	    float totaltax = (float) tax;
		  	    System.out.println("   Tax(8%) : $"+totaltax);
		  	    tip= total*0.15;
		  	    float totaltip = (float) tip;
		    	System.out.println("   Recommended gratuity(8%) : $"+totaltip                        );
		    	total= total+tax+tip;
		    	System.out.println("   *************************************************************");
		    	System.out.println("   Order summary for "+customerName+":                          ");
		    	System.out.println("   Order ID "+ran.nextInt(999999999)+":                         ");
		    	System.out.println("   *************************************************************");
		    	System.out.println("   Total Amount (including tax        )$"+totalFloat+"\n        ");
		    	System.out.println("                                                                ");
		    	System.out.println("   Thank you,"+customerName+", for using Food Panda!            ");
		    	System.out.println("                                                                ");
		    	System.out.println("   Your order will be sent to this address:   "+customerAddress  );
		    	System.out.println("   *************************************************************");
		    	System.out.println("   -------------------------------------------------------------");
		   	    System.out.println("   Thank you for choosing food panda hope to see you again      ");
		   	    System.out.println("   -------------------------------------------------------------");
		   	    System.out.println("   Enter any key to go to the main menu again                   ");
			    System.out.println("   *************************************************************");
			    
			    scan.nextLine();
			    restaurant res = new restaurant();
			    res.restaurantselect();
			    scan.close();
			
			
			
		    }
		    
		    
		    
		    
	}


