package csc250hw;

public class assignment1_2 
	{
		public static void main(String[] args) 
		{
			int vCount=0;
			
			String str="Romans";
					
			for(int i=0; i<str.length();i++)
			{
				if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)== 'u' ||str.charAt(i)== 'A' ||str.charAt(i)== 'E' ||str.charAt(i)== 'I' ||str.charAt(i)== 'O' ||str.charAt(i)== 'U')
				{
			      vCount++;
				}
			}
			System.out.println("Number of vowels: " +vCount);
	}
	}















