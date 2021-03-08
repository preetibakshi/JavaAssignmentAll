package array;

import java.util.Random;
import java.util.Scanner;

//Take input  from user for number of unique car number to generate
//Take format of card number to be MH{Random4digits}: MH3459
//Make sure number generated are not duplicate
public class ArrayQ1 {
    public static void main(String[] args) {
        //int number;
        System.out.println("Enter car number after MH{4digit} e.g. 1234");
        System.out.println();
        //Scanner scanner = new Scanner(System.in);
        //number=scanner.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        Random rnum = new Random();
        int newnumber= rnum.nextInt(number);


        System.out.println("Car Random number MH"+newnumber);

        System.out.println();




    }



}
