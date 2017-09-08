/*
 * Carrie Ward
 * Version 1.0
 * Homework Assignment #2
 * A java program that calculates the pay if the pay doubles every work day.
 */

package pennypay;

import java.text.NumberFormat;
import java.util.Scanner;

public class PennyPay {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int day = 1;            // a counter, start at day one
            int daysWorked;         // total number of days worked
            double pennies = 1;     // number of pennies
            double pay;   // pay will start at 1 penny, then double each day worked.

            // prompt the user to input the number of days worked
            System.out.print("Enter the number of days worked: ");

            // store user data
            daysWorked = in.nextInt();

            // verify that the user input is at least one day
            while (daysWorked < 1) {
                // display error message and request new data from the user
                System.out.print( "The number of days must be greater than 0.\n" );
                System.out.print( "Re-enter the number of days worked: " );
                daysWorked = in.nextInt();
            }

            // create a While Loop that doubles the pay each day worked
            // pay is calcualted in pennies, convert the dollar amount ( pennies / 100 )

            while ( day <= daysWorked ){
                // displays the daily pay amount in dollars not pennies (pennies / 100)
                NumberFormat input = NumberFormat.getCurrencyInstance();
                System.out.println( "Daily pay " + input.format(pennies/100) );

                pay = pennies *=2;      // pay doubles each day
                day++;
            }

    }   // end main
}   // end class
