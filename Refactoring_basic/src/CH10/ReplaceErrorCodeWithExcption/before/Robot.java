package CH10.ReplaceErrorCodeWithExcption.before;

import java.util.StringTokenizer;

public class Robot {
	private final String _name;
	private final Position _position = new Position(0,0);
	private final Direction _direction = new Direction(0,1); 
	
	public Robot(String name){
		_name = name;
	}
	
	public void execute(String commandSequence){
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(!executeCommand(token)){
				System.out.println("Invalid command:" + token);
				break;
			}
			
		}
	}

	private boolean executeCommand(String commandString) {
		Command command = Command.parseCommand(commandString);
		if(command == null){
			return false;
		}
		return executeCommand(command);
	}

	private boolean executeCommand(Command command) {
		if(command == Command.FORWARD){
			
		} else if (command == Command.BACKWARD){
			
		} else if (command == Command.TURN_RIGHT){
			
		} else if (command == Command.TURN_LEFT){
			
		} else {
			return false;
		}
		return true;
	}
	
	public String toString(){
		return "[ Robot: " + _name + " "
				+ "position(" + _position._x + ", " + _position._y + "), "
				+ "direction(" + _direction._x + ", " + _direction._y + "), ]";
	}
			
}
