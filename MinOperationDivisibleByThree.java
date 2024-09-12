public class MinOperationDivisibleByThree {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if((a[i]+1)%3==0||(a[i]-1)%3==0) {
				count++;
			}
		}
		System.out.print(count);
	}
}
