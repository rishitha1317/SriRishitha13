public class BuyAndSell {
		static void minimum(int[] a) {
			//O(n),O(n)
			int min[]=new int[a.length];
			min[0]=a[0];
			for(int i=1;i<a.length;i++) {
			    min[i]=Math.min(min[i-1],a[i]);
			}
			int profit=0;
			for(int i=0;i<a.length;i++) {
				profit=Math.max(profit,a[i]-min[i]);
			}
			System.out.println("the profit is:" +profit);
		}
		public static void main(String[] args) {
			int[]a= {7,6,4,3,1};
			minimum(a);
		}
}
