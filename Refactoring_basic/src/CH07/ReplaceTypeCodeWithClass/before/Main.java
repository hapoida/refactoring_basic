package CH07.ReplaceTypeCodeWithClass.before;

public class Main {
	public static void main(String[] arrgs){
		Item book = new Item(Item.TYPECODE_BOOK
				, "������ ����"
				, 4800);
		
		Item dvd = new Item(Item.TYPECODE_DVD
				, "������ ��, Ư����,"
				, 3000);
		
		Item soft = new Item(Item.TYPECODE_SOFTWARE
				, "Ʃ���ӽ� ���ķ�����"
				, 3200);
		
		System.out.println("book = " + book);
		System.out.println("dvd  = " + dvd);
		System.out.println("soft = " + soft);
	}
}
