public class RemoveDuplicates {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		int[] a= {1,1,2,3,4,5,5};
		while(j<a.length) {
			if(a[i]!=a[j]) {
				a[i+1]=a[j];
				i++;
			}else {
				j++;
			}
		}
		for(int l=0;l<=i;l++) {
			System.out.print(a[l]+" ");
		}
	}
}
