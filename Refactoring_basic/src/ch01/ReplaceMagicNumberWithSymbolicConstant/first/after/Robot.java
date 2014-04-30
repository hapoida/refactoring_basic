package ch01.ReplaceMagicNumberWithSymbolicConstant.first.after;

public class Robot {
	
	public static final int COMMAND_WALK = 0;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_JUMP = 2;
	
	private final String _name;
	public Robot(String name){
		_name = name;
	}
	
	public void order(int commnad){
		if(commnad == COMMAND_WALK){
			System.out.println(_name + " walks.");
		}else if(commnad == COMMAND_STOP){
			System.out.println(_name + " stops.");
		}else if(commnad == COMMAND_JUMP){
			System.out.println(_name + " jumps.");
		}else{
			System.out.println("Command error. commnad = " + commnad);
		}
	}
}
