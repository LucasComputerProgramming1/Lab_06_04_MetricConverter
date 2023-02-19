import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        //Declaring Variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        //Prompt For Input
        System.out.println("Please enter your measurement in meters: ");
        //Input Meters
        if(in.hasNextInt())
        {
            meters = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash+" is and invalid input, please restart and try again.");
        }
        //Processing
        inches = meters*39.3701;
        miles = meters*0.000621371;
        feet = meters*3.28084;
        //Output
        System.out.println("Your measurement in inches is " + inches);
        System.out.println("Your measurement in miles is " + miles);
        System.out.println("Your measurement in feet is " + feet);
    }
}