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

    for(int j=0; j < i; j++){
    System.out.println(" ");
    
   }
System.out.println(numbers[i]);
 }
}
}  