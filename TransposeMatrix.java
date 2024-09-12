import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		int transpose[][]=new int[m][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				transpose[i][j]=a[j][i];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(transpose[i][j]);
			}
			System.out.println(" ");
		}
	}
}
