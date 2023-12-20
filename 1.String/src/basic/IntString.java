package basic;

public class IntString {
public static void main(String[] args) {
	int a = 1,b=2,c=3;
	
	// String.valueOf method
	String  print = String.valueOf(a);
	String  print2 = String.valueOf(b);
	String  print3 = String.valueOf(c);
	
	//empty String method
	String es = ""+ a;
	String es2 = ""+ b;
	String es3 = ""+c;
	
	// Integer.toString method
	String its = Integer.toString(a);
	String its2 = Integer.toString(b);
	String its3 = Integer.toString(c);
	
System.out.println(print+" "+print2+" "+print3);
System.out.println(es+es2+es3);
System.out.println(its+its2+its3);
}
}
