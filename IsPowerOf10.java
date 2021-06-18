/**

Problem Statement-
                              Returns true if x is a power-of-10. Otherwise returns false.
Signature:
                               bool isPowerOf10(int x){
                                }
Test Cases:
                               INPUT:
                               Input1: 3
                               Output1: false

**/
class IsPowerOf10
{
  
static boolean isPowerOf10(int x)
{
  if(x==10)
  {
    return true;
  }
  if(x%10!=0 || x==0)
  {
    return false;
  }
  return isPowerOf10(x/10);
}
   
  
  
  public static void main(String[] args)
  {
    System.out.println(isPowerOf10(3));
    System.out.println(isPowerOf10(100));
  }
}