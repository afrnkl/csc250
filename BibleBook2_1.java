package csc250hw;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class BibleBook2_1 
{

	public static void main(String[] args)
	{
		ArrayList<BibleBook> BibleBooksArray =  new ArrayList<BibleBook>();
		try
		{
			Scanner sc = new Scanner(new File(System.getProperty("user.dir")+("/src/BibleBooks.dat")));
			
			while (sc.hasNextLine())
			{
				String[] fields = sc.nextLine().split(": ");
				
				BibleBook book = new BibleBook(fields[0],fields[2],Integer.parseInt(fields[1]));
				BibleBooksArray.add(book);
			}
			
			 for (BibleBook biblebooks : BibleBooksArray) 
			 {
		        System.out.println(biblebooks.toString());
			 }
		}
		catch(Exception e)
		{
		System.err.println(e.toString());
		
		}
		
	}	
	}
