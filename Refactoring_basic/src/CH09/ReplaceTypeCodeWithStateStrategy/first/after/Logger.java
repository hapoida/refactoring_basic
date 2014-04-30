package CH09.ReplaceTypeCodeWithStateStrategy.first.after;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private State _state;
	public Logger(){
		_state = new StateStopped();
	}
	
	public int get_state() {
		return _state.getTypeCode();
	}
	
	public void set_state(State _state) {
		this._state = _state;
	}

	public void start(){
		switch(get_state()){
			case STATE_STOPPED:
				System.out.println("** START LOGGING **");
				set_state(new StateLogging());
				break;
			case STATE_LOGGING:
				/* Do nothing */
				break;
			default:
				System.out.println("Invalid state: " + get_state());
		}
	}
	
	public void stop(){
		switch (get_state()) {
		case STATE_STOPPED:
			/* Do nothing */
			break;
		case STATE_LOGGING:
			System.out.println("** STOP LOGGING **");
			set_state(new StateStopped());
			break;
		default:
			System.out.println("Invalid state: " + get_state());
		}
	}
	
	public void log(String info){
		switch (get_state()) {
		case STATE_STOPPED:
			System.out.println("Ignoring: " + info);
			break;
		case STATE_LOGGING:
			System.out.println("Logging: " + info);
			break;
		default:
			System.out.println("Invalid state: " + get_state());
		}
	}
	
}
