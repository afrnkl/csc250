package csc250hw;

import java.util.Scanner;

public class assignment1_3 {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int decimal = input.nextInt();
    
    String binaryString = "";
    int value = decimal; 
    while (value != 0)
    		{
    	binaryString = value%2 + binaryString;
    	value = value/2;
    		}
    System.out.println("The binary representation of " + decimal + " is " + binaryString);
	}
}
