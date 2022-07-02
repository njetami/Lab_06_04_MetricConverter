import java.util.Scanner;

public class Metric {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet =0;
        double inches =0;
        double METER_TO_MILE = 0.000621371;
        double METER_TO_FOOT = 3.28084;
        double METER_TO_INCH = 39.3701;

        System.out.println("I can convert from meters!");

        System.out.print("Please enter length in meters: ");
         if(in.hasNextDouble()){
         meters = in.nextDouble();
         miles  = meters * METER_TO_MILE;
         feet   = meters * METER_TO_FOOT;
         inches = meters * METER_TO_INCH;}

         else {
             System.out.println("invalid");
         }

        System.out.println( " The equivalent in miles 0f : " + meters + " is "  + miles);
        System.out.println(" ");
        System.out.println( " The equivalent in feet of: " + meters +  " is " + feet);
        System.out.println(" ");
        System.out.println( " The equivalent in inches of: " + meters + " is " + inches);
        System.out.println(" ");

    }
}
