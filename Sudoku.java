/** 
Name: Caitlin Harris
Date: 2/17/2019
/Title:/ Sudoku.java
Description: This program checks a sudoku puzzle for correctness
**/

public class Sudoku {
   public static void main (String [] args){
      int [][] sudoku={{1,8,4,9,6,3,7,2,5},
                      {5,6,2,7,4,8,3,1,9},
                      {3,9,7,5,1,2,8,6,4},
                      {2,3,9,6,5,7,1,4,8},
                      {7,5,6,1,8,4,2,9,3},
                      {4,1,8,2,3,9,6,5,7},
                      {9,4,1,3,7,6,5,8,2},
                      {6,2,3,8,9,5,4,7,1},
                      {8,7,5,4,2,1,9,3,6}};
                      
      if (Checker(sudoku)==true){
      System.out.println("This matrix IS a sudoku solution");
      }
      
      else
      System.out.println("This matrix IS NOT a sudoku solution");
                          
   }
   
   public static boolean Checker(int [][] ary){
   //check rows
      for (int row=0; row<9; row++){
         for(int col=0; col<8; col++){
            for (int j=col+1; j<9; j++){
               if(ary[row][col]==ary[row][j])
                  return false;
            
            }
         }
      }
   //check columns
      for(int col=0;col<9;col++){
         for(int row=0;row<8;row++){
            for(int k=row+1; k<9; k++){
               if(ary[row][col]==ary[k][col])
                  return false;
            }
         }
      }  
   //check grids
      for(int row = 0; row < 9; row += 3){
         for(int col = 0; col < 9; col += 3){
         // check the 3 by 3 grids
            for(int p = 0; p < 8; p++){
               for(int p2 = p + 1; p2 < 9; p2++){
                  if(ary[row + p%3][col + p/3]==ary[row + p2%3][col + p2/3]){
                     return false;
                  }
               }
            }
         }
      }
   return true;
   }
}