import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number :");
        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int i=1;
        while(i < x/2){
            if(x % i == 0){
                count++;
            }
            i++;
        }

        if(count == 1){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
