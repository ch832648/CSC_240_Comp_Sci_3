/** 
Name: Caitlin Harris
Date: 3/18/2019
Title: CalendarPrinter.java
Description: This program collects a month and year from the user and prints
the calendar for the specified month and year/
**/

import java.util.Scanner;
import java.util.ArrayList;

public class CalendarPrinter{
  
   public static void main(String [] args) {
   
      //Create Scanner object
      Scanner kbd = new Scanner (System.in);
   
      //Get user input: month and year
      System.out.print("Enter a month (1-12): ");
      int month = kbd.nextInt();
      System.out.print("Enter a 4-digit year (ex. 1945): ");
      int year = kbd.nextInt();
      
      //Create a Dater object
      Dater date1 = new Dater(month,year);
      //Create array to hold dates
      int dateAry[][] = new int [7][7];
     
      int i=1; //counter for days in month
      int start=date1.zellersFormula(month,year); //first day of the month
      int end=date1.numDay(); //last day of the month
      String blank = " "; //blank space
      
      
      //Insert days of month into array
      for(int row=0;row<dateAry[0].length;row++){
         for(int col=0;col<dateAry.length;col++){
            if(row==0 && col>=start){
               dateAry[row][col]=i;
               i++;
            }
            else if(i>end)
               dateAry[row][col]=0;
                  
            else if(row>=1){
               dateAry[row][col]=i;
               i++;
               
            } 
            
         }
      }
      
      //Print month name and year
      System.out.printf("%s %d\n", date1.getMonthName(), year);
      //Print days of the week
      System.out.printf("%4s %3s %3s %3s %3s %3s %5s",
          "S", "M", "Tu", "W", "Th", "F", "Sa\n\n");
          
      //Print the array that contains the days of the month    
      for(int j=0; j<dateAry[0].length;j++){
         for(int k=0; k<dateAry.length; k++){
            if(dateAry[j][k]==0)
               System.out.printf("%4s", blank);
            else 
               System.out.printf("%4d", dateAry[j][k]);
         }
         System.out.println();
      }
   
   }
}
