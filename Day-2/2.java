import java.util.*;
public class digit_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));

	}
	public static int sum(int n) {
//		int sum=0;
//		
//		while (n!=0) {
//			int a = n%10;
//			sum+=a;
//			n = n/10;
//		}
//		
//		return sum;
		
		if (n==0) {
			return n;
		}
		
		return (n%10) + sum(n/10);
	}
}