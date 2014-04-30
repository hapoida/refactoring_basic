package CH11_1.ReplaceContructWitFactoryMethod.second.after;

public class ShapeLine extends Shape {

	public ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return  "LINE";
	}

	@Override
	public void draw() {
		System.out.println("drawLine : " + this.toString());
	}

}
