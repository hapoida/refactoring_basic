package CH07.ReplaceTypeCodeWithClass.second.after;

public class Main {
	public static void main(String[] arrgs){
		Item book = new Item(ItemType.BOOK
				, "������ ����"
				, 4800);
		
		Item dvd = new Item(ItemType.DVD
				, "������ ��, Ư����,"
				, 3000);
		
		Item soft = new Item(ItemType.SOFTWARE
				, "Ʃ���ӽ� ���ķ�����"
				, 3200);
		
		System.out.println("book = " + book);
		System.out.println("dvd  = " + dvd);
		System.out.println("soft = " + soft);
	}
}
