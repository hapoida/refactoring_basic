package CH08.ReplaceTypeCodeWithSubclasses.first.after;

public class ShapeRectangle extends Shape {

	public ShapeRectangle(int typecode, int startx, int starty, int endx,
			int endy) {
		super(typecode, startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}

	private void drawRectangle() {
		System.out.println("drawRectangle: " + this.toString());
	}

}
