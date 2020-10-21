package exercise4;

import java.util.Scanner;

public class ArrayInput {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  System.out.println("Enter a counter: ");
   int count = input.nextInt();

   int[] numbers = new int[count];
   for (int i=0; i<numbers.length; i++){
   numbers[i] = input.nextInt();
   System.out.println("Numbers: " + numbers[i]);

   }
 }
}