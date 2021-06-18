/**

Problem Statement:
Return an array containing prime numbers whose product is x
Examples:
primeFactorization( 6 ) == [2,3]
primeFactorization( 5 ) == [5]
                primeFactorization( 12 ) == [2,2,3]
Signature:
             public static ArrayList<Integer> primeFactorization(int x) {
              }
Test Cases- Input: 6
                     Output:[2,3]

**/
import java.util.*;
class PrimeFactorization
{
  
public static ArrayList<Integer> primeFactorization(int x) 
{
  ArrayList<Integer> result = new ArrayList<>();
  
  for(int i=2;i<=x;i++)
  {
    boolean isPrime = true;
    for(Integer toCheck : result)
    {
      if(i%toCheck==0)
      {
         isPrime=false;
      }
    }
    if(isPrime)
    {
      result.add(i);
    }
  }
  return result;
}
   
  
  
  public static void main(String[] args)
  {
    primeFactorization(10).stream().forEach(System.out::println);
  }
}