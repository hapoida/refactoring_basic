package CH10.ReplaceErrorCodeWithExcption.first.after;

import java.util.HashMap;
import java.util.Map;

public class Command {

	public static final Command FORWARD     = new Command("forward");
	public static final Command BACKWARD    = new Command("backward");
	public static final Command TURN_RIGHT  = new Command("right");
	public static final Command TURN_LEFT   = new Command("left");
	public static final Map<String, Command> _commandNamMap = new HashMap<String, Command>();
	private String _name;
	
	static{
		_commandNamMap.put(FORWARD._name,   FORWARD);
		_commandNamMap.put(BACKWARD._name,  BACKWARD);
		_commandNamMap.put(TURN_RIGHT._name,TURN_RIGHT);
		_commandNamMap.put(TURN_LEFT._name, TURN_LEFT);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public Command(String name) {
		_name = name;
	}

	public static Command parseCommand(String name) throws InvalidCommandException {
		if(!_commandNamMap.containsKey(name)){
			throw new InvalidCommandException(name);
		}
		return _commandNamMap.get(name);
	}

}
