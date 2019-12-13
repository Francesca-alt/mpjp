package s049;

public class MyString {
	static int compareto(String s, String t) {
		int lengthS=s.length();
		int lengthT=t.length();
		int minLength=0;
		
		if(lengthS < lengthT) {// se la lunghezza di s è minore della lunghezza di t; quantè la lunghezza min? lenghtS;
			minLength=lengthS;
		}else {
			minLength= lengthT;
	}
		for(int i=0; i< minLength; i++) {
			if(s.charAt(i)< t.charAt(i)) {
				return -1;
			} else if( s.charAt(i)> t.charAt(i)) {
				return +1;
			}
			}
		if(lengthS == lengthT) {
		return 0;
	
		
		}else if (lengthS < lengthT) {
			return -1;
		}else {
			return +1;
		}
	}
		
	public static void main(String[] args) {
		String s1 = "hello";
		String t1 = "world";

		int result = compareto(s1, t1);

		System.out.println("hello vs world,result is: " + result);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareto(s2, t2);

		System.out.println("hello vs hello,result is: " + result2);

		String s3 = "hello";
		String t3 = "hell";

		int result3 = compareto(s3, t3);

		System.out.println("hello vs hell,result is: " + result3);

	}
 }
