package CH04.IntorduceNullObject.first.after;

public class NullLabel extends Label{

	public NullLabel() {
		super("(none)");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNull(){
		return true;
	}
	
	@Override
	public void display(){
		
	}
}
