package CH07.ReplaceTypeCodeWithClass.first.after;

public class ItemType {
	
	private final int _typecode; 
	
	public static final ItemType BOOK 	  = new ItemType(0);
	public static final ItemType DVD 	  = new ItemType(1);
	public static final ItemType SOFTWARE = new ItemType(2);
	
	private ItemType(int typecode) {
		_typecode = typecode;
	}
	
	public int getTypeCode(){
		return _typecode;
	}
}
