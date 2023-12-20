package basic.stringConcatenation;

//concatenation: form new String with the help of multiple string
//2 ways: 1. using +(concatenation operator), 2. using concate() method

public class Concatenation {
public static void main(String[] args) {
	//using +(concatenation operator)
	String a = "Abhishek";
	String b = "Aryan";
	System.out.println(a+" "+b);
	//using concate() method
	String d = "Abhishek ";
	String e = d.concat("Aryan");
	System.out.println(e);
}
}
