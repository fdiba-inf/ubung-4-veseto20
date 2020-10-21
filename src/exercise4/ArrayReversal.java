package exercise4;

import java.util.Scanner;

public class ArrayReversal {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int count = input.nextInt();
    char[] text = new char[count];
    for (int i=text.length-1; i>=0; i--);
    text[i] = input.next.charAt(0);
    System.out.println("Reversed symbols: " + text[i]);
  }
}