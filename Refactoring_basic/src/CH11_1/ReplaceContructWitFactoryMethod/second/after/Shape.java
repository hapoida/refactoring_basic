package CH11_1.ReplaceContructWitFactoryMethod.second.after;

public abstract class Shape {
	
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	public static Shape createLine(int startx, int starty, int endx, int endy){
		return new ShapeLine(startx, starty, endx, endy);
	}
	
	public static Shape createRectangle(int startx, int starty, int endx, int endy){
		return new ShapeRectangle(startx, starty, endx, endy);
	}
	
	public static Shape createOval(int startx, int starty, int endx, int endy){
		return new ShapeOval(startx, starty, endx, endy);
	}
	
	protected Shape(int startx, int starty, int endx, int endy) {
		_startx   = startx;
		_starty   = starty;
		_endx     = endx;
		_endy     = endy;
	}
	
	public abstract String getName();
	
	public abstract void draw();
	
	public String toString(){
		return "[ "
				+ getName() + " , "
				+ "(" + _startx + " , " + _starty + ")-"
				+ "(" + _endx 	+ " , " + _endy   + ") ]";
	}
	
	private void drawLine() {
		System.out.println("drawLine : " + this.toString());
		
	}

	private void drawRectangle() {
		System.out.println("drawRectangle : " + this.toString());
		
	}

	private void drawOval() {
		System.out.println("drawOval : " + this.toString());
		
	}
	
	
	
}
