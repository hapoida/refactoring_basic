package ch01.ReplaceMagicNumberWithSymbolicConstant.second.after;

public class Robot {
	
	public enum Command{
		WALK,
		STOP,
		JUMP,
	};
	
	private final String _name;
	public Robot(String name){
		_name = name;
	}
	
	public void order(Command commnad){
		if(commnad == Command.WALK){
			System.out.println(_name + " walks.");
		}else if(commnad == Command.STOP){
			System.out.println(_name + " stops.");
		}else if(commnad == Command.JUMP){
			System.out.println(_name + " jumps.");
		}else{
			System.out.println("Command error. commnad = " + commnad);
		}
	}
}
