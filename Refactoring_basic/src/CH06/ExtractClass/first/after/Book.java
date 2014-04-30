package CH06.ExtractClass.first.after;

import CH06.ExtractClass.second.after.ImmutableAuthor;

public class Book {
	private String _title;
	private String _isbn;
	private String _price;
	private Author _author;
	
	public Book(String title, String isbn, String price, String authorName, String authorMail){
		_title 	= title;
		_isbn 	= isbn;
		_price 	= price;
		_author = new Author(authorName, authorMail);
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return _title;
	}
	public String getIsbn() {
		return _isbn;
	}
	public String getPrice() {
		return _price;
	}
	
	public String toXml(){
		String author = tag("author", tag("name", _author.getName()) + tag("mail", _author.getMail()));
		String book = tag("book", tag("title", _title) + tag("isbn", _isbn)+ tag("price", _price)+ author);
		return book;
	}
	
	private String tag(String element, String content){
		return "<"+element+">"+content+"</"+element+">";
	}
	
	class Author implements ImmutableAuthor{
		private String _name;
		private String _mail;
		
		public Author(String name, String mail){
			_name = name;
			_mail = mail;
		}
		
		public String getName(){return _name;}
		public String getMail(){return _mail;}
	}

	public ImmutableAuthor getAhhor() {
		return _author;
		
	}
	
}
