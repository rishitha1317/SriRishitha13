import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a, 0, n / 2); 
        for (int i = 0; i < n / 4; i++) { 
            int temp = a[i];
            a[i] = a[n / 2 - 1 - i];
            a[n / 2 - 1 - i] = temp;
        }
        Arrays.sort(a, n / 2, n); 
        for (int num : a) {
            System.out.println(num);
        }
        s.close(); 
    }
}
