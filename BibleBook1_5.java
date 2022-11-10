package csc250hw;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class BibleBook1_5 {

	public static void main(String[] args)
	{
		ArrayList<String> BibleBooksArray =  new ArrayList<String>();
		try
		{
			Scanner sc = new Scanner(new File(System.getProperty("user.dir")+("/src/BibleBooks.dat")));
			
			while (sc.hasNextLine())
			{
				BibleBooksArray.add(sc.nextLine());
			}
			 String[] array
	            = BibleBooksArray.toArray(new String[0]);
			 for (String eachString : array) 
		        System.out.println(eachString);
		}
		catch(Exception e)
		{
		System.err.println(e.toString());
		
		}
		
	}	
	}
