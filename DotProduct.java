/**

Problem Statement-
                             Given two arrays of integers, returns the dot product of the arrays.
Signature:
                              long dotProduct( int[] array1, int array2[] ){
                              }  
Test Cases:           INPUT:
               array1 = [1, 2];
                               array2 = [2, 3]; 
                               OUTPUT: hint {1*2+2*3}
                               Result =[8]   

**/
import java.util.*;
class DotProduct
{
  
  /**
   * compute dot prduct of two input arrays
  **/
 static long dotProduct(int[] array1,int[] array2)
 {
   // Verify if both arrays have two elements each
   if(array1.length!=2 || array2.length!=2)
   {
     System.out.println("Invalid input");
     return  -1;
   }
   return (array1[0]*array2[0])+(array1[1]*array2[1]); 
 }
   
  
  
  public static void main(String[] args)
  {
    System.out.println(dotProduct(new int[]{1,2},new int[]{2,3}));
  }
}
