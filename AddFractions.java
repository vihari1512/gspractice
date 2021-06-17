/**
Problem Statement- 
    Given two fractions passed in as int arrays,
     returns the fraction which is result of adding the two input fractions
     Fraction is represented as a two-element array - [ numerator, denominator ]
                     The returned fraction has to be in its simplest form.
Signature:
                      int[] addFractions ( int[] fraction1, int[] fraction2 ){
                       }
Test Cases: 
INPUT:           
fraction1 - [2, 3];
fraction2 - [1, 2];
OUTPUT: Hint-  {2/3 +1/2}
result = [7,6]

**/
class AddFractions
{
  
  static int[] addFractions(int[] fraction1,int[] fraction2)
  {
    //check if 
    if(fraction1.length!=2 || fraction2.length!=2 
       || fraction1[1]==0 || fraction2[1]==0)
    {
      System.out.println("Please verify your input and try again");
      return new int[]{};
    }
    
    // there is a possibility of integer overflow but not handling as of
    //assuming multiplication falls in limits 
    int numerator = fraction1[0]* fraction2[1]+ fraction1[1]*fraction2[0];
    int denominator = fraction1[1]*fraction2[1];
    return new int[]{numerator,denominator};
    
  }
  
  public static void main(String[] args)
  {
    int result[]=addFractions(new int[]{2,3},new int[]{1,2});
    for(int i : result)
    {
      System.out.print(i+" ");
    }
  }
}