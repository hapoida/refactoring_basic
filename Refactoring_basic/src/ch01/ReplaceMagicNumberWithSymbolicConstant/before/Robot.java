package ch01.ReplaceMagicNumberWithSymbolicConstant.before;

public class Robot {
	private final String _name;
	public Robot(String name){
		_name = name;
	}
	
	public void order(int commnad){
		if(commnad == 0){
			System.out.println(_name + " walks.");
		}else if(commnad == 1){
			System.out.println(_name + " stops.");
		}else if(commnad == 2){
			System.out.println(_name + " jumps.");
		}else{
			System.out.println("Command error. commnad = " + commnad);
		}
	}
	
}
