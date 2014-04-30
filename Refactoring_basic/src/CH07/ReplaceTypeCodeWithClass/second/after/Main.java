package CH07.ReplaceTypeCodeWithClass.second.after;

public class Main {
	public static void main(String[] arrgs){
		Item book = new Item(ItemType.BOOK
				, "세계의 역사"
				, 4800);
		
		Item dvd = new Item(ItemType.DVD
				, "뉴욕의 꿈, 특별판,"
				, 3000);
		
		Item soft = new Item(ItemType.SOFTWARE
				, "튜링머신 에뮬레이터"
				, 3200);
		
		System.out.println("book = " + book);
		System.out.println("dvd  = " + dvd);
		System.out.println("soft = " + soft);
	}
}
