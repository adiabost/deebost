import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        
        //add booleans from module 6 code
        boolean testingWidth = true;
        boolean testingHeight = true;

        // Prompt user to input wall's height
        //add code from module 6
        do {
        	testingHeight = true;
        	try {
        		System.out.println("Enter wall height (feet): ");
                if (!scnr.hasNextDouble()) {
                	scnr.next();
                	continue;
                }
                wallHeight = scnr.nextDouble();
                if (!(wallHeight >= 0)) {
                	throw new Exception("Invalid Height -- Please input a valid height");
                }
        	} catch (Exception a) {
        		System.out.println("Error occured" + a.getMessage());
        		testingHeight = false;
        	}
        }
        while(!testingHeight);


        // Prompt user to input wall's width
        do {
        	testingWidth = true;
        	try {
        		System.out.println("Enter wall width (feet): ");
                if (!scnr.hasNextDouble()) {
                	scnr.next();
                	continue;
                }
                wallWidth = scnr.nextDouble();
                if (!(wallWidth >= 0)) {
                	throw new Exception("Invalid Width -- Please input a valid width");
                }
        	} catch (Exception a) {
        		System.out.println("Error occured" + a.getMessage());
        		testingWidth = false;
        	}
        }
        while(!testingWidth);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        
        //use math.ceil
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
