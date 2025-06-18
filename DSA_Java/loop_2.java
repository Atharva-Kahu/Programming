
import java.util.*;

public class loop_2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // First line is the number of entries
        int q = scanner.nextInt();

        // Process n triplets
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int result = a;
            for(int j = 0; j < n; j++){
                result += (int)(Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();

        }

        scanner.close();
        
        
    
    
}

}
