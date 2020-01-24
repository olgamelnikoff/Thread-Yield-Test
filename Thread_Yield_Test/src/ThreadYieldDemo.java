
public class ThreadYieldDemo {
	public static void main (String [] args) {
		X variable1 = new X(0);
		variable1.start();
		Y variable2 = new Y(0);
		variable2.start();
	}
}
