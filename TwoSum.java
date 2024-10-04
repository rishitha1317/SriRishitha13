public class TwoSum {
	public static void main(String[] args) {
				int[] arr= {2,7,11,15};
				int l=0,r=arr.length-1;
				int target=9;
				while(l<r) {
					if(target==arr[l]+arr[r]) {
						System.out.println(l+" "+r);
						l++;
						r--;
					}
					else if(arr[l]+arr[r]>target) {
						r--;
					}
					else {
						l++;
					}
				}
	}
}
