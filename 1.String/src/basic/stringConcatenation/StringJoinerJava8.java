package basic.stringConcatenation;

import java.util.StringJoiner;

//StringJoiner: having all the functionality of String.join(), in adv its accept string joiner
public class StringJoinerJava8 {
public static void main(String[] args) {
	StringJoiner a = new StringJoiner(" ");
	a.add("Abhishek");
	a.add("Aryan");
	a.add("From");
	a.add("Bettiah");
	System.out.println(a.toString());
	
}
}
