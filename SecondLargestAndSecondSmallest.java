public class SecondLargestAndSecondSmallest {
	public static void main(String[] args) {
		int[] a= {111,13,25,9,34,1};
		int secLargest=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		int secSmallest=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secLargest=max;
				max=a[i];
			}else if(a[i]>secLargest) {
				secLargest=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				secSmallest=min;
				min=a[i];
			}else if(a[i]>secSmallest) {
				secSmallest=a[i];
			}
		}
		System.out.println(secLargest+" "+secSmallest);
	}
}
