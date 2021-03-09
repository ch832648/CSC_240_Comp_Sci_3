/** 
Name: Caitlin Harris
Date: 5/4/2019
Title: ExtraCredit.java
Description: This program is a guessing game between the computer and user
**/

import java.util.Random;
import java.util.Scanner;

public class ExtraCredit{
   public static void main(String [] args){
   //Total number of digits in mystery
      final int total = 4;
   //Counter for guesses
      int counter=0;
   //Random number & Scanner objects
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      
   //Array to hold computers mystery number
      int [] myNum = new int[4];
      for(int i=0; i<myNum.length; i++){
         myNum[i]=rand.nextInt(9)+1;
      }
   
      //Flags
      boolean flag = false;
      
      
   //Input number from user
      System.out.print("\nI'm thinking of a "+total+" digit number: Please try to guess my number!\n");
      System.out.print("Your guess? :\n");
      int guessNum = input.nextInt();
      //Update count of guesses
      counter++; 
   
      while(flag==false){
      
         boolean flag2 = false;
      
      //Extract digits from users guess and save in guessNum
         int [] guessAry = new int[4];
         guessAry[0]=guessNum/1000;
         guessAry[1]=(guessNum/100)%10;
         guessAry[2]=(guessNum/10)%10;
         guessAry[3]=guessNum%10;
      
      //Temporary copy of nyNum
         int temp [] = new int[myNum.length];
         for(int j=0; j<myNum.length; j++){
            temp[j]=myNum[j];
         }
      
      //Print out S
         //Counts number of correct guesses
         int zeroCount=0;
         for(int i=0; i<total; i++){
            if(guessAry[i]==temp[i]){
               System.out.print("S");
               guessAry[i]=0;
               temp[i]=0;
               zeroCount++;
               flag2=true;
            }
         }
      
      //Print out P
         for(int i=0;i<total;i++){
            for(int k=0; k<total;k++){
               if(guessAry[i] !=0){
                  if(guessAry[i]==temp[k]){
                     System.out.print("P");
                     flag2=true;
                     
                  }
               }
            }
         }
      
      //END OF GAME, if all guesses are correct
         if(zeroCount==4){
            flag=true;
            break;
            
         }
         
      //Print out F if none are right and get another guess
         if(flag2==false)
         {
            System.out.println("F");
            System.out.print("Your guess? :\n");
            guessNum = input.nextInt();
            counter++;
         }
         
         else {
            System.out.print("\nYour guess? :\n");
            guessNum = input.nextInt();
            counter++;
         }
      }
      
    //Game won, report number of guesses  
      System.out.println("\nYou got it right in "+counter+" guesses!");
   
   
   }
}