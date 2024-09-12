public class IsSubsequence {
	public static void main(String[] args) {
		int count=0;
		int l=0;
		int r=0;
		String t="ahbgdc";
		String s="abc";
		while(l<t.length()&&r<s.length()) {
			if(s.charAt(r)==(t.charAt(l))) {
				count++;
				r++;
			}
			l++;
		}
		if(count>=s.length()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
