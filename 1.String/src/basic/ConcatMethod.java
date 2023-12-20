package basic;

public class ConcatMethod {
public static void main(String[] args) {
	String myName = "Abhishek";
	//myName.concat("Aryan");//it append the string at the end, it will not added bcz str is issumatble we cant modify
	String myName1 = myName.concat(" Aryan");
	myName = myName.concat(" Aryan");
	System.out.println(myName1  );
	System.out.println(myName);
}
}
