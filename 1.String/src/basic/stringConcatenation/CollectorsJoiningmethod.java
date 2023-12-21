package basic.stringConcatenation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collectors.joining(): Collectors class  concate using joining() method of input
public class CollectorsJoiningmethod {
public static void main(String[] args) {
	List<String> a = Arrays.asList("Abhishek", "Aryan", "from", "Bettiah");//list of dtr arr
	String b = a.stream().collect(Collectors.joining(" "));//joining operation
	System.out.println(b);
	System.out.println(b instanceof String);
}
}
