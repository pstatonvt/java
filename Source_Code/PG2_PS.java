import java.util.Scanner;

public class PG2_PS{


//This method takes in values as kilometers and outputs them in miles
//It does this by multiplying the input value by 0.621371
	public static double kilo_miles(double kilo){

	  return kilo*0.621371;
	  
		}

//This method takes in values as miles and outputs them in kilometers
//It does this by multiplying the input value by 1.609344
		public static double miles_kilo(double miles){

		return miles*1.609344;

		}

//This method takes in values as meters and outputs them in feet
//It does this by multiplying the input value by 3.28084
		public static double meters_feet(double meters){

		return meters*3.28084;

		}

//This method takes in values as feet and outputs them in meters
//It does this by multiplying the input value by 0.3048
		public static double feet_meters(double feet){

		return feet*0.3048;
		
		}

//This method takes in values as centimeters and outputs them in inches
//It does this by multiplying the input value by 0.393701
		public static double centi_inches(double centi){

		return centi*0.393701;
		
		}

//This method takes in values as inches and outputs them in centimeters
//It does this by multiplying the input value by 2.54
		public static double inches_centi(double inches){

		return inches*2.54;

		}

////////////////////////////////////MAIN///////////////////////////////////////

/*this is the main method. it prints out the title and heading, as well as gives
the user options */

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Patrick Staton");
		System.out.println("CS103-01");
		System.out.println("Programming Assignment #2");
		System.out.println();

		System.out.println("This program will present the user with a main menu of options which the user can choose from to");
		System.out.println("perform simple unit conversions. Once the user has chosen an option from the menu, the program should");
		System.out.println("provide a brief explanation of the conversion to be performed and allow the user to enter a quantity to be");
		System.out.println("converted.");
		System.out.println();

/* the loop starts here. i've initialized a counter to keep the loop going.
the options menu is printed below */
		int count = 1;
		while (count > 0){

			System.out.println("\nHere is the main menu. Enter your choice (or q to quit): ");
			System.out.println("------------------------------------");
			System.out.println("| a) Convert kilometers to miles   |");
			System.out.println("| b) Convert miles to kilometers   |");
			System.out.println("| c) Convert meters to feet        |");
			System.out.println("| d) Convert feet to meters        |");
			System.out.println("| e) Convert centimeters to inches |");
			System.out.println("| f) Convert inches to centimeters |");
			System.out.println("------------------------------------");
			System.out.print("Input here: ");

			char option_choice = input.next().charAt(0);

/* a scanner reads in the input from the user, and a case/switch system is used
to call on the various methods for value conversion */

			switch(option_choice){
			  
				case 'a': 
  				System.out.println();
  				System.out.println("You chose: 'a) Convert kilometers to miles'");
      		System.out.print("Please enter a value in kilometers: ");
      		double kilo = input.nextDouble();
      		System.out.println();
    		
            if (kilo < 0){
            System.out.println("You can't have negative values!");
            kilo_miles(kilo);
            }
      		  
      		 System.out.printf(kilo + " kilometers in miles is: %4.2f", kilo_miles(kilo));
           System.out.println();
           continue;
					
				case 'b': 
			  	System.out.println();
      		System.out.println("You chose: 'b) Convert miles to kilometers'");
      		System.out.print("Please enter a value in miles: ");
			    double miles = input.nextDouble();
			    System.out.println();
			    
        		if (miles < 0){
        			System.out.println("You can't have negative values!");
        			miles_kilo(miles);
        		}
			    
			    System.out.printf(miles + " miles in kilometers is: %4.2f", miles_kilo(miles));
  			  System.out.println();
    		  continue;
    		
				case 'c': 
				  System.out.println();
      		System.out.println("You chose: 'c) Convert meters to feet'");
      		System.out.print("Please enter a value in meters: ");
      		double meters = input.nextDouble();
      		
      			if (meters < 0){
        			System.out.println("You can't have negative values!");
        			meters_feet(meters);
        		}
      		
  				System.out.printf(meters + " meters in feet is: %4.2f", meters_feet(meters));
      		System.out.println();
					continue;
					
				case 'd': 
				  System.out.println();
				  System.out.println("You chose: 'd) Convert feet to meters'");
				  System.out.print("Please enter a value in feet: ");
				  double feet = input.nextDouble();
				    
				    if(feet < 0){
				      System.out.println("You can't have negative values!");
				      feet_meters(feet);
				    }
				    
				  System.out.printf(feet + " feet in meters is: %4.2f", feet_meters(feet));
				  System.out.println();
				  continue;
				  
				case 'e': 
				  System.out.println("You chose: 'e) Convert centimeters to inches'");
				  System.out.print("Please enter a value in centimeters: ");
				  double centi = input.nextDouble();
				  
				    if (centi < 0){
				      System.out.println("You can't have negative values!");
				      centi_inches(centi);
				    }
				  
				  System.out.printf(centi + " centimeters in inches is: %4.2f",centi_inches(centi));  
					System.out.println();
					continue;
					
				case 'f': 
				  System.out.println("You chose: 'f) Convert inches to centimeters'");
				  System.out.print("Please enter a value in inches: ");
				  double inches = input.nextDouble();
				  
				    if (inches < 0){
				      System.out.println("You can't have negative values!");
				      inches_centi(inches);
				    }
				    
				  System.out.printf(inches + " inches in centimeters is: %4.2f", inches_centi(inches));
				  System.out.println();
				  continue;
				  
				case 'q':
				  System.out.println("Shutting down...");
				  System.exit(0);
				  
				default:
					System.out.println("\nInvalid command! Please try again.");
					continue;

				}
    	}
		}
  }
