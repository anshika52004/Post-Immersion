import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(fun(a, b)); // Call the function and print the result

        
    }

    public static int fun(int a, int b){
        if (a>0 && b>0 && a+b>0){
            return a + fun(a-2, b-2) + b;
        }
        return a^b;
    }
}