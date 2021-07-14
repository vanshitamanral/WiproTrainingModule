package OOPS;

class book {
	private String name;
	private String author;
	private double price;
	private int gtyInStock;
	
	book(String n, String a)
	{
		name=n;
		author=a;
		//price=p;
		//gtyInStock=g;
	}
	
	String getName()
	{
		return name;
	}
	
	 public void getAuthor()
	 {
	    System.out.println("The name of the author is :"+Author.name);
	    System.out.println("The email id is :"+Author.email);
	    System.out.println("The gender is :"+Author.gender);
	 }
	
	double getPrice()
	{
		return price;
	}
	void setPrice(double p)
	{
		this.price=p;
	}
	int getOtyInStock()
	{
		return gtyInStock;
	}
	void setgetOtyInStock(int g)
	{
		this.gtyInStock=g;
	}
	
	
}
public class Author {
	public static String name;
	public static String email;
	public static char gender;
	
	Author(String n, String e, char g)
	{
		name= n;
		email=e;
		gender=g;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a= new Author("vanss","18xcc@emial.com", 'f');
		book b=new book("The Sky is Pink", a.name);
		b.setPrice(500);
		b.setgetOtyInStock(350);
		System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getOtyInStock());
        b.getAuthor();
	}

}
