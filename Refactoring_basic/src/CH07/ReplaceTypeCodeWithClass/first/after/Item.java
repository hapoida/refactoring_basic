package CH07.ReplaceTypeCodeWithClass.first.after;

public class Item {
	public static final int TYPECODE_BOOK 	  = ItemType.BOOK.getTypeCode();
	public static final int TYPECODE_DVD 	  = ItemType.DVD.getTypeCode();
	public static final int TYPECODE_SOFTWARE = ItemType.SOFTWARE.getTypeCode();
	
	private final ItemType	_typecode;
	private final String 	_title;
	private final int 	 	_price;
	
	public Item(ItemType typecode, String title, int price){
		_typecode 	= typecode;
		_title		= title;
		_price 		= price;
	}

	public int getTypecode() {
		return _typecode.getTypeCode();
	}

	public String getTitle() {
		return _title;
	}

	public int getPrice() {
		return _price;
	}
	
	@Override
	public String toString(){
		return "[" + getTypecode() + ", "
				+ getTitle() + ", "
				+ getPrice() + "]";
	}
}
