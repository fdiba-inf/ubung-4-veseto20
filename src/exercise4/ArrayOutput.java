package exercise4;

import java.util.Scanner;

public class ArrayOutput {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a count: ");
    int count = input.nextInt();

    int[] numbers = new int[count];
    for(int i=0; i<numbers.length; i++){
    numbers[i] = input.nextInt();
    System.out.println("" + numbers[0]);
    System.out.println(" " + numbers[1]);
    System.out.println("  " + numbers[2]);
    System.out.println("   " + numbers[3]);
     System.out.println("    " + numbers[4]);
   }
 }
}  