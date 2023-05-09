
public class Multiplicar {
	public class TablaMultiply {
		public static void main(String args[]) {
			multiply();
		}

		public static void multiply() {
			for (int i = 1; i <= 10; i++) {
				for (int j = 0; j <= 12; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		}
	}
}
