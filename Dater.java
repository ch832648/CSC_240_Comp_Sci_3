/** 
Name: Caitlin Harris
Date: 3/18/2019
Title: Dater.java
**/

public class Dater{
   public int year;
   public int month;
   public int day;
   
   //arg constructor
   //creates a custom Dater object with specified month and year
   public Dater(int m, int y){
      month=m;
      year=y;
   }
   
   //getter method
   //returns the name of the object's month
   public String getMonthName(){
      switch (month){
         case 1: 
            return "January";
         case 2: 
            return "February";
         case 3: 
            return "March";
         case 4: 
            return "April";
         case 5: 
            return "May";
         case 6: 
            return "June";     
         case 7: 
            return "July";
         case 8: 
            return "August";
         case 9: 
            return "September";
         case 10: 
            return "October";
         case 11: 
            return "November";
         case 12: 
            return "December";
      }
      return "invalid month";
   }
   
   //getter method
   //returns the number of days in object's month
   public int numDay(){
      if((month == 4)||(month == 6)||(month == 9)||(month == 11)){
         return 30;
      }
      else if(isLeapYear()){
         return 29; 
      }
      else if(month == 2){
         return 28;
      }
      else {
         return 31;
      }
   }
   
   //checker method
   //checks whether an object's year is a Leap Year
   public boolean isLeapYear(){
      if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
         return true;
      else 
         return false;
   }
   
   //getter method
   //uses zeller's formula
   //returns the numeric index of the first day of an object's specfic month
   public int zellersFormula(int month, int year){
    if (month == 1) 
        { 
            month = 13; 
            year--; 
        } 
        if (month == 2) 
        { 
            month = 14; 
            year--; 
        } 
        int q = 1; 
        int m = month; 
        int k = year % 100; 
        int j = year / 100; 
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j; 
        h = h % 7; 
   
     switch (h) 
        { 
            case 0 : return 7; //Saturday 
            case 1 : return 0; //Sunday 
            case 2 : return 1; //Monday  
            case 3 : return 2; //Tuesday 
            case 4 : return 3; //Wednesday 
            case 5 : return 4; //Thursday
            case 6 : return 5; //Friday 
        }
   return -1;
   
   }
   
   
}
/*
31 DAY MONTHS:          30 DAY MONTHS:          FEBRUARY:
   January (1)          April (4)               28 days in a common year
   March (3)            June (6)                29 days in a leap year
   May (5)              September (9)
   July(7)              November (11)
   August (8)
   October (10)
   December (12)
*/