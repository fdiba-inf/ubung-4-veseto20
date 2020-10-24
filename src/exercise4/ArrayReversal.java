package exercise4;

import java.util.Scanner;

public class ArrayReversal {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char[] array = new char[n];
    System.out.println("Original array: ");
      String name=input.next();

    for(int k = array.length-1; k>=0; k--){
      String b = input.next();
      array[k] = b.charAt(0);
    System.out.print("Reversed array: " + array[k] + " ");
    
    }
    

   


 }
} 