/**

Problem Statement-
                          Given base and integer exponent, compute value of base raised to the power of exponent.

Signature:
public static double power(double base, int exp) {
}

Test Cases:
Input: 2.0
               4
Output: 16.0

**/
class PowerOfExpo
{
  
static double powerOfExpo(double base,int exp)
{
  if(exp<0)
  {
    return -1;
  }
  if(exp==0)
  {
    return 1;
  }
  return base*powerOfExpo(base,exp-1);
}
   
  
  
  public static void main(String[] args)
  {
    System.out.println(powerOfExpo(10,4));
  }
}