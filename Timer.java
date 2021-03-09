/** 
Name: Caitlin Harris
Date: 3/20/2019
Title: Time.java
**/

public class Timer{

   public int num1;
   public int num2;
   public int num3;
   public int num4;

   //arg constructor
   //creates a custom Timer object with specified time
   public Timer(int n1, int n2, int n3, int n4){
      num1 = n1;
      num2 = n2;
      num3 = n3;
      num4 = n4;
   }
   
   //getter method
   //prints the first line of the analog clock
   public void row1(){
   //num1, first row
   if (num1==0 || num1==2 || num1==3 || num1==5 || num1==6 || num1==7 || num1==8 || num1==9)
      System.out.print(" -- ");
   else if(num1==1 || num1==4)
      System.out.print("    "); 
      
   //num2, first row
   if (num2==0 || num2==2 || num2==3 || num2==5 || num2==6 || num2==7 || num2==8 || num2==9)
      System.out.print("  --     ");
   else if(num2==1 || num2==4)
      System.out.print("         "); 
      
   //num3, first row
   if (num3==0 || num3==2 || num3==3 || num3==5 || num3==6 || num3==7 || num3==8 || num3==9)
      System.out.print("  -- ");
   else if(num3==1 || num3==4)
      System.out.print("     "); 
   
   //num4, first row
   if (num4==0 || num4==2 || num4==3 || num4==5 || num4==6 || num4==7 || num4==8 || num4==9)
      System.out.print("  -- ");
   else if(num4==1 || num4==4)
      System.out.print("     "); 
      
   System.out.println();
   
           
   }
  
  
  //getter method
  //prints the second line of the analog clock
   public void row2(){
    //num1, second row
   if (num1==0 || num1==4 || num1==8 || num1==9)
      System.out.print("|  |");
   else if(num1==1 || num1==2 || num1==3 || num1==7)
      System.out.print("   |");
   else if(num1==5 || num1==6)
      System.out.print("|   "); 
   
   //num2, second row
   if (num2==0 || num2==4 || num2==8 || num2==9)
      System.out.print(" |  |  - ");
   else if(num2==1 || num2==2 || num2==3 || num2==7)
      System.out.print("    |  - ");
   else if(num2==5 || num2==6)
      System.out.print(" |     - "); 
   
   //num3, second row
   if (num3==0 || num3==4 || num3==8 || num3==9)
      System.out.print(" |  |");
   else if(num3==1 || num3==2 || num3==3 || num3==7)
      System.out.print("    |");
   else if(num3==5 || num3==6)
      System.out.print("|    "); 
   
   //num4, second row
   if (num4==0 || num4==4 || num4==8 || num4==9)
      System.out.print(" |  |");
   else if(num4==1 || num4==2 || num4==3 || num4==7)
      System.out.print("    |");
   else if(num4==5 || num4==6)
      System.out.print(" |   "); 
      
   System.out.println();
   
   }
   
   //getter method
   //prints the third line of the analog clock
    public void row3(){
    //num1, third row
   if (num1==0 || num1==4 || num1==8 || num1==9)
      System.out.print("|  |");
   else if(num1==1 || num1==2 || num1==3 || num1==7)
      System.out.print("   |");
   else if(num1==5 || num1==6)
      System.out.print("|   "); 
   
   //num2, third row
   if (num2==0 || num2==4 || num2==8 || num2==9)
      System.out.print(" |  | | |");
   else if(num2==1 || num2==2 || num2==3 || num2==7)
      System.out.print("    | | |");
   else if(num2==5 || num2==6)
      System.out.print(" |    | |"); 
   
   //num3, third row
   if (num3==0 || num3==4 || num3==8 || num3==9)
      System.out.print(" |  |");
   else if(num3==1 || num3==2 || num3==3 || num3==7)
      System.out.print("    |");
   else if(num3==5 || num3==6)
      System.out.print("|    "); 
   
   //num4, third row
   if (num4==0 || num4==4 || num4==8 || num4==9)
      System.out.print(" |  |");
   else if(num4==1 || num4==2 || num4==3 || num4==7)
      System.out.print("    |");
   else if(num4==5 || num4==6)
      System.out.print(" |   "); 
      
   System.out.println();
   
   }
   
