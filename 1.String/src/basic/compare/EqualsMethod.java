package basic.compare;

//equals() method:compare value of the string/compare original content of the string/ret t/f
public class EqualsMethod {
public static void main(String[] args) {
	String ab1 = "Abhishek";
	String ab2 = "Abhishek";
	String ab3 = new String("Abhishek");
	String ab4 = "Aryan";
	
	System.out.println(ab1.equals(ab2));
	System.out.println(ab1.equals(ab3));
	System.out.println(ab1.equals(ab4));
	System.out.println(ab4.equals(ab3));
}
}
