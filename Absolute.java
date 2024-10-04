import java.util.Scanner;
public class absolute {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[5];
		int m=a.length;
		for(int i=0;i<m-1;i++) {
			a[i]=s.nextInt();
		}
		int min=a[0],max=a[0];
		for(int i=0;i<m-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println();
		System.out.println(min);
		System.out.println(max);
		int abs=min-max;
		System.out.println(+abs);
	}
}
