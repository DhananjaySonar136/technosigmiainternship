import java.util.Scanner;

public class Factorial {
    static int fact(int x){
        if(x == 1){
            return x;
        }

        return x * fact(x-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number :");
        int x = sc.nextInt();

        System.out.println(fact(x));
    }
}
