/**

Problem Statement:
Implement the method that provided numerator and denominator will return a string representing fraction's decimal form.
                Some fractions in decimal form have cyclic decimal points.
Problem Statement:
Implement the method that provided numerator and denominator will return a string representing fraction's decimal form.
                Some fractions in decimal form have cyclic decimal points.


**/
import java.util.*;
class VulgarToDecimal
{
  
public static String vulgarToDecimal(Long numerator, Long denominator) 
{
  String result="";
  
  long quotient =numerator/denominator;
  result = quotient+".";
  long reminder = (numerator%denominator)*10;
  
  Map<Long,Integer> remPos = new HashMap<>();
  while(reminder!=0)
  {
    if(remPos.get(reminder)!=null)
    {
      int index = remPos.get(reminder);
      result = result.substring(0,index)+"("+result.substring(index)+")";
      return result;
    }
    quotient = reminder/denominator;
    result=result+ quotient;
    remPos.put(quotient,result.length()-1);
    reminder=(reminder%denominator)*10;
    
  }
  
  return result;
}
   
  
  
  public static void main(String[] args)
  {
    System.out.println(vulgarToDecimal(4l,7l));
  }
}