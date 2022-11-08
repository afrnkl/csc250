package csc250hw;

public class BibleBook
{

	private String name;
	private String summary;
	private int nochapters;
	
	
	public BibleBook(String name, String summary, int nochapters)
	{
		this.name = name;
		this.summary = summary;
		this.nochapters = nochapters;	
	}
	public 	String toString()
	{
		return "Book Name: " + name + " " + "(" +  nochapters + " chapters) "  + "- " + summary;
	}
	public String getName()
	{
		return name;
	}
	public String getSummary()
	{
		return summary;
	}
	public int getNochapters()
	{
		return nochapters;
	}
	public static void main(String[] args) 
	{
		BibleBook book1 = new BibleBook("Romans","Paul's letter to the Romans",16);
		System.out.println(book1);
		BibleBook book2 = new BibleBook("Acts","Spread of Christianity",28);
		System.out.println(book2);
		BibleBook book3 = new BibleBook ("Revelation","Prophecy of Christ's return",21);
		System.out.println(book3);
	}
}
