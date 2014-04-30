package CH11_1.ReplaceContructWitFactoryMethod.second.after;

public class Main {
	public static void main(String[] args) {
		Shape line      = Shape.createLine(0, 0, 100, 200);
		Shape rectangle = Shape.createRectangle(0, 0, 100, 200);
		Shape oval      = Shape.createOval(0, 0, 100, 200);
		
		Shape[] shape = {
				line,
				rectangle,
				oval
		};
		
		for (Shape s : shape) {
			s.draw();
		}
	}
}
