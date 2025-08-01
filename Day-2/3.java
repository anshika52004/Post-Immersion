public class three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(f(5,3));

	}

	public static int f(int x, int y) {
		if (y==0 || y==x) {
			return 1;
		}
		return f(x-1,y) + f(x-1, y-1);
	}
}