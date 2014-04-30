package CH11_2.ExSmell.first.after;

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
