/**

Problem Statement-
                        Returns square root of the given double
Signature: 
                        double squareRoot( double x ){
                        }
Test Cases:
                       Input1: 4
                       Ouput1:2
                       Input2:2
                       Output2: 1.41421  


**/
import java.util.*;
class SquareRoot
{
  
public static double squareRoot(double x) 
{
  double intialSquareRoot = x/2;
  double temp;
  while(true)
  {
    temp = intialSquareRoot;
    intialSquareRoot =(temp+(x/temp))/2;
    if(temp-intialSquareRoot==0)
    {
      break;
    }
  }
  return intialSquareRoot;
}
   
  
  
  public static void main(String[] args)
  {
    System.out.println(squareRoot(9));
  }
}