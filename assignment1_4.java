package csc250hw;

import java.util.Scanner;
public class assignment1_4 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a binary number: ");
		long bin=s.nextLong();
		
		long decimal=0;
		
		int i=0;
		
		String z="";
		
		while(bin>0)
		{
			decimal=decimal+(long)(Math.pow(2,i)*(long)(bin%10));
			bin=bin/10;
			i++;
		
		}
		
		while(decimal>0) 
		{
		 long j=decimal%16;
		 if(j==10)
		 {
			 z="A"+z;
		 }
		 else if(j==11)
		 {
			 z="B"+z;
		 }
		 else if(j==12)
		 {
			 z="C"+z;
		 }
		 else if(j==13)
		 {
			 z="D"+z;
		 }
		 else if(j==14)
		 {
			 z="E"+z;
		 }
		 else if(j==15)
		 {
			 
			 z="F"+z;
		 }
		 else
		 {
			 z=j+z;
		 }
		 decimal=decimal/16;
		 }
System.out.println("The respective Hexadecimal number is: "+z);
	}	
}

