public class FirstAndLastPosition {
	public static void main(String[] args) {
		int a[]= {5,7,7,8,8,10};
		int k=8;
		int first=-1;
		int last=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				if(first==-1) {
					first=i;
				}
				last=i;
			}
		}
		System.out.println(first+"  "+last);
	}
}