   //getter method
   //prints the fourth line of the analog clock
   public void row4(){
   //num1, fourth row
   if (num1==2 || num1==3 || num1==4 || num1==5 || num1==6 || num1==8 || num1==9)
      System.out.print(" -- ");
   else if(num1==0 || num1==1 || num1==7)
      System.out.print("    "); 
   //num2, fourth row
   if (num2==2 || num2==3 || num2==4 || num2==5 || num2==6 || num2==8 || num2==9)
      System.out.print("  --   - ");
   else if(num2==0 || num2==1 || num2==7)
      System.out.print("       - "); 
   //num3, fourth row
   if (num3==2 || num3==3 || num3==4 || num3==5 || num3==6 || num3==8 || num3==9)
      System.out.print("  -- ");
   else if(num3==0 || num3==1 || num3==7)
      System.out.print("     ");
   //num4, fourth row
   if (num4==2 || num4==3 || num4==4 || num4==5 || num4==6 || num4==8 || num4==9)
      System.out.print("  -- ");
   else if(num4==0 || num4==1 || num4==7)
      System.out.print("     ");  
      
   System.out.println();

   }
   
   //getter method
   //prints the fifth line of the analog clock
   public void row5(){
    //num1, fifth row
   if (num1==0 || num1==6 || num1==8)
      System.out.print("|  |");
   else if(num1==1 || num1==3 || num1==4 || num1==5 || num1==7 || num1==9)
      System.out.print("   |");
   else if(num1==2)
      System.out.print("|   "); 
   
   //num2, fifth row
   if (num2==0 || num2==6 || num2==8)
      System.out.print(" |  |  - ");
   else if(num2==1 || num2==3 || num2==4 || num2==5 || num2==7 || num2==9)
      System.out.print("    |  - ");
   else if(num2==2)
      System.out.print(" |     - "); 
   
   //num3, fifth row
   if (num3==0 || num3==6 || num3==8)
      System.out.print(" |  |");
   else if(num3==1 || num3==3 || num3==4 || num3==5 || num3==7 || num3==9)
      System.out.print("    |");
   else if(num3==2)
      System.out.print(" |   "); 
   
   //num4, fifth row
   if (num4==0 || num4==6 || num4==8)
      System.out.print(" |  |");
   else if(num4==1 || num4==3 || num4==4 || num4==5 || num4==7 || num4==9)
      System.out.print("    |");
   else if(num4==2)
      System.out.print(" |   "); 
      
   System.out.println();
   
   }
   
   
   //getter method
   //prints the sixth line of the analog clock
   public void row6(){
    //num1, sixth row
   if (num1==0 || num1==6 || num1==8)
      System.out.print("|  |");
   else if(num1==1 || num1==3 || num1==4 || num1==5 || num1==7 || num1==9)
      System.out.print("   |");
   else if(num1==2)
      System.out.print("|   "); 
   
   //num2, sixth row
   if (num2==0 || num2==6 || num2==8)
      System.out.print(" |  | | |");
   else if(num2==1 || num2==3 || num2==4 || num2==5 || num2==7 || num2==9)
      System.out.print("    | | |");
   else if(num2==2)
      System.out.print(" |    | |"); 
   
   //num3, sixth row
   if (num3==0 || num3==6 || num3==8)
      System.out.print(" |  |");
   else if(num3==1 || num3==3 || num3==4 || num3==5 || num3==7 || num3==9)
      System.out.print("    |");
   else if(num3==2)
      System.out.print(" |   "); 
   
   //num4, sixth row
   if (num4==0 || num4==6 || num4==8)
      System.out.print(" |  |");
   else if(num4==1 || num4==3 || num4==4 || num4==5 || num4==7 || num4==9)
      System.out.print("    |");
   else if(num4==2)
      System.out.print(" |   "); 
      
   System.out.println();
   
   }
   
   
  //getter method
  //prints the seventh line of the analog clock
   public void row7(){
   //num1, seventh row
   if (num1==0 || num1==2 || num1==3 || num1==5 || num1==6 || num1==8 || num1==9)
      System.out.print(" -- ");
   else if(num1==1 || num1==4 || num1==7)
      System.out.print("    "); 
      
   //num2, seventh row
   if (num2==0 || num2==2 || num2==3 || num2==5 || num2==6 || num2==8 || num2==9)
      System.out.print("  --     ");
   else if(num2==1 || num2==4 || num2==7)
      System.out.print("       - "); 
      
   //num3, seventh row
   if (num3==0 || num3==2 || num3==3 || num3==5 || num3==6 || num3==8 || num3==9)
      System.out.print("  -- ");
   else if(num3==1 || num3==4 || num3==7)
      System.out.print("     "); 
   
   //num4, seventh row
   if (num4==0 || num4==2 || num4==3 || num4==5 || num4==6 || num4==8 || num4==9)
      System.out.print("  -- ");
   else if(num4==1 || num4==4 || num4==7)
      System.out.print("     "); 
      
   System.out.println();
   
           
   }
   
   //getter method
   //prints the entire analog clock for object's specific time
   public void printDate(){
   row1();
   row2();
   row3();
   row4();
   row5();
   row6();
   row7();
   }
   

}