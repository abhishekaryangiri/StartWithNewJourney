package basic.dsa.string;

public class ReverseUsingForLoop {
public static void main(String[] args) {
	String str = "ABHISHEK";
	String revStr = "";
	for(int i=0;i<str.length();i++) {
		revStr =str.charAt(i)+revStr;
	}
	System.out.println(revStr);
}
}
