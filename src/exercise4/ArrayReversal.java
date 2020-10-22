package exercise4;

import java.util.Scanner;

public class ArrayReversal {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    char[] array = new char[arrSize];
    char[] reversedArray = new char[arrSize];

    int count = input.nextInt();
    String[] name = new String[count];
    for (char i=name.length-1; i>=0; i--){
    name[i] = input.next();
    
    }
   String numbersAsString= Arrays.toString(name);
   System.out.println("Reversed symbols: "+numbersAsString);
 }
} 