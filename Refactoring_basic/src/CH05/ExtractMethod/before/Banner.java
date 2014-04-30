package CH05.ExtractMethod.before;

public class Banner {
	private final String _content;
	public Banner(String content){
		_content = content;
	}
	
	public void print(int times){
		//Print border
		System.out.print("+");
		for (int i = 0; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		//Print content
		for (int i = 0; i < times; i++) {
			System.out.println("|" + _content + "|");
		}
		
		//Print border
		System.out.print("+");
		for (int i = 0; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
