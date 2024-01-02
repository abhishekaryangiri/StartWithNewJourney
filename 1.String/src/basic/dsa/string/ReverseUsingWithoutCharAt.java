package basic.dsa.string;

public class ReverseUsingWithoutCharAt {
public static void main(String[] args) {
	String str = "ABHI SHEK ARY ANA MITA";
	char[] con = str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(con[i]);
	}
}
}
