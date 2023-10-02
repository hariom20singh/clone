import java.util.*;
public class Main{
   //main method
   public static void main(String args[]){
      //declared an integer variable and initialized the value
      int originalNumber = 21;
      //print the given input number
      System.out.println("Given number:"+originalNumber);
      //keep a copy of original number
      int copyOfOriginalNumber = originalNumber;
      //initialize sum as 0
      int sum = 0;
      //Find sum of all digits of the number
      //continue the loop till the number is greater than 0
      while(originalNumber > 0){
         //get the rightmost digit of the number by using % operator
         int rem = originalNumber%10;
         //add the digit(rem) to sum
         sum = sum + rem;
         //remove the rightmost digit from number and get the updated number
         originalNumber = originalNumber/10;
      }
      //printing the result
      if(copyOfOriginalNumber % sum == 0)
         System.out.println(copyOfOriginalNumber+" is a niven number");
      else
         System.out.println(copyOfOriginalNumber+" is not a niven number");
   }
}
