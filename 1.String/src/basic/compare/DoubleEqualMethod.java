package basic.compare;

//== method: comp refrences not values
public class DoubleEqualMethod {
public static void main(String[] args) {
	String a1 = "Abhishek";
	String a2 = "Abhishek";
	String a3 = new String("Abhishek");
	String a4 = "Aryan";
	
	System.out.println(a1==a2);
	System.out.println(a1==a3);//false bcz s3 created in stack
	System.out.println(a1==a4);
	System.out.println(a3==a4);
}
}
