/**

Add Fraction
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