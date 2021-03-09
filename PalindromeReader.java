/** 
Name: Caitlin Harris
Date: 5/1/2019
/Title:/ PalindromeReader.java
Description: This program...
   1. Opens a file to read
   2. Counts the number of palindromes
   3. Sorts all the words in the file into two output files(output1.txt and output2.txt)
   4. output1.txt includes all of the words beginning with a through m
   5. output2.txt includes all of the remaining words
**/


import java.io.*;
import java.util.*;

public class PalindromeReader{
   public static void main(String [] args){
   
   //Create ReadFile object
      ReadFile rf = new ReadFile();
   
   //Save filename
      String filename = "inputFile.txt";
   
      try{
         //Create String array for files lines
         String [] lines = rf.readLines(filename);
         //String ArrayList to check for palindromes
         ArrayList<String> al = new ArrayList<String>();
         //Count of palindromes
         int count = 0;
      
         //Search array for palindromes
         for(String line : lines)
         {
            String reverse = new StringBuffer(line).reverse().toString();
            if(line.equals(reverse))
               if(line.matches("[a-zA-Z]+")){
                  count++;
               }
                  
            al.add(line);
           
         }
         
         //Sort ArrayList
         Collections.sort(al);
         //Create objects for file writing
         FileWriter fr1 = new FileWriter("output1.txt");
         FileWriter fr2 = new FileWriter("output2.txt");
         
         //Sort ArrayList into output files
         for(String i : al){
            if((i.charAt(0)>='a' && i.charAt(0)<='m')||(i.charAt(0)>='A' && i.charAt(0)<='M'))
            {
               fr1.write(i);
               fr1.write("\r\n");
            
            }
            else
            {
               fr2.write(i);
               fr2.write("\r\n");
            }
         }
         //Close files
         fr1.close();
         fr2.close();
         
         //Print the number of palindromes in the file
         System.out.print("The number of palindromes in the file: " + count);
      
      }
      
      catch (IOException e)
      {
         //Print error message if file cannot be opened/read/was not found
         System.out.print("Unable to open: "+ filename);
      }
   
   }
}


class ReadFile{
   //method to read lines from file
   public String[] readLines(String filename) throws IOException{
      //Create fileReader/bufferedReader objects
      FileReader fileReader = new FileReader(filename);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      //Create String HashSet
      HashSet<String> set = new HashSet<String>();
      String line = null;
      
      while((line = bufferedReader.readLine()) != null)
      {
         String temp[]=line.split(" ");
      
         for(String i : temp)
            set.add(i);
      }
      
      bufferedReader.close();
      
      return (String[]) set.toArray(new String[set.size()]);
   }
}