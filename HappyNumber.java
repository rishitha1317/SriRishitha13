public class HappyNumber {
	public static void main(String[] args) {
				int n=19;
				int r;
				while(n>9) {
					int sum=0;
					while(n>0) {
						r=n%10;
						sum=sum+(r*r);
						n=n/10;
					}
					n=sum;
				}
				if(n==1||n==7) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
	}
}
