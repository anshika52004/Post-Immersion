public class four {
	public static void main(String[] args) {
		System.out.println(g(2,7));

	}

	public static int g(int x, int y) {
		if (x==y) {
			return x*y;
		}
		return g(x, (x+y)/2) + g((x+y)/2+1,y);
	}

}
