package csc250hw;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class BibleBook2_2 
{

	public static void main(String[] args)
	{
		ArrayList<BibleBook> BibleBooksArray =  new ArrayList<BibleBook>();
                
		try
		{
			Scanner sc = new Scanner(new File(System.getProperty("user.dir")+("/src/csc250hw/BibleBooks.dat")));
			
			while (sc.hasNextLine())
			{
				String[] fields = sc.nextLine().split(": ");
				
				BibleBook book = new BibleBook(fields[0],fields[2],Integer.parseInt(fields[1]));
				BibleBooksArray.add(book);
			}
				}
		catch(Exception e)
		{
		   System.err.println(e.toString());
		}
		
        Scanner input = new Scanner(System.in);  
        System.out.println("1. Alphabetical sort based on book name.");
        System.out.println("2. Numerical sort based on number of chapters.");
        System.out.print("Enter an option, 1 or 2, please: ");
        int option = input.nextInt();
        System.out.println();
        
       
        if (option == 1)
        {
            
            BibleBook temp;
            for(int j = 0; j < BibleBooksArray.size() - 1; j++)
            {
                for(int k = 0; k <BibleBooksArray.size() - 1; k++) 
                {
                    if (BibleBooksArray.get(k).getName().compareTo(BibleBooksArray.get(k+1).getName()) > 0){
                        temp = BibleBooksArray.get(k+1);
                        BibleBooksArray.set(k+1, BibleBooksArray.get(k));
                        BibleBooksArray.set(k, temp);
                    }
                }
            }
            System.out.println("Alphabetical sort based on book name:");
            System.out.println();
            
        }
        
        
        else{
            
            BibleBook temp;
            for(int j = 0; j < BibleBooksArray.size() - 1; j++) 
            {
                for(int k = 0; k <BibleBooksArray.size() - 1; k++) 
                {
                    if (BibleBooksArray.get(k).getNochapters() > BibleBooksArray.get(k+1).getNochapters()){
                        temp = BibleBooksArray.get(k+1);
                        BibleBooksArray.set(k+1, BibleBooksArray.get(k));
                        BibleBooksArray.set(k, temp);
                    }
                }
            }
            System.out.println("Numerical sort based on number of chapters:");
            System.out.println();
              
       }
       
    
       for (BibleBook biblebooks : BibleBooksArray){
          
           if (option==1){
               System.out.println(biblebooks.getName());
           }
           else{
               System.out.println(biblebooks.getNochapters() + "   " +biblebooks.getName());
               
           }
       } 
}	
}
