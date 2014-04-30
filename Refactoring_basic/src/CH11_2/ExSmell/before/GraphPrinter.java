package CH11_2.ExSmell.before;

public class GraphPrinter extends Printer{

	@Override
	public void println(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.printf(" (%d)", n);
		System.out.println();		
	}

}
