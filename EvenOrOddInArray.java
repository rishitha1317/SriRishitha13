import java.util.Scanner;
public class evenoddarray {
	public static void main(String[] args) {
		System.out.println("enter size of tha array:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int m=a.length;
		for(int i=0;i<m;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("even");
		for(int i=0;i<m;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("odd");
		for(int i=0;i<m;i++) {
		 if(a[i]%2!=0) {
				System.out.println(a[i]+" ");
			}
		}
	}
}
