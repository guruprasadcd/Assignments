package demo;

public class Library {
	
	
	//created an method with input arguments 
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return  bookTitle;
	}
	
	//created another method to print 
	public void issuebook()
	{
		System.out.println("Book issued successfully");
		
	}
	
	
	//called both the method 
	public static void main(String[] args) {
		{
			Library obj=new Library();
			obj.addBook(null);
			obj.issuebook();
			
		}
	}

}