import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		int arr[]=new int [10];
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<=n;i++) {
			arr[i]=s.nextInt();
		}
		for(i=n;i>=0;i--) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();	
	}
}
