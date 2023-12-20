package basic.stringConcatenation;

//join(): feature of java8/syntax: String.join("",var1,var2)/argument,seprator,string
public class JoinMethodofJava8 {
public static void main(String[] args) {
	String a = new String("Abhishek");
	String b = new String("Aryan");
	String d = String.join(" ", a,b);
	System.out.println(d.toString());
	
}
}
