package basic.compare;

//compareto: core values, return integer , values will be eual, greater or smaller tham 1st
//if values are 0: equals, +ve: graeter, -:smaller
//if we compare numbers in str , it ret: 0,1,-1
public interface CompareToMethod {
	public static void main(String[] args) {
		String a = "Abhishek";
		String b = "Aryan";
		String d = "Abhishek";
		
		String a1 = "1123";
		String b1 = "111";
		String d1 = "1123";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(d));
		System.out.println(b.compareTo(a));
		
		System.out.println(a1.compareTo(b1));
		System.out.println(a1.compareTo(d1));
		System.out.println(b1.compareTo(a1));
	}

}
