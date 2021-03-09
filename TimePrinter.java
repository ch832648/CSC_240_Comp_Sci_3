/** 
Name: Caitlin Harris
Date: 3/20/2019
Title: TimePrinter.java
Description: This program prints the current time in analog format
**/

import java.util.Date;
public class TimePrinter{
   public static void main(String[]args){
   
   //Create a Date object
   Date currentTime = new Date();
   
   //Display time and date
   String str = String.format("%tc", currentTime);
   System.out.println(str);
   
   //Store the current time
   int num1 = Character.getNumericValue(str.charAt(11));
   int num2 = Character.getNumericValue(str.charAt(12));
   int num3 = Character.getNumericValue(str.charAt(14));
   int num4 = Character.getNumericValue(str.charAt(15));
   
   //Create a Timer object
   Timer time1 = new Timer(num1, num2, num3, num4);
   
   //Call method @printDate to print time in analog format
   time1.printDate();
   
      
   
   
   
   
   }
}
