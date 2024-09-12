public class AlphaTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		char ch;
		for(int i=0;i<n;i++) {
			ch='A';
			ch+=(n-1);
			for(int j=0;j<=i;j++) {
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println(" ");
		}
	}
}
