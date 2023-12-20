package basic.compare;

//EqualsIgnoreCase: uc/lc does't matter/content will be same
public class EqualsIgnoreCase {
	public static void main(String[] args) {
		String a = "Abhishek";
		String a2 = "ABHIshek";
		String b = "Aryan";
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(a2));
	}

}
