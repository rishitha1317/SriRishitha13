import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int x=a[0];
		int c=1;
		for(int i=1;i<a.length;i++) {
			if(x==a[i]) {
				c++;
			}
			else {
				c--;
			}
			if(c==0) {
				x=a[i];
				c=1;
			}
		}
		c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				c++;
			}
		}
		if(c>a.length/2) {
			System.out.println(x+" ");
		}
		else {
			System.out.println("no majority");
		}
	}
}
