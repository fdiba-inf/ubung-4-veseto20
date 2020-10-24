package exercise4;

import java.util.Scanner;

public class MinIndex {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a count: ");
    int count = input.nextInt();
    int index=0;
    int indexmin=0;
    double[] numbers = new double[count];
    for(int i=0; i<numbers.length; i++){
    numbers[i] = input.nextDouble();
    }
    double minn = numbers[0];

    for(int min = 0; min < numbers.length; min++) {

      if(minn > numbers[min]) {

         indexmin = min;
        minn = numbers[min];
   
  }
  
}
System.out.println("Min index:" + indexmin);
}
}  