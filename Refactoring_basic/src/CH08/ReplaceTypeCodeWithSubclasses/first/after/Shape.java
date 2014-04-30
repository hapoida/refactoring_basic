package CH08.ReplaceTypeCodeWithSubclasses.first.after;

public abstract class Shape {
	public static final int TYPECODE_LINE 		= 0;
	public static final int TYPECODE_RECTANGLE 	= 1;
	public static final int TYPECODE_OVAL 		= 2;
	
	private final int _typecode;
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	public Shape(int typecode, int startx, int starty, int endx, int endy){
		_typecode = typecode;
		_startx   = startx;
		_starty   = starty;
		_endx 	  = endx;
		_endy 	  = endy;
	}
	
	public static Shape createShape(int typecode, int startx, int starty, int endx, int endy){
		switch (typecode) {
		case TYPECODE_LINE:
			return new ShapeLine(typecode, startx, starty, endx, endy);
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(typecode, startx, starty, endx, endy);
		case TYPECODE_OVAL:
			return new ShapeOval(typecode, startx, starty, endx, endy);
		default:
			throw new IllegalArgumentException("typecode = " + typecode);
		}
	}
	
	public abstract int getTypeCode();
	
	public abstract String getName();
	
	public abstract void draw();
	
	public String toString(){
		return "[ " 
				+ getName() + ", "
				+ "("+ _startx +", "+ _starty + ") -"
				+ "("+ _endx +", "+ _endy + ") ]";
	}
}
