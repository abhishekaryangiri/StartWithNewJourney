package basic.stringConcatenation;

//StringBuilder: used append() method to concate
//concate diff types like obj, stringbuilder, boolean,char,int,double,etc
//fastest way to concate string 
//muttable: update, modify
public class ConcateUsingStringBuilderClass {
public static void main(String[] args) {
	StringBuilder a = new StringBuilder("Abhishek");
	StringBuilder b = new StringBuilder(" Aryan");
	StringBuilder d = a.append(b);
	String e = d.toString();
	System.out.println(e);
	//instanceof: check data type
	System.out.println(e instanceof String);
}
}
