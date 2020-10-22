package exercise4;

import java.util.Scanner;

public class MaxElement {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a count: ");
    int count = input.nextInt();
    
    double[] numbers = new double[count];
    for(int i=0; i<numbers.length; i++){
    numbers[i] = input.nextDouble();
    
      }
      double max = Double.MIN_VALUE;
      for(int c = 0; c<numbers.length; c++);
      if(numbers>=0)

    
    System.out.println("Max number: " + max) ;

    }
  }
}   