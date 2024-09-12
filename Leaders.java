import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Leaders {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int max=a[a.length-1];
		System.out.print(max+" ");
		List<Integer> list=new ArrayList<>();
		list.add(max);
		for(int i=a.length-2;i>0;i--) {
			if(a[i]>max) {
				max=a[i];
				System.out.print(max+" ");
				list.add(max);
			}
		}
		System.out.println();
		Collections.reverse(list);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			a[i]=list.get(i);
		}
	}
}
