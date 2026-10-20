import java.util.Scanner;

public class LargestFrom3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.println("Enter 2st Number :");
        int b = sc.nextInt();
        System.out.println("Enter 3st Number :");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a +" is greater");
        }
        else if(b > a && b > c){
            System.out.println(b +" is greater");
        }
        else if(c > a && c > b){
            System.out.println(c +" is greater");
        }
        else if(a == b && c > a){
            System.out.println(c +" is greater");
        }
        else if(a > c){
            System.out.println(a +" is greater");
        }
        else if(a == c && b > a){
            System.out.println(b +" is greater");
        }
        else if(a == b && b == c){
            System.out.println("All are equal");
        }
    }
}
