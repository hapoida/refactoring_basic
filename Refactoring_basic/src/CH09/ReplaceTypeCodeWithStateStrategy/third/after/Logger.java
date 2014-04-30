package CH09.ReplaceTypeCodeWithStateStrategy.third.after;

public class Logger {
	
	private enum State {
		STATE_STOPPED{
			@Override public void start(){
				System.out.println("** START LOGGING");
			}

			@Override
			public void stop() {
				/* Do noting*/
			}

			@Override
			public void log(String info) {
				System.out.println("Ignoring : " + info);
			}
		},
		STATE_LOGGING {
			@Override
			public void start() {
				/* Do noting*/
			}

			@Override
			public void stop() {
				System.out.println("** STOP LOGGING");
				
			}

			@Override
			public void log(String info) {
				System.out.println("Logging : " + info);
			}
		}
		;
		
		public abstract void start();
		public abstract void stop();
		public abstract void log(String info);
	}
	
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private State _state;
	public Logger(){
		_state = State.STATE_STOPPED;
	}
	
	public State get_state() {
		return _state;
	}
	
	public void set_state(State state) {
		this._state = state;
	}

	public void start(){
		_state.start();
		set_state(State.STATE_LOGGING);
	}
	
	public void stop(){
		_state.stop();
		set_state(State.STATE_STOPPED);
	}
	
	public void log(String info){
		_state.log(info);
	}
	
}
