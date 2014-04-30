package CH11_1.ReplaceContructWitFactoryMethod.before;

public class Main {
	public static void main(String[] args) {
		Shape line = new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200);
		Shape rectangle = new Shape(Shape.TYPECODE_RECTANGLE, 0, 0, 100, 200);
		Shape oval = new Shape(Shape.TYPECODE_OVAL, 0, 0, 100, 200);
		
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
