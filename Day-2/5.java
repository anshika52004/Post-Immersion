import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p(n);
	}
	
	public static void p(int n) {
		if (n==0) {
			return;
		}
		p(n-1);
		System.out.print(n + " ");
		p(n-1);
	}

}


// function return 2^n-1

//output:
//	
//(1) outputs 1
//(2) outputs 1 2 1
//(3) outputs 1 2 1 3 1 2 1 
//(4) outputs 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1